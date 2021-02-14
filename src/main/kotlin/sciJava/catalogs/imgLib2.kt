package sciJava.catalogs

import org.gradle.api.initialization.resolve.MutableVersionCatalogContainer

/** ImgLib2 - https://github.com/imglib */
fun MutableVersionCatalogContainer.addImgLib2() {

    create("imgLib2").apply {
/*

        <!-- ImgLib2 Algorithms - https://github.com/imglib/imglib2-algorithm -->
        <imglib2-algorithm.version>0.11.2</imglib2-algorithm.version>

        <!-- ImgLib2 Algorithms FFT - https://github.com/imglib/imglib2-algorithm-fft -->
        <imglib2-algorithm-fft.version>0.2.0</imglib2-algorithm-fft.version>

        <!-- ImgLib2 Algorithms GPL - https://github.com/imglib/imglib2-algorithm-gpl -->
        <imglib2-algorithm-gpl.version>0.2.5</imglib2-algorithm-gpl.version>

        <!-- ImgLib2 Cache - https://github.com/imglib/imglib2-cache -->
        <imglib2-cache.version>1.0.0-beta-15</imglib2-cache.version>

        <!-- ImgLib2 IJ - https://github.com/imglib/imglib2-ij -->
        <imglib2-ij.version>2.0.0-beta-46</imglib2-ij.version>

        <!-- ImgLib2 RealTransform - https://github.com/imglib/imglib2-realtransform -->
        <imglib2-realtransform.version>3.1.0</imglib2-realtransform.version>

        <!-- ImgLib2 Scripting - https://github.com/imglib/imglib2-script -->
        <imglib2-script.version>0.2.4</imglib2-script.version>

        <!-- ImgLib2 UI - https://github.com/imglib/imglib2-ui -->
        <imglib2-ui.version>2.0.1</imglib2-ui.version>

        <!-- ImgLib2 Unsafe - https://github.com/imglib/imglib2-unsafe -->
        <imglib2-unsafe.version>0.4.0</imglib2-unsafe.version>
        */
        // ImgLib2 - https://github.com/imglib/imglib2
        alias("core").to("net.imglib2:imglib2:5.11.1")

        //            <!-- ImgLib2 Algorithms - https://github.com/imglib/imglib2-algorithm -->
        //            <dependency>
        //            <groupId>net.imglib2</groupId>
        //            <artifactId>imglib2-algorithm</artifactId>
        //            <version>${imglib2-algorithm.version}</version>
        //            </dependency>
        //
        //            <!-- ImgLib2 Algorithms FFT - https://github.com/imglib/imglib2-algorithm-fft -->
        //            <dependency>
        //            <groupId>net.imglib2</groupId>
        //            <artifactId>imglib2-algorithm-fft</artifactId>
        //            <version>${imglib2-algorithm-fft.version}</version>
        //            </dependency>
        //
        //            <!-- ImgLib2 Algorithms GPL - https://github.com/imglib/imglib2-algorithm-gpl -->
        //            <dependency>
        //            <groupId>net.imglib2</groupId>
        //            <artifactId>imglib2-algorithm-gpl</artifactId>
        //            <version>${imglib2-algorithm-gpl.version}</version>
        //            </dependency>
        //
        //            <!-- ImgLib2 Cache - https://github.com/imglib/imglib2-cache -->
        //            <dependency>
        //            <groupId>net.imglib2</groupId>
        //            <artifactId>imglib2-cache</artifactId>
        //            <version>${imglib2-cache.version}</version>
        //            </dependency>
        //
        //            <!-- ImgLib2 IJ - https://github.com/imglib/imglib2-ij -->
        //            <dependency>
        //            <groupId>net.imglib2</groupId>
        //            <artifactId>imglib2-ij</artifactId>
        //            <version>${imglib2-ij.version}</version>
        //            </dependency>
        //
        //            <!-- ImgLib2 RealTransform - https://github.com/imglib/imglib2-realtransform -->
        //            <dependency>
        //            <groupId>net.imglib2</groupId>
        //            <artifactId>imglib2-realtransform</artifactId>
        //            <version>${imglib2-realtransform.version}</version>
        //            </dependency>

        // ImgLib2 ROI - https://github.com/imglib/imglib2-roi
        alias("roi").to("net.imglib2:imglib2-roi:0.10.4")

        //            <!-- ImgLib2 Scripting - https://github.com/imglib/imglib2-script -->
        //            <dependency>
        //            <groupId>net.imglib2</groupId>
        //            <artifactId>imglib2-script</artifactId>
        //            <version>${imglib2-script.version}</version>
        //            </dependency>
        //
        //            <!-- ImgLib2 UI - https://github.com/imglib/imglib2-ui -->
        //            <dependency>
        //            <groupId>net.imglib2</groupId>
        //            <artifactId>imglib2-ui</artifactId>
        //            <version>${imglib2-ui.version}</version>
        //            </dependency>
        //
        //            <!-- ImgLib2 Unsafe - https://github.com/imglib/imglib2-unsafe -->
        //            <dependency>
        //            <groupId>net.imglib2</groupId>
        //            <artifactId>imglib2-unsafe</artifactId>
        //            <version>${imglib2-unsafe.version}</version>
        //            </dependency>
    }
}
