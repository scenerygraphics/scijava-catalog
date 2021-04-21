package sciJava.catalogs

import org.gradle.api.initialization.resolve.MutableVersionCatalogContainer

fun MutableVersionCatalogContainer.bigDataViewer() {

    // BigDataViewer - https://github.com/bigdataviewer
    create("bigDataViewer").apply {

        alias("core").to("sc.fiji:bigdataviewer-core:9.0.6")
        alias("server").to("sc.fiji:bigdataviewer-server:3.0.0")
        alias("visTools").to("sc.fiji:bigdataviewer-vistools:1.0.0-beta-21")
        alias("fiji").to("sc.fiji:bigdataviewer_fiji:6.2.0")
        alias("spimData").to("sc.fiji:spim_data:2.2.4")

        bundle("all", listOf("core", "server", "visTools", "fiji", "spimData"))
    }
}

fun MutableVersionCatalogContainer.trakEM2() {

    // TrakEM2 - https://github.com/trakem2
    create("trakEM2").apply {

        alias("nit").to("sc.fiji:T2-NIT:1.1.3")
        alias("treeLineGraph").to("sc.fiji:T2-TreelineGraph:1.1.3")
        alias("core").to("sc.fiji:TrakEM2_:1.3.4")
        alias("vectorString").to("sc.fiji:VectorString:2.0.2")
        alias("transform").to("sc.fiji:trakem2-transform:1.0.1")

        bundle("all", listOf("nit", "treeLineGraph", "core", "vectorString", "transform"))
    }
}

fun MutableVersionCatalogContainer.n5() {

    // N5 - https://github.com/saalfeldlab/n5
    create("n5").apply {

        alias("labelMultisets").to("net.imglib2:imglib2-label-multisets:0.9.0")
        alias("core").to("org.janelia.saalfeldlab:n5:2.2.1")
        alias("awsS3").to("org.janelia.saalfeldlab:n5-aws-s3:3.1.3")
        alias("blosc").to("org.janelia.saalfeldlab:n5-blosc:1.1.0")
        alias("googleCloud").to("org.janelia.saalfeldlab:n5-google-cloud:3.2.2")
        alias("hdf5").to("org.janelia.saalfeldlab:n5-hdf5:1.1.0")
        alias("imglib2").to("org.janelia.saalfeldlab:n5-imglib2:3.5.1")
        alias("viewerFiji").to("org.janelia.saalfeldlab:n5-viewer_fiji:2.2.0")
        alias("zarr").to("org.janelia.saalfeldlab:n5-zarr:0.0.4")

        bundle("all", listOf("labelMultisets", "core", "awsS3", "blosc", "googleCloud", "hdf5", "viewerFiji", "zarr"))
    }
}

fun MutableVersionCatalogContainer.boneJ() {

    // BoneJ - http://bonej.org/
    create("boneJ").apply {

        val version = "7.0.7"
        alias("plugins").to("org.bonej:bonej-plugins:$version")
        alias("ops").to("org.bonej:bonej-ops:$version")
        alias("legacyPlugins").to("org.bonej:bonej-legacy-plugins_:$version")
        alias("legacyUtil").to("org.bonej:bonej-legacy-util_:$version")
        alias("utilities").to("org.bonej:bonej-utilities:$version")

        bundle("all", listOf("plugins", "ops", "legacyPlugins", "legacyUtil", "utilities"))
    }
}

fun MutableVersionCatalogContainer.ome() {

    // Open Microscopy Environment - https://github.com/ome
    create("ome").apply {

        // Metakit - https://github.com/ome/ome-metakit
        alias("metakit").to("org.openmicroscopy:metakit:5.3.2")

        // OME Common Java - https://github.com/ome/ome-common-java
        alias("common").to("org.openmicroscopy:ome-common:6.0.4")

        // OME POI - https://github.com/ome/ome-poi
        alias("poi").to("org.openmicroscopy:ome-poi:5.3.3")

        // OME Model - https://github.com/ome/ome-model
        alias("xml").to("org.openmicroscopy:ome-xml:6.1.0")

        // Glencoe Software jxrlib - https://github.com/glencoesoftware/jxrlib
        alias("jxrlibAll").to("ome:jxrlib-all:0.2.4")

        // Bio-Formats - https://github.com/ome/bioformats
        val version = "6.5.1"
        alias("bioFormatsPlugins").to("ome:bio-formats_plugins:$version")
        alias("formatsApi").to("ome:formats-api:$version")
        alias("formatsBsd").to("ome:formats-bsd:$version")
        alias("formatsGpl").to("ome:formats-gpl:$version")

        bundle("all", listOf("metakit", "common", "poi", "xml", "jxrlibAll", "formatsApi", "formatsBsd", "formatsGpl"))
    }
}

fun MutableVersionCatalogContainer.omero() {

    create("omero").apply {

        // OMERO Blitz - https://github.com/ome/omero-blitz
        alias("blitz").to("org.openmicroscopy:omero-blitz:5.5.6")

        // OMERO Common - https://github.com/ome/omero-common
        alias("common").to("org.openmicroscopy:omero-common:5.5.5")

        // OMERO DSL Plugin - https://github.com/ome/omero-dsl-plugin
        alias("dslPlugin").to("org.openmicroscopy:omero-dsl-plugin:5.5.0")

        // OMERO Gateway - https://github.com/ome/omero-gateway-java
        alias("gateway").to("org.openmicroscopy:omero-gateway:5.6.3")

        // OMERO Model - https://github.com/ome/omero-model
        alias("model").to("org.openmicroscopy:omero-model:5.6.0")

        // OMERO Renderer - https://github.com/ome/omero-renderer
        alias("renderer").to("org.openmicroscopy:omero-renderer:5.5.5")

        // OMERO ROMIO - https://github.com/ome/omero-romio
        alias("romio").to("org.openmicroscopy:omero-romio:5.6.0")

        // OMERO Server - https://github.com/ome/omero-server
        alias("server").to("org.openmicroscopy:omero-server:5.5.6")


        bundle("all", listOf("blitz", "common", "dslPlugin", "gateway", "model", "renderer", "romio", "server"))
    }
}

fun MutableVersionCatalogContainer.groovy() {

    // Apache Groovy - https://groovy-lang.org/
    create("groovy").apply {

        val version = "3.0.4"
        val root = "org.codehaus.groovy:groovy"
        alias("core").to("$root:$version")
        alias("ant").to("$root-ant:$version")
        alias("astBuilder").to("$root-astbuilder:$version")
        alias("bsf").to("$root-bsf:$version")
        alias("cliCommons").to("$root-cli-commons:$version")
        alias("cliPicocli").to("$root-cli-picocli:$version")
        alias("console").to("$root-console:$version")
        alias("datetime").to("$root-datetime:$version")
        alias("docgenerator").to("$root-docgenerator:$version")
        alias("doc").to("$root-groovydoc:$version")
        alias("sh").to("$root-groovysh:$version")
        alias("jaxb").to("$root-jaxb:$version")
        alias("jmx").to("$root-jmx:$version")
        alias("json").to("$root-json:$version")
        alias("macro").to("$root-macro:$version")
        alias("nio").to("$root-nio:$version")
        alias("servlet").to("$root-servlet:$version")
        alias("sql").to("$root-sql:$version")
        alias("templates").to("$root-templates:$version")
        alias("test").to("$root-test:$version")
        alias("testJunit5").to("$root-test-junit5:$version")
        alias("testNg").to("$root-testng:$version")
        alias("xml").to("$root-xml:$version")
        alias("yaml").to("$root-yaml:$version")

        bundle("all", listOf("core", "ant", "astBuilder", "bsf", "cliCommons", "cliPicocli", "console",
                             "datetime", "docgenerator", "doc", "sh", "jaxb", "jmx", "json", "macro", "nio", "servlet",
                             "sql", "templates", "test", "testJunit5", "testNg", "xml", "yaml"))
    }
}

fun MutableVersionCatalogContainer.apache() {

    create("apache").apply {

        // Apache Maven - https://maven.apache.org/

        alias("mavenArtifactTransfer").to("org.apache.maven.shared:maven-artifact-transfer:0.12.0")
        alias("mavenCommonArtifactFilters").to("org.apache.maven.shared:maven-common-artifact-filters:3.1.0")
        alias("mavenCore").to("org.apache.maven:maven-core:3.6.3")
        alias("mavenPluginsToolsApi").to("org.apache.maven.plugin-tools:maven-plugin-tools-api:3.6.0")
        alias("sisuInjectBean").to("org.sonatype.sisu:sisu-inject-bean:2.6.0")
        alias("sisuInjectPlexus").to("org.sonatype.sisu:sisu-inject-plexus:2.6.0")

        // Apache POI - https://poi.apache.org/
        alias("poi").to("org.apache.poi:poi:3.17")

        // Apache Spark - https://spark.apache.org/
        alias("spark").to("org.apache.spark:spark-core_2.11:2.3.1")

        // Apache HTTPComponents - https://hc.apache.org/
        alias("httpClient").to("org.apache.httpcomponents:httpclient:4.5.12")
        alias("httpCore").to("org.apache.httpcomponents:httpcore:4.4.13")

        bundle("all", listOf("mavenArtifactTransfer", "mavenCommonArtifactFilters", "mavenCore",
                             "mavenPluginsToolsApi", "sisuInjectBean", "sisuInjectPlexus", "poi", "spark",
                             "httpClient", "httpCore"))
    }
}

fun MutableVersionCatalogContainer.batik() {

    // Batik - https://xmlgraphics.apache.org/batik/
    create("batik").apply {

        val version = "1.13"
        val root = "org.apache.xmlgraphics:batik"
        alias("anim").to("$root-anim:$version")
        alias("awtUtil").to("$root-awt-util:$version")
        alias("bridge").to("$root-bridge:$version")
        alias("codec").to("$root-codec:$version")
        alias("constants").to("$root-costants:$version")
        alias("css").to("$root-css:$version")
        alias("dom").to("$root-dom:$version")
        alias("ext").to("$root-ext:$version")
        alias("extensionS").to("$root-extentions:$version")
        alias("guiUtil").to("$root-gui-util:$version")
        alias("gvt").to("$root-gvt:$version")
        alias("i18n").to("$root-i18n:$version")
        alias("parser").to("$root-parser:$version")
        alias("rasterizer").to("$root-rasterizer:$version")
        alias("rasterizerExt").to("$root-rasterizer-ext:$version")
        alias("script").to("$root-script:$version")
        alias("slideshow").to("$root-slideshow:$version")
        alias("squiggle").to("$root-squiggle:$version")
        alias("squiggleExt").to("$root-squiggle-ext:$version")
        alias("svgDom").to("$root-svg-dom:$version")
        alias("svgGen").to("$root-svggen:$version")
        alias("svgPP").to("$root-svgpp:$version")
        alias("swing").to("$root-swing:$version")
        alias("transcoder").to("$root-transcoder:$version")
        alias("ttf2svg").to("$root-ttf2svg:$version")
        alias("util").to("$root-util:$version")
        alias("xml").to("$root-xml:$version")
        alias("common").to("org.apache.xmlgraphics:xmlgraphics-commons:2.4")

        bundle("all", listOf("anim", "awtUtil", "bridge", "codec", "constants", "css", "dom", "ext",
                             "extensionS", "guiUtil", "gvt", "i18n", "parser", "rasterizer", "rasterizerExt",
                             "script", "slideshow", "squiggle", "squiggleExt", "svgDom", "svgGen", "svgPP", "swing",
                             "transcoder", "ttf2svg", "util", "xml", "common"))
    }
}

fun MutableVersionCatalogContainer.commons() {

    create("commons").apply {

        // Commons BeanUtils - https://commons.apache.org/proper/commons-beanutils/
        alias("beanutils").to("commons-beanutils:commons-beanutils:1.9.4")
        // Commons Codec - https://commons.apache.org/proper/commons-codec/
        alias("codec").to("commons-codec:commons-codec:1.14")

        // Commons Collections - https://commons.apache.org/proper/commons-collections/
        alias("collections").to("commons-collections:commons-collections:3.2.2")

        // Commons Compress - https://commons.apache.org/proper/commons-compress/
        alias("compress").to("org.apache.commons:commons-compress:1.20")

        // Commons IO - https://commons.apache.org/proper/commons-io/
        alias("io").to("commons-io:commons-io:2.7")

        // Commons Lang - https://commons.apache.org/proper/commons-lang/
        alias("lang").to("commons-lang:commons-lang:2.6")
        alias("lang3").to("commons-lang:commons-lang3:3.10")

        // Commons Logging - https://commons.apache.org/proper/commons-logging/
        alias("logging").to("commons-logging:commons-logging:1.2")

        // Commons Math - https://commons.apache.org/proper/commons-math/
        alias("math3").to("org.apache.commons:commons-math3:3.6.1")

        // Commons Text - https://commons.apache.org/proper/commons-text/
        alias("text").to("org.apache.commons:commons-text:1.8")


        bundle("all", listOf("beanutils", "codec", "collections", "compress", "io", "lang", "lang3", "logging",
                             "math3", "text"))
    }
}

fun MutableVersionCatalogContainer.eclipseCollection() {

    // Eclipse Collections - https://www.eclipse.org/collections/
    create("eclipseCollections").apply {

        val version = "10.4.0"
        val root = "org.eclipse.collections:eclipse-collections"
        alias("core").to("$root:$version")
        alias("api").to("$root-api:$version")
        alias("forkjoin").to("$root-forkjoin:$version")
        alias("testutils").to("$root-testutils:$version")


        bundle("all", listOf("core", "api", "forkjoin", "testutils"))
    }
}

fun MutableVersionCatalogContainer.eclipseSwt() {

    // Eclipse SWT - https://www.eclipse.org/swt/
    create("eclipseSwt").apply {

        val version = "4.3"
        val root = "org.eclipse.swt:org.eclipse.swt"
        alias("cocoaMacosx").to("$root.cocoa.macosx:$version")
        alias("cocoaMacosx64").to("$root.cocoa.macosx.x86_64:$version")
        alias("gtkAixPpc").to("$root.gtk.aix.ppc:$version")
        alias("gtkAixPpc64").to("$root.gtk.aix.ppc64:$version")
        alias("gtkHpuxIa64").to("$root.gtk.hpux.ia64:$version")
        alias("gtkLinuxPpc").to("$root.gtk.linux.ppc:$version")
        alias("gtkLinuxPpc64").to("$root.gtk.linux.ppc64:$version")
        alias("gtkLinuxS390").to("$root.gtk.linux.s390:$version")
        alias("gtkLinuxS390x").to("$root.gtk.linux.s390x:$version")
        alias("gtkLinux86").to("$root.gtk.linux.x86:$version")
        alias("gtkLinux64").to("$root.gtk.linux.x86_64:$version")
        alias("gtkSolarisSparc").to("$root.gtk.solaris.sparc:$version")
        alias("gtkSolaris86").to("$root.gtk.solaris.x86:$version")
        alias("win32").to("$root.win32.win32.x86:$version")
        alias("win64").to("$root.win32.win32.x86_64:$version")


        bundle("all", listOf("cocoaMacosx", "cocoaMacosx64", "gtkAixPpc", "gtkAixPpc64", "gtkHpuxIa64",
                             "gtkLinuxPpc", "gtkLinuxPpc64", "gtkLinuxS390", "gtkLinuxS390x", "gtkLinux86",
                             "gtkLinux64", "gtkSolarisSparc", "gtkSolaris86", "win32", "win64"))
    }
}

fun MutableVersionCatalogContainer.googleCloud() {

    // Google Cloud Storage - https://github.com/googleapis/google-cloud-java
    create("googleCloud").apply {

        alias("nio").to("com.google.cloud:google-cloud-nio:0.120.0-alpha")
        alias("resourceManager").to("com.google.cloud:google-cloud-resourcemanager:0.117.2-alpha")
        alias("storage").to("com.google.cloud:google-cloud-storage:1.108.0")


        bundle("all", listOf("nio", "resourceManager", "storage"))
    }
}

fun MutableVersionCatalogContainer.jackson() {

    create("jackson").apply {

        val version = "2.11.0"
        // Jackson - https://github.com/FasterXML/jackson
        alias("core").to("com.fasterxml.jackson.core:jackson-databind:$version")
        // [Gradle]
        alias("module").to("com.fasterxml.jackson.module:jackson-module-kotlin:$version")
        // [Gradle]
        alias("dataformat").to("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:$version")


        bundle("all", listOf("core", "module", "dataformat"))
    }
}

fun MutableVersionCatalogContainer.jetty() {

    // Jetty - https://www.eclipse.org/jetty/
    val version = "9.4.29.v20200521"

    create("jetty").apply {
        val root = "org.eclipse.jetty:jetty"

        alias("annotations").to("$root-annotations:$version")
        //                NB: We do not manage jetty-ant. It depends on ant with old groupId (ant),
        //                which conflicts with other dependencies using new groupId (org.apache.ant).
        alias("client").to("$root-client:$version")
        alias("continuation").to("$root-continuation:$version")
        alias("deploy").to("$root-deploy:$version")
        alias("http").to("$root-http:$version")
        alias("httpSpi").to("$root-http-spi:$version")
        alias("io").to("$root-io:$version")
        alias("jaas").to("$root-jaas:$version")
        alias("jaspi").to("$root-jaspi:$version")
        alias("jmx").to("$root-jmx:$version")
        alias("jndi").to("$root-jndi:$version")
        //                NB: We do not manage jetty-jspc-maven-plugin or jetty-maven-plugin.
        //                Their dependencies include several artifacts conflicting with elsewhere :
        //                * classworlds:classworlds vs. org.codehaus.plexus:plexus-classworlds
        //                * javax.annotation:jsr250-api vs. javax.annotation:javax.annotation-api
        //                * javax.websocket:javax.websocket-api vs. javax.websocket:javax.websocket-client-api
        //                * org.mortbay.jasper:apache-el vs. javax.el:javax.el-api
        alias("nosql").to("$root-nosql:$version")
        alias("plus").to("$root-plus:$version")
        alias("proxy").to("$root-proxy:$version")
        alias("rewrite").to("$root-rewrite:$version")
        //        NB: We do not manage jetty-runner. It is an unshaded uber-JAR.
        alias("security").to("$root-security:$version")
        alias("server").to("$root-server:$version")
        alias("servlet").to("$root-servlet:$version")
        alias("servlets").to("$root-servlets:$version")
        alias("spring").to("$root-spring:$version")
        alias("start").to("$root-start:$version")
        alias("util").to("$root-util:$version")
        alias("utilAjax").to("$root-util-ajax:$version")
        alias("webapp").to("$root-webapp:$version")
        alias("xml").to("$root-xml:$version")


        bundle("all", listOf("annotations", "client", "continuation", "deploy", "http", "httpSpi", "io", "jaas",
                             "jaspi", "jmx", "jndi", "nosql", "plus", "proxy", "rewrite", "security", "server",
                             "servlet", "servlets", "spring", "start", "util", "utilAjax", "webapp", "xml"))
    }
}

fun MutableVersionCatalogContainer.jGraphT() {

    // JGraphT - https://github.com/jgrapht/jgrapht
    create("jGraphT").apply {

        val all = listOf("core", "demo", "ext", "guava", "io", "opt")
        for (s in all)
            alias(s).to("org.jgrapht:jgrapht-$s:1.4.0")

        bundle("all", all)
    }
}

fun MutableVersionCatalogContainer.jna() {

    create("jna").apply {

        val version = "4.5.2"

        // JNA - https://github.com/twall/jna
        alias("core").to("net.java.dev.jna:jna:$version")
        // [Gradle]
        alias("platform").to("net.java.dev.jna:jna-platform:$version")


        bundle("all", listOf("core", "platform"))
    }
}

fun MutableVersionCatalogContainer.jogamp() {

    // JOGL - https: //jogamp.org/jogl/
    create("jogamp").apply {

        val version = "2.3.2"
        // [Gradle] we use the atomic version instead of the `*-main` ones
        alias("gluegen").to("org.jogamp.gluegen:gluegen-rt:$version")
        alias("joal").to("org.jogamp.joal:joal:$version")
        alias("jocl").to("org.jogamp.jocl:jocl:$version")
        alias("jogl").to("org.jogamp.jogl:jogl-all:$version")

        bundle("all", listOf("gluegen", "joal", "jocl", "jogl"))
    }
}

fun MutableVersionCatalogContainer.kotlin() {

    // Kotlin - https://kotlinlang.org/

    val version = "1.4.21"

    create("kotlib").apply {

        val root = "org.jetbrains.kotlin:kotlin"

        alias("compilerEmbeddable").to("$root-embeddable:$version")
        alias("daemonEmbeddable").to("$root-daemon-embeddable:$version")
        alias("reflect").to("$root-reflect:$version")
        alias("scriptRuntime").to("$root-script-runtime:$version")
        alias("scriptUtil").to("$root-script-util:$version")
        alias("scriptCommon").to("$root-script-common:$version")
        alias("scriptingCompilerEmbeddable").to("$root-scripting-compiler-embeddable:$version")
        alias("scriptingJvm").to("$root-scripting-jvm:$version")
        alias("stdlib").to("$root-stdlib:$version")
        alias("stdlibCommon").to("$root-stdlib-common:$version")
        alias("stdlibJdk8").to("$root-stdlib-jdk8:$version")


        bundle("all", listOf("compilerEmbeddable", "daemonEmbeddable", "reflect", "scriptRuntime", "scriptUtil",
                             "scriptCommon", "scriptingCompilerEmbeddable", "scriptingJvm", "stdlib", "stdlibCommon",
                             "stdlibJdk8"))
    }
}

fun MutableVersionCatalogContainer.logBack() {

    // Logback - https://logback.qos.ch/
    create("logBack").apply {

        val all = listOf("classic", "core")
        for (s in all)
            alias(s).to("ch.qos.logback:logback-$s:1.2.3")

        bundle("all", all)
    }

}

fun MutableVersionCatalogContainer.migLayout() {

    // MigLayout - http://www.miglayout.com/
    create("migLayout").apply {

        val all = listOf("core", "swing", "swt")
        for (s in all)
            alias(s).to("com.miglayout:miglayout-$s:5.2")

        bundle("all", all)
    }
}

fun MutableVersionCatalogContainer.rSyntaxTextArea() {

    // RSyntaxTextArea - http://bobbylight.github.io/RSyntaxTextArea/
    create("rSyntaxTextArea").apply {

        val root = "com.fifesoft"
        alias("core").to("$root:rsyntaxtextarea:3.1.1")
        alias("autocomplete").to("$root:autocomplete:3.1.0")
        alias("languagesupport").to("$root:languagesupport:3.1.0")

        bundle("all", listOf("core", "autocomplete", "languagesupport"))
    }
}

fun MutableVersionCatalogContainer.slf4j() {

    // SLF4J - http://slf4j.org/
    create("slf4j").apply {

        val version = "1.7.30"
        val root = "org.slf4j:slf4j"
        alias("api").to("$root-api:$version")
        alias("ext").to("$root-ext:$version")
        alias("jcl").to("$root-jcl:$version")
        alias("jdk14").to("$root-jdk14:$version")
        alias("nop").to("$root-nop:$version")
        alias("simple").to("$root-simple:$version")
        alias("jclOverSlf4j").to("org.slf4j:jcl-over-slf4j:$version")

        bundle("all", listOf("api", "ext", "jcl", "jdk14", "nop", "simple", "jclOverSlf4j"))
    }
}

fun MutableVersionCatalogContainer.snakeYAML() {

    create("snakeYAML").apply {

        val root = "org.yaml:snakeyaml"

        // SnakeYAML - https://bitbucket.org/asomov/snakeyaml
        alias("core").to("$root:1.26")

        // SnakeYAML Engine - https://bitbucket.org/asomov/snakeyaml-engine
        alias("engine").to("$root-engine:2.1")


        bundle("all", listOf("core", "engine"))
    }
}

fun MutableVersionCatalogContainer.tensorFlow() {

    create("tensorFlow").apply {

        val group = "org.tensorflow"
        val version = "1.12.0"
        // TensorFlow - https://www.tensorflow.org/
        alias("core").to("$group:tensorflow:$version")
        alias("lib").to("$group:libtensorflow:$version")
        alias("libJni").to("$group:libtensorflow_jni:$version")
        alias("libJniGpu").to("$group:libtensorflow_jni_gpu:$version")
        alias("proto").to("$group:proto:$version")

        bundle("all", listOf("core", "lib", "libJni", "libJniGpu", "proto"))
    }
}

fun MutableVersionCatalogContainer.junit5() {

    create("junit5").apply {

        val version = "5.6.2"
        val jupiter = "org.junit.jupiter:junit-jupiter"
        // JUnit 5 - https://junit.org/junit5/
        alias("api").to("$jupiter-api:$version")
        alias("engine").to("$jupiter-engine:$version")
        alias("migrationsupport").to("$jupiter-migrationsupport:$version")
        alias("params").to("$jupiter-params:$version")
        alias("vintage").to("org.junit.vintage:junit-vintage-engine:$version")

        bundle("all", listOf("api", "engine", "migrationsupport", "params", "vintage"))
    }
}

fun MutableVersionCatalogContainer.jmh() {

    // JMH - http://openjdk.java.net/projects/code-tools/jmh/
    create("jmh").apply {

        val version = "1.23"
        val root = "org.openjdk.jmh:jmh"

        alias("core").to("$root-core:$version")
        alias("generatorAnnprocess").to("$root-generator-annprocess:$version")

        bundle("all", listOf("core", "generatorAnnprocess"))
    }
}