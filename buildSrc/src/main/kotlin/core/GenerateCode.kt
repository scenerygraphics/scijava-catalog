package core

import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import org.scijava.util.POM
import org.scijava.util.XML
import java.io.File


abstract class GenerateCode : DefaultTask() {

    init {
        group = "build"
        description = "Generate Scijava catalog"
    }

    @get:OutputDirectory
    val targetDir: DirectoryProperty = project.objects.directoryProperty()
        .convention(project.layout.buildDirectory.dir("generated"))

    @TaskAction
    fun generate() {
        val elements = POM(project.rootDir.resolve("eff.xml"))
            .elements("//project/dependencyManagement/dependencies/dependency")

        File(targetDir.get().asFile, "catalog.kt").apply {
            parentFile.mkdirs()
            writeText(buildString {
                appendLine("""
                        import org.gradle.api.initialization.resolve.MutableVersionCatalogContainer

                        fun MutableVersionCatalogContainer.addGeneratedCatalog() {
                        """.trimIndent()
                )
                elements.forEach {
                    val g = XML.cdata(it, "groupId")
                    val a = XML.cdata(it, "artifactId")
                    val v = XML.cdata(it, "version")
                    appendLine("""    maybeCreate("$g").library("$a", "$g:$a:$v")""")
                }
                appendLine('}')
            })
        }

//        initVersions()
//
//        initDeps()
//
//        for ((key, deps) in dependencies) {
//
//            File(targetDir.get().asFile, "catalogs/$key.kt").apply {
//
//                parentFile.mkdirs()
//                val text = buildString {
//                    appendLine("""
//                        package catalogs
//
//                        import org.gradle.api.initialization.resolve.MutableVersionCatalogContainer
//
//                        fun MutableVersionCatalogContainer.$key() {
//
//                            create("$key").apply {
//                        """.trimIndent())
//
//                    for (dep in deps) {
//                        if (dep.comment.isNotEmpty())
//                            appendLine("        // ${dep.comment}")
//                        appendLine("        library(\"${dep.art.toLowerCase()}\", \"${dep.gav}\")")
//                    }
//                    val prefix = "bundle(\"$key\", listOf("
//                    val separator = ",\n${" ".repeat(8 + prefix.length)}"
//                    appendLine("        $prefix${deps.joinToString(separator) { "\"${it.art.toLowerCase()}\"" }}))")
//
//                    appendLine("""
//                    }
//                }""".trimIndent())
//                }
//
//                writeText(text)
//            }
//        }
    }
}