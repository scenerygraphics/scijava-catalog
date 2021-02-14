package sciJava.catalogs

import org.gradle.api.initialization.resolve.MutableVersionCatalogContainer

/** SciJava - https://github.com/scijava */
fun MutableVersionCatalogContainer.addSciJava() {

    create("sciJava").apply {
        //            <!-- Batch Processor - https://github.com/scijava/batch-processor -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>batch-processor</artifactId>
        //            <version>${batch-processor.version}</version>
        //            </dependency>
        //
        //            <!-- MiniMaven - https://github.com/scijava/minimaven -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>minimaven</artifactId>
        //            <version>${minimaven.version}</version>
        //            </dependency>
        //
        //            <!-- Native Lib Loader - https://github.com/scijava/native-lib-loader -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>native-lib-loader</artifactId>
        //            <version>${native-lib-loader.version}</version>
        //            </dependency>
        //
        //            <!-- Parsington - https://github.com/scijava/parsington -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>parsington</artifactId>
        //            <version>${parsington.version}</version>
        //            </dependency>
        //
        //            <!-- SciJava Cache - https://github.com/scijava/scijava-cache -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scijava-cache</artifactId>
        //            <version>${scijava-cache.version}</version>
        //            </dependency>

        // SciJava Common - https://github.com/scijava/scijava-common
        alias("common").to("org.scijava:scijava-common:2.85.0")

        //            <!-- SciJava Config - https://github.com/scijava/scijava-config -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scijava-config</artifactId>
        //            <version>${scijava-config.version}</version>
        //            </dependency>
        //
        //            <!-- SciJava Grab - https://github.com/scijava/scijava-grab -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scijava-grab</artifactId>
        //            <version>${scijava-grab.version}</version>
        //            </dependency>

        // SciJava I/O: HTTP - https://github.com/scijava/scijava-io-http
        alias("ioHttp").to("org.scijava:scijava-io-http:0.2.1")

        //            <!-- SciJava Java 3D Tools - https://github.com/scijava/scijava-java3d -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scijava-java3d</artifactId>
        //            <version>${scijava-java3d.version}</version>
        //            </dependency>
        //
        //            <!-- SciJava Listeners - https://github.com/scijava/scijava-listeners -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scijava-listeners</artifactId>
        //            <version>${scijava-listeners.version}</version>
        //            </dependency>
        //
        //            <!-- SciJava SLF4J Logging - https://github.com/scijava/scijava-log-slf4j -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scijava-log-slf4j</artifactId>
        //            <version>${scijava-log-slf4j.version}</version>
        //            </dependency>
        //
        //            <!-- SciJava Optional - https://github.com/scijava/scijava-optional -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scijava-optional</artifactId>
        //            <version>${scijava-optional.version}</version>
        //            </dependency>

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

        //            <!-- SciJava Search - https://github.com/scijava/scijava-search -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scijava-search</artifactId>
        //            <version>${scijava-search.version}</version>
        //            </dependency>
        //
        //            <!-- SciJava Table - https://github.com/scijava/scijava-table -->
        //            <dependency>
        //            <groupId>org.scijava</groupId>
        //            <artifactId>scijava-table</artifactId>
        //            <version>${scijava-table.version}</version>
        //            </dependency>
        //
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