package core

import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Nested
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
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

        initDeps()

        for((key, deps) in dependencies) {

            File(targetDir.get().asFile, "catalogs/$key.kt").apply {

                parentFile.mkdirs()
                val text = buildString {
                    appendLine("""
                        package catalogs

                        import org.gradle.api.initialization.resolve.MutableVersionCatalogContainer

                        fun MutableVersionCatalogContainer.$key() {

                            create("$key").apply {
                        """.trimIndent())

                    for (dep in deps) {
                        if (dep.comment.isNotEmpty())
                            appendLine("        // ${dep.comment}")
                        appendLine("        library(\"${dep.art}\", \"${dep.gav}\")")
                    }
                    val prefix = "bundle(\"$key\", listOf("
                    val separator = ",\n${" ".repeat(8 + prefix.length)}"
                    appendLine("        $prefix${deps.joinToString(separator) { "\"${it.gav}\""}}))")

                    appendLine("""
                    }
                }""".trimIndent())
                }

                writeText(text)
            }
        }
    }
}