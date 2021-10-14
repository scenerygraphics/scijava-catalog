package main

import com.google.devtools.ksp.processing.*
import com.google.devtools.ksp.symbol.*
import java.net.URL

var processed = false

class Dep(val comment: String,
          val group: String,
          val art: String,
          val vers: String)

class FunctionProcessor(private val codeGenerator: CodeGenerator,
                        private val logger: KSPLogger,
                        private val options: Map<String, String>) : SymbolProcessor {

    override fun process(resolver: Resolver): List<KSAnnotated> {

        if (!processed) {

            processed = true

            codeGenerator.createNewFile(dependencies = Dependencies(false),
                                        packageName = "catalog",
                                        fileName = "sciJava").use {

                it.write(sciJava)
            }
        }
        return emptyList()
    }

    val sciJava
        get() = buildString {
            appendLine("""
                package catalog
                
                import org.gradle.api.initialization.resolve.MutableVersionCatalogContainer
                
                fun MutableVersionCatalogContainer.addSciJava() {
                
                    create("sciJava").apply {
                    
                    """.trimIndent())

            dep
            //            pom.lines.dropWhile { it != "\t\t\t<!-- SciJava - https://github.com/scijava -->" }

            appendLine("""
                    }
                }""".trimIndent())
        }.toByteArray()
}

var pom = URL("https://raw.githubusercontent.com/scijava/pom-scijava/master/pom.xml").readText().lines()
    .filter { it.isNotEmpty() && it.isNotBlank() } // condense

val versions = mutableMapOf<String, String>().also { m ->
    pom.dropWhile { it != "\t<properties>" }.takeWhile { it != "\t</properties>" }.filter { it.endsWith(".version>") }
        .forEach {
            val key = it.substringAfter('<').substringBefore(".version>")
            var value = it.substringAfter('>').substringBefore('<')
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
    return line.substringAfter('>').substringBefore('<')
}

val lines: List<String> = pom.dropWhile { it != "\t\t<dependencies>" }.takeWhile { it != "\t\t</dependencies>" }
    .filter { !it.endsWith("dependency>") && !it.endsWith(".version}</version>") }

var p = 1

val deps = mutableMapOf<String, ArrayList<Dep>>()

val dep: List<Dep>
    get() {
        while (p in lines.indices)
            when (lines[p]) {
                "\t\t\t<!-- SciJava - https://github.com/scijava -->" -> {
                    parse("org.scijava")
                }
                "\t\t\t<!-- ImageJ - https://github.com/imagej -->" -> {
                    parse("net.imagej")
                }
                "\t\t\t<!-- ImgLib2 - https://github.com/imglib -->" -> {
                    parse("net.imglib2")
                }
                else -> p++
            }
        TODO()
    }

fun parse(group: String): Int {
    val name = group.split('.')[1]
    while (p in lines.indices)
        if (lines[p].startsWith("\t\t\t<!--"))
            if (name in lines[p]) {
                val comment = lines[p++].substringAfter("<!--").substringBefore("-->")
                check(lines[p++] == "\t\t\t\t<groupId>$group</groupId>")
                val art = lines[p++].substringAfter('>').substringBefore('<')
                deps.getOrPut(name) { ArrayList() } += Dep(comment, group, art, versions.remove(art)!!)
            } else break
        else p++
    return p
}