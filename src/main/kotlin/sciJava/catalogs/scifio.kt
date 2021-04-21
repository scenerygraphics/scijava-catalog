package sciJava.catalogs

import org.gradle.api.initialization.resolve.MutableVersionCatalogContainer

fun MutableVersionCatalogContainer.addScifio() {

    create("scifio").apply {

        // SCIFIO - https://github.com/scifio/scifio
        alias("core").to("io.scif:scifio:0.41.1")

        // SCIFIO-BF-compat - https://github.com/scifio/scifio-bf-compat
        alias("bfCompat").to("io.scif:scifio-bf-compat:4.1.0")

        // SCIFIO Command Line Tools - https://github.com/scifio/scifio-cli
        alias("cli").to("io.scif:scifio-cli:0.6.1")

        // SCIFIO HDF5 - https://github.com/scifio/scifio-hdf5
        alias("hdf5").to("io.scif:scifio-hdf5:0.2.1")

        // SCIFIO JAI Image I/O - https://github.com/scifio/scifio-jai-imageio
        alias("jaiImageIO").to("io.scif:scifio-jai-imageio:1.1.1")

        // SCIFIO-LifeSci - https://github.com/scifio/scifio-lifesci
        alias("lifesci").to("io.scif:scifio-lifesci:0.9.0")

        // SCIFIO-OME-XML - https://github.com/scifio/scifio-ome-xml
        alias("omeXml").to("io.scif:scifio-ome-xml:0.16.1")

        bundle("all", listOf("core", "bfCompat", "cli", "hdf5", "jaiImageIO", "lifesci", "omeXml"))
    }
}