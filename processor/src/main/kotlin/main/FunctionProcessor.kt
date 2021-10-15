package main

import com.google.devtools.ksp.processing.*
import com.google.devtools.ksp.symbol.*

var processed = false

class FunctionProcessor(private val codeGenerator: CodeGenerator,
                        private val logger: KSPLogger,
                        private val options: Map<String, String>) : SymbolProcessor {

    override fun process(resolver: Resolver): List<KSAnnotated> {

        if (!processed) {

            processed = true

            initDeps()

            for((key, deps) in dependencies) {


                codeGenerator.createNewFile(dependencies = Dependencies(false),
                                            packageName = "catalogs",
                                            fileName = key).use {

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
                            appendLine("        alias(\"${dep.art}\").to(\"${dep.gav}\")")
                        }

                        appendLine("""
                    }
                }""".trimIndent())
                    }.toByteArray()

                    it.write(text)
                }
            }
        }
        return emptyList()
    }
}