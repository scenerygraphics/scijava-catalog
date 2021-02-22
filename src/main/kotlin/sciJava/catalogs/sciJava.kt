package sciJava.catalogs

import org.gradle.api.initialization.resolve.MutableVersionCatalogContainer

/** SciJava - https://github.com/scijava */
fun MutableVersionCatalogContainer.addSciJava() {

    create("sciJava").apply {

        // Batch Processor - https://github.com/scijava/batch-processor
        alias("batchProcessor").to("org.scijava:batch-processor:0.4.1")

        // MiniMaven - https://github.com/scijava/minimaven
        alias("minimaven").to("org.scijava:minimaven:2.2.2")

        // Native Lib Loader - https://github.com/scijava/native-lib-loader
        alias("libLoader").to("org.scijava:native-lib-loader:2.3.4")

        // Parsington - https://github.com/scijava/parsington
        alias("parsington").to("org.scijava:parsington:2.0.0")

        // SciJava Cache - https://github.com/scijava/scijava-cache
        alias("cache").to("org.scijava:scijava-cache:0.1.2")

        // SciJava Common - https://github.com/scijava/scijava-common
        alias("common").to("org.scijava:scijava-common:2.85.0")

        // SciJava Config - https://github.com/scijava/scijava-config
        alias("config").to("org.scijava:scijava-config:2.0.2")

        // SciJava Grab - https://github.com/scijava/scijava-grab
        alias("grab").to("org.scijava:scijava-grab:0.1.0")

        // SciJava I/O: HTTP - https://github.com/scijava/scijava-io-http
        alias("ioHttp").to("org.scijava:scijava-io-http:0.2.1")

        // SciJava Java 3D Tools - https://github.com/scijava/scijava-java3d
        alias("java3d").to("org.scijava:scijava-java3d:0.1.0")

        // SciJava Listeners - https://github.com/scijava/scijava-listeners
        alias("listeners").to("org.scijava:scijava-listeners:1.0.0-beta-3")

        // SciJava SLF4J Logging - https://github.com/scijava/scijava-log-slf4j
        alias("logSlf4j").to("org.scijava:scijava-log-slf4j:1.0.5")

        // SciJava Optional - https://github.com/scijava/scijava-optional
        alias("optional").to("org.scijava:scijava-optional:1.0.0")

        // SciJava Plugins: Commands - https://github.com/scijava/scijava-plugins-commands
        alias("pluginsCommands").to("org.scijava:scijava-plugins-commands:0.2.3")

        // SciJava Plugins: I/O: Table - https://github.com/scijava/scijava-plugins-io-table
        alias("pluginsIoTable").to("org.scijava:scijava-plugins-io-table:0.4.0")

        // SciJava Plugins: Platforms - https://github.com/scijava/scijava-plugins-platforms
        alias("pluginsPlatforms").to("org.scijava:scijava-plugins-platforms:0.3.1")

        // SciJava Plugins: Text: Markdown - https://github.com/scijava/scijava-plugins-text-markdown
        alias("pluginsTextMarkdown").to("org.scijava:scijava-plugins-text-markdown:0.1.3")

        // SciJava Plugins: Text: Plain - https://github.com/scijava/scijava-plugins-text-plain
        alias("pluginsTextPlain").to("org.scijava:scijava-plugins-text-plain:0.1.3")

        // SciJava Search - https://github.com/scijava/scijava-search
        alias("search").to("org.scijava:scijava-search:0.7.0")

        // SciJava Table - https://github.com/scijava/scijava-table
        alias("table").to("org.scijava:scijava-table:0.7.0")

        // SciJava UI: AWT - https://github.com/scijava/scijava-ui-awt
        alias("uiAwt").to("org.scijava:scijava-ui-awt:0.1.7")

        // SciJava UI: Swing - https://github.com/scijava/scijava-ui-swing
        alias("uiSwing").to("org.scijava:scijava-ui-swing:0.13.2")

        // Script Editor - https://github.com/scijava/script-editor
        alias("scriptEditor").to("org.scijava:script-editor:0.5.6")

        // Scripting: BeanShell - https://github.com/scijava/scripting-beanshell
        alias("scriptingBeanshell").to("org.scijava:scripting-beanshell:0.3.4")

        // Scripting: Clojure - https://github.com/scijava/scripting-clojure
        alias("scriptingClojure").to("org.scijava:scripting-clojure:0.1.6")

        // Scripting: Groovy - https://github.com/scijava/scripting-groovy
        alias("scriptingGroovy").to("org.scijava:scripting-groovy:0.3.0")

        // Scripting: Java - https://github.com/scijava/scripting-java
        alias("scriptingJava").to("org.scijava:scripting-java:0.4.1")

        // Scripting: JavaScript - https://github.com/scijava/scripting-javascript
        alias("scriptingJavascript").to("org.scijava:scripting-javascript:0.5.0")

        // Scripting: JRuby - https://github.com/scijava/scripting-jruby
        alias("scriptingRuby").to("org.scijava:scripting-jruby:0.3.1")

        // Scripting: Jython - https://github.com/scijava/scripting-jython
        alias("scriptingJython").to("org.scijava:scripting-jython:1.0.0")

        // Scripting: Kotlin - https://github.com/scijava/scripting-kotlin
        alias("scriptingKotlin").to("org.scijava:scripting-kotlin:0.1.1")

        // Scripting: MATLAB - https://github.com/scijava/scripting-matlab
        alias("scriptingMatlab").to("org.scijava:scripting-matlab:0.5.2")

        // Scripting: Renjin - https://github.com/scijava/scripting-renjin
        alias("scriptingRenjin").to("org.scijava:scripting-renjin:0.2.3")

        // Scripting: Scala - https://github.com/scijava/scripting-scala
        alias("scriptingScala").to("org.scijava:scripting-scala:0.2.2")

        // Swing Checkbox Tree - https://github.com/scijava/swing-checkbox-tree
        alias("swingCheckboxTree").to("org.scijava:swing-checkbox-tree:1.0.2")

        // UI Behaviour - https://github.com/scijava/ui-behaviour
        alias("uiBehaviour").to("org.scijava:ui-behaviour:2.0.3")


        // JUnit Benchmarks - https://github.com/scijava/junit-benchmarks
        alias("junitBenchmarks").to("org.scijava:junit-benchmarks:0.7.4-scijava")
    }
}