package main

import java.net.URL

var pom = URL("https://raw.githubusercontent.com/scijava/pom-scijava/master/pom.xml").readText().lines()
    .filter { it.isNotEmpty() && it.isNotBlank() } // condense

val versions = mutableMapOf<String, String>().also { m ->
    pom.dropWhile { it != "\t<properties>" }.takeWhile { it != "\t</properties>" }.filter { it.endsWith(".version>") }
        .forEach {
            val key = it.substringAfter('<').substringBefore(".version>")
            var value = it.value
            if (value[0] == '$') { // ${imagej2.version}
                val v = value.drop(2).dropLast(".version}".length)
                value = m.getOrElse(v) { searchPomBase(v) }
            }
            m[key] = value
        }
}

fun searchPomBase(value: String): String {
    val url = URL("https://raw.githubusercontent.com/scijava/pom-scijava-base/master/pom.xml")
    val line = url.readText().lines().first { "$value.version" in it }
    return line.value
}

val lines: List<String> = pom.dropWhile { it != "\t\t<dependencies>" }.takeWhile { it != "\t\t</dependencies>" }
    .filter { !it.endsWith("dependency>") && !it.endsWith(".version}</version>") }

val p = intArrayOf(1) // https://youtrack.jetbrains.com/issue/KT-49239

class Dep(val comment: String,
          val group: String,
          val art: String) {
    val gav = "$group.$art.${versions["$group.$art"]}"
}

val dependencies = mutableMapOf("misc" to ArrayList<Dep>())

val String.value get() = substringAfter('>').substringBefore('<')
val String.isComment get() = startsWith("\t\t\t<!-- ")
val String.comment get() = substringAfter("<!-- ").substringBefore(" -->")
val String.isGroupId get() = startsWith("\t\t\t\t<groupId>")
fun groupId(string: String) = "\t\t\t\t<groupId>$string</groupId>"
fun artifactId(string: String) = "\t\t\t\t<artifactId>$string</artifactId>"

fun initDeps() {
        while (p[0] in lines.indices) {
            var line = lines[p[0]]
            when (line.comment) {
                "SciJava - https://github.com/scijava" -> parse("org.scijava")
                "ImageJ - https://github.com/imagej" -> parse("net.imagej")
                "ImgLib2 - https://github.com/imglib" -> parse("net.imglib2")
                "SCIFIO - https://github.com/scifio" -> parse("io.scif", "scifio")
                "Fiji - https://github.com/fiji" -> parseFiji()
                "BigDataViewer - https://github.com/bigdataviewer" -> parse2("bigdataviewer", "sc.fiji")
                "TrakEM2 - https://github.com/trakem2" -> parse2("trakem2", "sc.fiji")
                "N5 - https://github.com/saalfeldlab/n5" -> parse2("n5", "net.imglib2", "org.janelia.saalfeldlab")
                "BoneJ2 - https://github.com/bonej-org/BoneJ2" -> parse2("org.bonej")
                "Open Microscopy Environment - https://github.com/ome" -> parse("org.openmicroscopy", "ome")
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
                "Google HTTP Client Library for Java - https://github.com/googleapis/google-http-java-client" -> parse2("googleHttpClient", "com.google.http-client")
                "Jackson - https://github.com/FasterXML/jackson" -> parse2("jackson", "com.fasterxml.jackson.core", "com.fasterxml.jackson.dataformat")
                "Java 3D - https://github.com/scijava/java3d-core" -> parse2("java3d", "org.scijava")
                "Jetty - http://eclipse.org/jetty/" -> parse2("org.eclipse.jetty")
                "JGraphT - https://github.com/jgrapht/jgrapht" -> parse2("org.jgrapht")
                "JOGL - https://jogamp.org/jogl/" -> parse2("jogl", "org.jogamp.gluegen", "org.jogamp.joal", "org.jogamp.jocl", "org.jogamp.jogl")
                "Kotlin - https://kotlinlang.org/" -> parse2("org.jetbrains.kotlin")
                "Logback - http://logback.qos.ch/" -> parse2("ch.qos.logback")
                "MigLayout - http://www.miglayout.com/" -> parse2("com.miglayout")
                "RSyntaxTextArea - http://bobbylight.github.io/RSyntaxTextArea/" -> parse2("rSyntaxTextArea", "com.fifesoft")
                "SLF4J - http://slf4j.org/" -> parse2("org.slf4j")
                "TensorFlow - https://www.tensorflow.org/" -> parse2("org.tensorflow")
                "JUnit 5 - https://junit.org/junit5/" -> parse2("junit5","org.junit.jupiter", "org.junit.vintage")
                "JMH - http://openjdk.java.net/projects/code-tools/jmh/" -> parse2("org.openjdk.jmh")
                else -> {
                    var comment = ""
                    while (line.isComment) {
                        comment = line.substringAfter("\t\t\t")
                        line = lines[++p[0]]
                    }
                    val group = line.value
                    val art = lines[++p[0]].value
                    dependencies["misc"]!! += Dep(comment, group, art)
                    while (!lines[p[0]].isComment && !lines[p[0]].isGroupId)
                        p[0]++
                }
            }
        }
    }

fun parse(group: String, name: String = group.split('.')[1], mainComment: Boolean = true) {
    if (!mainComment) p[0]--
    while (p[0]++ in lines.indices)
        if (lines[p[0]].isComment)
            if (name in lines[p[0]]) {
                val comment = lines[p[0]++].substringAfter("<!-- ").substringBefore(" -->")
                check(lines[p[0]++] == groupId(group))
                val art = lines[p[0]].value
                dependencies.getOrPut(name) { ArrayList() } += Dep(comment, group, art)
            } else break
}

fun parse2(group: String) = parse2(group.substringAfterLast('.'), group)

fun parse2(name: String, vararg groups: String) {
    p[0]++
    while (p[0] in lines.indices && !lines[p[0]].isComment) {
        if (lines[p[0]].isGroupId) {
            var group = ""
            for (g in groups) if (g == lines[p[0]].value) {
                group = g; break; }
            //        val group = groups.first { it == lines[p[0]++].value } TODO
            val art = lines[++p[0]].value
            dependencies.getOrPut(name) { ArrayList() } += Dep("", group, art)
        }
        p[0]++
    }
}

fun parseFiji() {
    val comment = "<!-- Fiji - https://github.com/fiji/fiji -->"
    check(lines[++p[0]] == "\t\t\t$comment")
    val group = "sc.fiji"
    check(lines[++p[0]] == groupId(group))
    val name = "fiji"
    check(lines[++p[0]] == artifactId(name))
    dependencies[name] = arrayListOf(Dep(comment, group, name))
    check(lines[++p[0]] == "\t\t\t<!-- Standard Fiji projects -->")
    while (p[0]++ in lines.indices)
        if (lines[p[0]].isComment)
            break
        else {
            val g = lines[p[0]++].value
            check(g == group || g == "org.janelia")
            val art = when (val a = lines[p[0]].value) {
                "3D_Objects_Counter", "3D_Viewer" -> "ImageJ_$a"
                else -> if (a[0].isDigit()) "Fiji_$a" else a
            }
            dependencies[name]!! += Dep("", g, art)
        }
}