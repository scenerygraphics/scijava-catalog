package sciJava.catalogs

import org.gradle.api.initialization.resolve.MutableVersionCatalogContainer

fun MutableVersionCatalogContainer.addScifio() {

    create("scifio") {

        // SCIFIO - https://github.com/scifio/scifio
        it.alias("scifio").to("io.scif:scifio:0.41.1")

        //            <!-- SCIFIO-BF-compat - https://github.com/scifio/scifio-bf-compat -->
        //            <dependency>
        //            <groupId>io.scif</groupId>
        //            <artifactId>scifio-bf-compat</artifactId>
        //            <version>${scifio-bf-compat.version}</version>
        //            </dependency>
        //
        //            <!-- SCIFIO Command Line Tools - https://github.com/scifio/scifio-cli -->
        //            <dependency>
        //            <groupId>io.scif</groupId>
        //            <artifactId>scifio-cli</artifactId>
        //            <version>${scifio-cli.version}</version>
        //            </dependency>
        //
        //            <!-- SCIFIO HDF5 - https://github.com/scifio/scifio-hdf5 -->
        //            <dependency>
        //            <groupId>io.scif</groupId>
        //            <artifactId>scifio-hdf5</artifactId>
        //            <version>${scifio-hdf5.version}</version>
        //            </dependency>
        //
        //            <!-- SCIFIO JAI Image I/O - https://github.com/scifio/scifio-jai-imageio -->
        //            <dependency>
        //            <groupId>io.scif</groupId>
        //            <artifactId>scifio-jai-imageio</artifactId>
        //            <version>${scifio-jai-imageio.version}</version>
        //            </dependency>
        //
        //            <!-- SCIFIO-LifeSci - https://github.com/scifio/scifio-lifesci -->
        //            <dependency>
        //            <groupId>io.scif</groupId>
        //            <artifactId>scifio-lifesci</artifactId>
        //            <version>${scifio-lifesci.version}</version>
        //            </dependency>
        //
        //            <!-- SCIFIO-OME-XML - https://github.com/scifio/scifio-ome-xml -->
        //            <dependency>
        //            <groupId>io.scif</groupId>
        //            <artifactId>scifio-ome-xml</artifactId>
        //            <version>${scifio-ome-xml.version}</version>
        //            </dependency>
    }
}