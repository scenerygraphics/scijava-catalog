package sciJava.catalogs

import org.gradle.api.initialization.resolve.MutableVersionCatalogContainer

/** SciJava - https://github.com/scijava */
fun MutableVersionCatalogContainer.addSciJava() {

    create("sciJava").apply {

        //            <!-- JUnit Benchmarks - https://github.com/scijava/junit-benchmarks -->
        //            <junit-benchmarks.version>0.7.4-scijava</junit-benchmarks.version>
        //
        //            <!-- SciJava UI: AWT - https://github.com/scijava/scijava-ui-awt -->
        //            <scijava-ui-awt.version>0.1.7</scijava-ui-awt.version>
        //
        //            <!-- SciJava UI: Swing - https://github.com/scijava/scijava-ui-swing -->
        //            <scijava-ui-swing.version>0.13.2</scijava-ui-swing.version>
        //
        //            <!-- Scripting: BeanShell - https://github.com/scijava/scripting-beanshell -->
        //            <scripting-beanshell.version>0.3.4</scripting-beanshell.version>
        //
        //            <!-- Scripting: Clojure - https://github.com/scijava/scripting-clojure -->
        //            <scripting-clojure.version>0.1.6</scripting-clojure.version>
        //
        //            <!-- Scripting: Groovy - https://github.com/scijava/scripting-groovy -->
        //            <scripting-groovy.version>0.3.0</scripting-groovy.version>
        //
        //            <!-- Scripting: Java - https://github.com/scijava/scripting-java -->
        //            <scripting-java.version>0.4.1</scripting-java.version>
        //
        //            <!-- Scripting: JavaScript - https://github.com/scijava/scripting-javascript -->
        //            <scripting-javascript.version>0.5.0</scripting-javascript.version>
        //
        //            <!-- Scripting: JRuby - https://github.com/scijava/scripting-jruby -->
        //            <scripting-jruby.version>0.3.1</scripting-jruby.version>
        //
        //            <!-- Scripting: Jython - https://github.com/scijava/scripting-jython -->
        //            <scripting-jython.version>1.0.0</scripting-jython.version>
        //
        //            <!-- Scripting: Kotlin - https://github.com/scijava/scripting-kotlin -->
        //            <scripting-kotlin.version>0.1.1</scripting-kotlin.version>
        //
        //            <!-- Scripting: MATLAB - https://github.com/scijava/scripting-matlab -->
        //            <scripting-matlab.version>0.5.2</scripting-matlab.version>
        //
        //            <!-- Scripting: Renjin - https://github.com/scijava/scripting-renjin -->
        //            <scripting-renjin.version>0.2.3</scripting-renjin.version>
        //
        //            <!-- Scripting: Scala - https://github.com/scijava/scripting-scala -->
        //            <scripting-scala.version>0.2.2</scripting-scala.version>
        //
        //            <!-- Swing Checkbox Tree - https://github.com/scijava/swing-checkbox-tree -->
        //            <swing-checkbox-tree.version>1.0.2</swing-checkbox-tree.version>
        //
        //            <!-- UI Behaviour - https://github.com/scijava/ui-behaviour -->
        //            <ui-behaviour.version>2.0.3</ui-behaviour.version>
        //

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

        //            <!-- SciJava UI: AWT - https://github.com/scijava/scijava-ui-awt -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scijava-ui-awt</artifactId>
        //            <version>${scijava-ui-awt.version}</version>
        //            </dependency>
        //
        //            <!-- SciJava UI: Swing - https://github.com/scijava/scijava-ui-swing -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scijava-ui-swing</artifactId>
        //            <version>${scijava-ui-swing.version}</version>
        //            </dependency>
        //
        // Script Editor - https://github.com/scijava/script-editor
        alias("scriptEditor").to("org.scijava:script-editor:0.5.6")

        //            <!-- Scripting: BeanShell - https://github.com/scijava/scripting-beanshell -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scripting-beanshell</artifactId>
        //            <version>${scripting-beanshell.version}</version>
        //            </dependency>
        //
        //            <!-- Scripting: Clojure - https://github.com/scijava/scripting-clojure -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scripting-clojure</artifactId>
        //            <version>${scripting-clojure.version}</version>
        //            </dependency>
        //
        //            <!-- Scripting: Groovy - https://github.com/scijava/scripting-groovy -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scripting-groovy</artifactId>
        //            <version>${scripting-groovy.version}</version>
        //            </dependency>
        //
        //            <!-- Scripting: Java - https://github.com/scijava/scripting-java -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scripting-java</artifactId>
        //            <version>${scripting-java.version}</version>
        //            </dependency>
        //
        //            <!-- Scripting: JavaScript - https://github.com/scijava/scripting-javascript -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scripting-javascript</artifactId>
        //            <version>${scripting-javascript.version}</version>
        //            </dependency>
        //
        //            <!-- Scripting: JRuby - https://github.com/scijava/scripting-jruby -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scripting-jruby</artifactId>
        //            <version>${scripting-jruby.version}</version>
        //            </dependency>
        //
        //            <!-- Scripting: Jython - https://github.com/scijava/scripting-jython -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scripting-jython</artifactId>
        //            <version>${scripting-jython.version}</version>
        //            </dependency>
        //
        //            <!-- Scripting: Kotlin - https://github.com/scijava/scripting-kotlin -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scripting-kotlin</artifactId>
        //            <version>${scripting-kotlin.version}</version>
        //            </dependency>
        //
        //            <!-- Scripting: MATLAB - https://github.com/scijava/scripting-matlab -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scripting-matlab</artifactId>
        //            <version>${scripting-matlab.version}</version>
        //            </dependency>
        //
        //            <!-- Scripting: Renjin - https://github.com/scijava/scripting-renjin -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scripting-renjin</artifactId>
        //            <version>${scripting-renjin.version}</version>
        //            </dependency>
        //
        //            <!-- Scripting: Scala - https://github.com/scijava/scripting-scala -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scripting-scala</artifactId>
        //            <version>${scripting-scala.version}</version>
        //            </dependency>
        //
        //            <!-- Swing Checkbox Tree - https://github.com/scijava/swing-checkbox-tree -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>swing-checkbox-tree</artifactId>
        //            <version>${swing-checkbox-tree.version}</version>
        //            </dependency>
        //
        //            <!-- UI Behaviour - https://github.com/scijava/ui-behaviour -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>ui-behaviour</artifactId>
        //            <version>${ui-behaviour.version}</version>
        //            </dependency>
    }
}