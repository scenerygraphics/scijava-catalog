package sciJava.catalogs

import org.gradle.api.initialization.resolve.MutableVersionCatalogContainer

/** ImgLib2 - https://github.com/imglib */
fun MutableVersionCatalogContainer.addImgLib2() {

    create("imgLib2").apply {

        // ImgLib2 - https://github.com/imglib/imglib2
        alias("core").to("net.imglib2:imglib2:5.11.1")

        // ImgLib2 Algorithms - https://github.com/imglib/imglib2-algorithm
        alias("algorithms").to("net.imglib2:imglib2-algorithm:0.11.2")

        // ImgLib2 Algorithms FFT - https://github.com/imglib/imglib2-algorithm-fft
        alias("algorithmFft").to("net.imglib2:imglib2-algorithm-fft:0.2.0")

        // ImgLib2 Algorithms GPL - https://github.com/imglib/imglib2-algorithm-gpl
        alias("algorithmGpl").to("net.imglib2:imglib2-algorithm-gpl:0.2.5")

        // ImgLib2 Cache - https://github.com/imglib/imglib2-cache
        alias("cache").to("net.imglib2:imglib2-cache:1.0.0-beta-16")

        // ImgLib2 IJ - https://github.com/imglib/imglib2-ij
        alias("ij").to("net.imglib2:imglib2-ij:2.0.0-beta-46")

        // ImgLib2 RealTransform - https://github.com/imglib/imglib2-realtransform
        alias("realTransform").to("net.imglib2:imglib2-realtransform:3.1.0")

        // ImgLib2 ROI - https://github.com/imglib/imglib2-roi
        alias("roi").to("net.imglib2:imglib2-roi:0.11.0")

        // ImgLib2 Scripting - https://github.com/imglib/imglib2-script
        alias("script").to("net.imglib2:imglib2-script:0.2.4")

        // ImgLib2 UI - https://github.com/imglib/imglib2-ui
        alias("ui").to("net.imglib2:imglib2-ui:2.0.1")

        // ImgLib2 Unsafe - https://github.com/imglib/imglib2-unsafe
        alias("unsafe").to("net.imglib2:imglib2-unsafe:0.4.0")

        val full = arrayListOf("core", "algorithms", "algorithmFft", "algorithmGpl", "cache", "ij", "realTransform",
            "roi", "script", "ui", "unsafe")
        bundle("full", full)
    }
}
