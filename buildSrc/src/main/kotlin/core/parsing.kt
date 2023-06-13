package core

import java.net.URL

val release = "35.1.1"

val pom = URL("https://raw.githubusercontent.com/scijava/pom-scijava/pom-scijava-$release/pom.xml").readText().lines()
        .filter { it.isNotEmpty() && it.isNotBlank() } // condense

val pomBase = run {
    val version = pom.first { it.startsWith("\t\t<version>") }.value
    URL("https://raw.githubusercontent.com/scijava/pom-scijava-base/pom-scijava-base-$version/pom.xml").readText().lines()
            .filter { it.isNotEmpty() && it.isNotBlank() } // condense
}

val versions = mutableMapOf<String, String>()

fun String.searchPomBase(): String = pomBase.first { "$value.version" in it }.value

val lines: List<String> = pom.dropWhile { it != "\t\t<dependencies>" }.takeWhile { it != "\t\t</dependencies>" }
        .filter { !it.endsWith("dependency>") && !it.endsWith(".version}</version>") }

var p = 1

val line: String
    get() = lines[p]

val nextLine: String
    get() = lines[++p]

val consumeLine: String
    get() = lines[p++]

class Dep(val comment: String, val group: String, val art: String) {
    val gav: String
        get() = "$group:$art:${versions[art]}"
}

val dependencies = mutableMapOf("misc" to ArrayList<Dep>())

val String.value get() = substringAfter('>').substringBefore('<')
val String.isComment get() = startsWith("\t\t\t<!-- ")
val String.comment get() = substringAfter("<!-- ").substringBefore(" -->")
val String.isGroupId get() = startsWith("\t\t\t\t<groupId>")
val String.withoutComment get() = when {
    endsWith("-->") -> substringBefore(" <!--")
    else -> this
}
fun groupId(string: String) = "\t\t\t\t<groupId>$string</groupId>"
fun artifactId(string: String) = "\t\t\t\t<artifactId>$string</artifactId>"

fun initVersions() {
     // we are forced to cache them first since it can happen `x.version`s get resolved later on, ie `org.bytedeco.javacpp.version`
        pom.dropWhile { it != "\t<properties>" }.takeWhile { it != "\t</properties>" }
                .filter { it.withoutComment.trimEnd().endsWith(".version>") }
                .associateByTo(versions, { it.substringAfter('<').substringBefore(".version>") }, { it.value })
        for ((k, v) in versions)
            if ('$' in v) // ie: `2.3.1-${org.bytedeco.javacpp.version}`
                versions[k] = v.resolve()
}

fun String.resolve(): String {
    val key = substringAfter("\${").substringBefore(".version}") // `2.3.1-${org.bytedeco.javacpp.version}`
    val value = versions[key] ?: key.searchPomBase()
    return when {
        '$' in value -> value.resolve()
        else -> value
    }
}

fun initDeps() {
    while (p in lines.indices) {
        var linea = line
        when (linea.comment) {
            "SciJava - https://github.com/scijava" -> parse("org.scijava")
            "ImageJ - https://github.com/imagej" -> parse("net.imagej")
            "ImgLib2 - https://github.com/imglib" -> parse("net.imglib2")
            "SCIFIO - https://github.com/scifio" -> parse("io.scif", "scifio")
            "Fiji - https://github.com/fiji" -> parseFiji()
            "BigDataViewer - https://github.com/bigdataviewer" -> parse2("bigdataviewer", "sc.fiji")
            "TrakEM2 - https://github.com/trakem2" -> parse2("trakem2", "sc.fiji")
            "N5 - https://github.com/saalfeldlab/n5" -> parse2("n5", "net.imglib2", "org.janelia.saalfeldlab")
//            "BoneJ2 - https://github.com/bonej-org/BoneJ2" -> parse2("org.bonej") // removed
//            "Open Microscopy Environment - https://github.com/ome" -> parse("org.openmicroscopy", "ome") // empty
            "Bio-Formats - https://github.com/ome/bioformats" -> parse2("bioformats", "ome")
            "OMERO Blitz - https://github.com/ome/omero-blitz" -> parse("org.openmicroscopy", "omero", mainComment = false)
            "Apache Groovy - https://groovy-lang.org/" -> parse2("org.codehaus.groovy")
            "Apache Maven - https://maven.apache.org/" -> parse2("maven", "org.apache.maven.shared", "org.apache.maven", "org.apache.maven.plugin-tools", "org.sonatype.sisu")
            "Apache HTTPComponents - https://hc.apache.org/" -> parse2("org.apache.httpcomponents")
            "Batik - https://xmlgraphics.apache.org/batik/" -> parse2("batik", "org.apache.xmlgraphics")
            "Commons Lang - https://commons.apache.org/proper/commons-lang/" -> parse2("commonsLang", "commons-lang", "org.apache.commons")
            "Eclipse Collections - https://www.eclipse.org/collections/" -> parse2("eclipseCollections", "org.eclipse.collections")
            "Eclipse SWT - https://www.eclipse.org/swt/" -> parse2("eclipseSwt", "org.eclipse.swt")
            "Google Cloud Storage - https://github.com/googleapis/google-cloud-java" -> parse2("googleCloud", "com.google.cloud")
            "Google HTTP Client - https://github.com/googleapis/google-http-java-client" -> parse2("googleHttpClient", "com.google.http-client")
            "Jackson - https://github.com/FasterXML/jackson" -> parse2("jackson", "com.fasterxml.jackson.core", "com.fasterxml.jackson.dataformat")
            "Java 3D - https://github.com/scijava/java3d-core" -> parse2("java3d", "org.scijava")
            "Jetty - https://www.eclipse.org/jetty/" -> parse2("org.eclipse.jetty")
            "JGraphT - https://github.com/jgrapht/jgrapht" -> parse2("org.jgrapht")
            "JogAmp - https://jogamp.org/" -> parse2("jogl", "org.jogamp.gluegen", "org.jogamp.joal", "org.jogamp.jocl", "org.jogamp.jogl")
            "Kotlin - https://kotlinlang.org/" -> parse2("org.jetbrains.kotlin")
            "Logback - https://logback.qos.ch/" -> parse2("ch.qos.logback")
            "MigLayout - https://www.miglayout.com/" -> parse2("com.miglayout")
            "RSyntaxTextArea - https://bobbylight.github.io/RSyntaxTextArea/" -> parse2("rSyntaxTextArea", "com.fifesoft")
            "SLF4J - https://www.slf4j.org/" -> parse2("org.slf4j")
            "TensorFlow - https://www.tensorflow.org/" -> parse2("org.tensorflow")
            "JUnit 5 - https://junit.org/junit5/" -> parse2("junit5", "org.junit.jupiter", "org.junit.vintage")
            "JMH - https://openjdk.java.net/projects/code-tools/jmh/" -> parse2("org.openjdk.jmh")
            else -> {
                var comment = ""
                while (linea.isComment) {
                    comment = linea.substringAfter("\t\t\t")
                    linea = nextLine
                }
                val group = linea.value
                var art = nextLine.value
                if (art.endsWith('_'))
                    art = art.dropLast(1)
                val misc = dependencies["misc"]!!
                // avoid duplication with artifact names ending with `_`
                if (misc.none { it.group == group && it.art == art })
                    misc += Dep(comment, group, art)
                while (!line.isComment && !line.isGroupId)
                    if (++p == lines.lastIndex)
                        return
            }
        }
    }
}

fun parse(group: String, name: String = group.split('.')[1], mainComment: Boolean = true) {
    if (!mainComment) p--
    while (p++ in lines.indices)
        if (line.isComment)
            if (name in line) {
                val comment = consumeLine.comment
                check(consumeLine == groupId(group))
                val art = line.value
                dependencies.getOrPut(name) { ArrayList() } += Dep(comment, group, art)
            } else break
}

fun parse2(group: String) = parse2(group.substringAfterLast('.'), group)

fun parse2(name: String, vararg groups: String) {
    p++
    while (p in lines.indices && !line.isComment) {
        if (line.isGroupId) {
            var group = ""
            for (g in groups)
                if (g == line.value) {
                    group = g
                    break
                }
            //        val group = groups.first { it == lines[p[0]++].value } TODO
            val art = nextLine.value
            dependencies.getOrPut(name) { ArrayList() } += Dep("", group, art)
        }
        p++
    }
}

fun parseFiji() {
    val comment = "<!-- Fiji - https://github.com/fiji/fiji -->"
    check(nextLine == "\t\t\t$comment")
    val group = "sc.fiji"
    check(nextLine == groupId(group))
    val name = "fiji"
    check(nextLine == artifactId(name))
    dependencies[name] = arrayListOf(Dep(comment, group, name))
    check(nextLine == "\t\t\t<!-- Standard Fiji projects -->")
    while (p++ in lines.indices)
        if (line.isComment)
            break
        else {
            val g = consumeLine.value
            check(g == group || g == "org.janelia")
            val art = when (val a = line.value) {
                "3D_Objects_Counter", "3D_Viewer" -> "ImageJ_$a"
                else -> if (a[0].isDigit()) "Fiji_$a" else a
            }
            dependencies[name]!! += Dep("", g, art)
        }
}