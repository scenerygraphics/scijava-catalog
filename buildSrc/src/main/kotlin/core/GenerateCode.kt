package core

import org.gradle.api.DefaultTask
import org.gradle.api.file.Directory
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.ProjectLayout
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import org.scijava.util.POM
import org.scijava.util.XML
import java.io.File
import java.util.Stack
import javax.inject.Inject


abstract class GenerateCode : DefaultTask() {

    init {
        group = "build"
        description = "Generate Scijava catalog"
    }

    @get:Inject
    abstract val layout: ProjectLayout

    @get:OutputDirectory
    val targetDir: Directory
        get() = layout.projectDirectory.dir("src/generated")

    @TaskAction
    fun generate() {
        val elements = POM(project.rootDir.resolve("eff.xml"))
            .elements("//project/dependencyManagement/dependencies/dependency")

        File(targetDir.asFile, "catalog.kt").apply {
            parentFile.mkdirs()
            writeText(buildString {
                appendLine("""
                        import org.gradle.api.initialization.resolve.MutableVersionCatalogContainer

                        fun MutableVersionCatalogContainer.addGeneratedCatalog() {
                        """.trimIndent()
                )
                var last = ""
                val aliases = Stack<String>()
                fun bundle() {
                    if (last.isNotEmpty()) {
                        appendLine("""        bundle("bundle", listOf("${aliases.pop()}"${if (aliases.isEmpty()) "))" else ','}""")
                        while (aliases.isNotEmpty())
                            appendLine("""                                "${aliases.pop()}"${if (aliases.isEmpty()) "))" else ','}""")
                        appendLine("    }")
                    }
                }
                elements.forEach {
                    val g = XML.cdata(it, "groupId")
                    val a = XML.cdata(it, "artifactId")
                    val v = XML.cdata(it, "version")
                    if (g != last) {
                        bundle()
                        appendLine("""    create("$g").apply {""")
                    }
                    appendLine("""        library("$a", "$g:$a:$v")""")
                    aliases += a
                    last = g
                }
                bundle()
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