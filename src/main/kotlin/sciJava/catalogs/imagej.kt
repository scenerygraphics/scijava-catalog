package sciJava.catalogs

import org.gradle.api.initialization.resolve.MutableVersionCatalogContainer

/** ImageJ - https://github.com/imagej */
fun MutableVersionCatalogContainer.addImagej() {

    create("imagej").apply {

        // ImageJ - https://github.com/imagej/imagej
        alias("core").to("net.imagej:imagej:2.2.0")

        // ImageJ 1.x - https://github.com/imagej/ImageJA
        alias("ij").to("net.imagej:ij:1.53d")

        // ImageJ 1.x patcher - https://github.com/imagej/ij1-patcher
        alias("ij1Patcher").to("net.imagej:ij1-patcher:1.2.0")

        // ImageJ Common - https://github.com/imagej/imagej-common
        alias("common").to("net.imagej:imagej-common:0.34.0")

        // ImageJ Deprecated - https://github.com/imagej/imagej-deprecated
        alias("deprecated").to("net.imagej:imagej-deprecated:0.1.4")

        // ImageJ Launcher - https://github.com/imagej/imagej-launcher
        alias("launcher").to("net.imagej:imagej-launcher:6.0.1")

        // ImageJ Legacy - https://github.com/imagej/imagej-legacy
        alias("legacy").to("net.imagej:imagej-legacy:0.37.4")

        // ImageJ MATLAB - https://github.com/imagej/imagej-matlab
        alias("matlab").to("net.imagej:imagej-matlab:0.7.4")

        // ImageJ Mesh - https://github.com/imagej/imagej-mesh
        alias("mesh").to("net.imagej:imagej-mesh:0.8.0")

        // ImageJ Mesh IO - https://github.com/imagej/imagej-mesh-io
        alias("meshIo").to("net.imagej:imagej-mesh-io:0.1.2")

        // ImageJ Notebook - https://github.com/imagej/imagej-notebook
        alias("notebook").to("net.imagej:imagej-notebook:0.7.1")

        val omero = "1.0.0-5.5"
        // ImageJ OMERO - https://github.com/imagej/imagej-omero
        alias("omero").to("net.imagej:imagej-omero:$omero")

        // ImageJ OMERO Legacy - https://github.com/imagej/imagej-omero-legacy
        alias("omeroLegacy").to("net.imagej:imagej-omero-legacy:$omero")

        // ImageJ OpenCV - https://github.com/imagej/imagej-opencv
        alias("opencv").to("net.imagej:imagej-opencv:0.1.1")

        // ImageJ Ops - https://github.com/imagej/imagej-ops
        alias("ops").to("net.imagej:imagej-ops:0.45.5")

        // ImageJ Plugins: Batch - https://github.com/imagej/imagej-plugins-batch
        alias("pluginsBatch").to("net.imagej:imagej-plugins-batch:0.1.1")

        // ImageJ Plugins: Commands - https://github.com/imagej/imagej-plugins-commands
        alias("pluginsCommands").to("net.imagej:imagej-plugins-commands:0.8.1")

        // ImageJ Plugins: Tools - https://github.com/imagej/imagej-plugins-tools
        alias("pluginsTools").to("net.imagej:imagej-plugins-tools:0.3.1")

        // ImageJ Plugins: Uploader: SSH - https://github.com/imagej/imagej-plugins-uploader-ssh
        alias("pluginsUploaderSsh").to("net.imagej:imagej-plugins-uploader-ssh:0.3.2")

        // ImageJ Plugins: Uploader: WebDAV - https://github.com/imagej/imagej-plugins-uploader-webdav
        alias("pluginsUploaderWebdav").to("net.imagej:imagej-plugins-uploader-webdav:0.3.2")

        // ImageJ Scripting - https://github.com/imagej/imagej-scripting
        alias("scripting").to("net.imagej:imagej-scripting:0.8.2")

        // ImageJ Server - https://github.com/imagej/imagej-server
        alias("server").to("net.imagej:imagej-server:0.2.0")

        // ImageJ TensorFlow - https://github.com/imagej/imagej-tensorflow
        alias("tensorflow").to("net.imagej:imagej-tensorflow:1.1.5")

        // ImageJ UI: AWT - https://github.com/imagej/imagej-ui-awt
        alias("uiAwt").to("net.imagej:imagej-ui-awt:0.3.1")

        // ImageJ UI: Swing - https://github.com/imagej/imagej-ui-swing
        alias("uiSwing").to("net.imagej:imagej-ui-swing:0.23.2")

        // ImageJ Updater - https://github.com/imagej/imagej-updater
        alias("updater").to("net.imagej:imagej-updater:0.10.5")

        // Op-Finder - https://github.com/imagej/op-finder
        alias("opFinder").to("net.imagej:op-finder:0.1.4")

        //        val base = listOf("common", "deprecated", "launcher", "legacy", "mesh", "meshIo", "notebook", "ops",
        //                          "pluginsBatch", "pluginsCommands", "pluginsTools", "pluginsUploaderSsh",
        //                          "pluginsUploaderWebdav", "scripting", "uiAwt", "uiSwing", "updater")
        //        bundle("base", base)
        bundle("full", listOf("core", "ij", "ij1Patcher", "common", "deprecated", "launcher", "legacy", "matlab",
                              "mesh", "meshIo", "notebook", "omero", "omeroLegacy", "opencv", "ops", "pluginsBatch",
                              "pluginsCommands", "pluginsTools", "pluginsUploaderSsh", "pluginsUploaderWebdav",
                              "scripting", "server", "tensorflow", "uiAwt", "uiSwing", "updater", "opFinder"))
    }
}