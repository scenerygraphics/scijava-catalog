package sciJava.catalogs

import org.gradle.api.initialization.resolve.MutableVersionCatalogContainer

/** Fiji - https://github.com/fiji */
fun MutableVersionCatalogContainer.addFiji() {

    create("fiji").apply {

        // Fiji - https://github.com/fiji/fiji
        alias("fiji").to("sc.fiji:fiji:2.2.0")

        // Standard Fiji projects

        alias("analyzeSkeleton").to("sc.fiji:AnalyzeSkeleton_:3.4.2")

        alias("anisotropicDiffusion2D").to("sc.fiji:Anisotropic_Diffusion_2D:2.0.1")
        alias("archipelagoPlugins").to("sc.fiji:Archipelago_Plugins:0.5.4")
        alias("arrow").to("sc.fiji:Arrow_:2.0.2")
        alias("autoLocalThreashold").to("sc.fiji:Auto_Local_Threshold:1.10.1")
        alias("autoThreashold").to("sc.fiji:Auto_Threshold:1.17.2")
        alias("balloonSegmentation").to("sc.fiji:BalloonSegmentation_:3.0.1")
        alias("bugSubmitter").to("sc.fiji:Bug_Submitter:2.1.1")
        alias("cpuMeter").to("sc.fiji:CPU_Meter:2.0.1")
        alias("calculatorPlus").to("sc.fiji:Calculator_Plus:2.0.1")
        alias("cellCounter").to("sc.fiji:Cell_Counter:3.0.0")
        alias("colocalisationAnalysis").to("sc.fiji:Colocalisation_Analysis:3.0.5")
        alias("colorHistogram").to("sc.fiji:Color_Histogram:2.0.7")
        alias("colorInspector3D").to("sc.fiji:Color_Inspector_3D:2.5.0")
        alias("colourDeconvolution").to("sc.fiji:Colour_Deconvolution:3.0.3")
        alias("correctBleach").to("sc.fiji:CorrectBleach_:2.0.3")
        alias("correct3dDrift").to("sc.fiji:Correct_3D_Drift:1.0.6")
        alias("descriptorBasedRegistration").to("sc.fiji:Descriptor_based_registration:2.1.7")
        alias("dichromacy").to("sc.fiji:Dichromacy_:2.1.2")
        alias("directionality").to("sc.fiji:Directionality_:2.3.0")
        alias("fsAlignTrakEM2").to("sc.fiji:FS_Align_TrakEM2:2.0.3")
        alias("featureDetection").to("sc.fiji:Feature_Detection:2.0.2")
//        alias("_3dBlobSegmentation").to("sc.fiji:3D_Blob_Segmentation:3.0.1")
        alias("archipelago").to("sc.fiji:Fiji_Archipelago:2.0.1")
        alias("developer").to("sc.fiji:Fiji_Developer:2.0.7")
        alias("packageMaker").to("sc.fiji:Fiji_Package_Maker:2.1.1")
        alias("plugins").to("sc.fiji:Fiji_Plugins:3.1.1")
        alias("filamentDetector").to("sc.fiji:FilamentDetector:1.0.0")
        alias("flowJ").to("sc.fiji:FlowJ_:2.0.1")
        alias("graphCut").to("sc.fiji:Graph_Cut:1.0.2")
        alias("grayMorphology").to("sc.fiji:Gray_Morphology:2.3.5")
        alias("h5jLoaderPlugin").to("org.janelia:H5J_Loader_Plugin:1.1.0")
        alias("hdf5Vibez").to("sc.fiji:HDF5_Vibez:1.1.0")
        alias("helmholtzAnalysis").to("sc.fiji:Helmholtz_Analysis:2.0.2")
        alias("ijRobot").to("sc.fiji:IJ_Robot:2.0.1")
        alias("io").to("sc.fiji:IO_:4.1.0")
        alias("image5D").to("sc.fiji:Image_5D:2.0.2")
//        alias("_3dObjectsCounter").to("sc.fiji:3D_Objects_Counter:2.0.1")
//        alias("_3dViewer").to("sc.fiji:3D_Viewer:4.0.3")
        alias("imageExpressionParser").to("sc.fiji:Image_Expression_Parser:3.0.1")
        alias("interactive3dSurfacePlot").to("sc.fiji:Interactive_3D_Surface_Plot:3.0.0")
        alias("isoDataClassifier").to("sc.fiji:IsoData_Classifier:2.0.1")
        alias("kappa").to("sc.fiji:Kappa:2.0.0")
        alias("kuwaharaFilter").to("sc.fiji:Kuwahara_Filter:2.0.1")
        alias("kymographBuilder").to("sc.fiji:KymographBuilder:2.1.1")
        alias("lsmReader").to("sc.fiji:LSM_Reader:4.1.2")
        alias("lsmToolbox").to("sc.fiji:LSM_Toolbox:4.1.2")
        alias("lassoAndBlowTool").to("sc.fiji:Lasso_and_Blow_Tool:2.0.2")
        alias("linearKuwahara").to("sc.fiji:Linear_Kuwahara:2.0.1")
        alias("localThickness").to("sc.fiji:LocalThickness_:4.0.3")
        alias("mTrack2").to("sc.fiji:MTrack2_:2.0.1")
        alias("mip").to("sc.fiji:M_I_P:2.0.1")
        alias("manualTracking").to("sc.fiji:Manual_Tracking:2.1.1")
        alias("multiKymograph").to("sc.fiji:Multi_Kymograph:3.0.1")
        alias("omeVisual").to("sc.fiji:OMEVisual:2.0.0")
        alias("pivAnalyser").to("sc.fiji:PIV_analyser:1.1.2")
        alias("quickPalm").to("sc.fiji:QuickPALM_:1.1.2")
        alias("rats").to("sc.fiji:RATS_:2.0.2")
        alias("reconstructReader").to("sc.fiji:Reconstruct_Reader:2.0.4")
        alias("spimOpener").to("sc.fiji:SPIM_Opener:2.0.2")
        alias("spimRegistration").to("sc.fiji:SPIM_Registration:5.0.21")
        alias("samples").to("sc.fiji:Samples_:2.0.2")
        alias("seriesLabeler").to("sc.fiji:Series_Labeler:2.0.1")
        alias("sioxSegmentation").to("sc.fiji:Siox_Segmentation:1.0.5")
        alias("skeletonize3d").to("sc.fiji:Skeletonize3D_:2.1.1")
        alias("splineDeformationGenerator").to("sc.fiji:SplineDeformationGenerator_:2.0.2")
        alias("stackManipulation").to("sc.fiji:Stack_Manipulation:2.1.2")
        alias("statisticalRegionMerging").to("sc.fiji:Statistical_Region_Merging:2.0.1")
        alias("stitching").to("sc.fiji:Stitching_:3.1.6")
        alias("syncWin").to("sc.fiji:Sync_Win:1.7-fiji4")
        alias("threadKiller").to("sc.fiji:Thread_Killer:2.0.1")
        alias("timeLapse").to("sc.fiji:Time_Lapse:2.1.1")
        alias("timeStamper").to("sc.fiji:Time_Stamper:2.1.0")
        alias("toAst").to("sc.fiji:ToAST_:25.0.2")
        alias("topoJ").to("sc.fiji:TopoJ_:2.0.1")
        alias("trackMate").to("sc.fiji:TrackMate_:6.0.1")
        alias("trainableSegmentation").to("sc.fiji:Trainable_Segmentation:3.2.34")
        alias("trakEm2Archipelago").to("sc.fiji:TrakEM2_Archipelago:2.0.3")
        alias("vibLib").to("sc.fiji:VIB-lib:2.2.0")
        alias("vib").to("sc.fiji:VIB_:3.0.3")
        alias("vaad3dReader").to("sc.fiji:Vaa3d_Reader:2.0.3")
        alias("vaa3dWriter").to("sc.fiji:Vaa3d_Writer:1.0.3")
        alias("videoEditing").to("sc.fiji:Video_Editing:2.0.1")
        alias("view5d").to("sc.fiji:View5D_:2.3.1")
        alias("volumeCalculator").to("sc.fiji:Volume_Calculator:2.0.2")
        alias("volumeViewer").to("sc.fiji:Volume_Viewer:2.01.2")
        alias("bUnwarpJ").to("sc.fiji:bUnwarpJ_:2.6.13")
        alias("bij").to("sc.fiji:bij:1.0.0")
        alias("blockmatching").to("sc.fiji:blockmatching_:2.1.3")
        alias("lib").to("sc.fiji:fiji-lib:2.1.2")
        alias("legacyImglib1").to("sc.fiji:legacy-imglib1:1.1.9")
        alias("levelSets").to("sc.fiji:level_sets:1.0.2")
        alias("palOptimization").to("sc.fiji:pal-optimization:2.0.1")
        alias("panorama").to("sc.fiji:panorama_:3.0.2")
        alias("registerVirtualStackSlices").to("sc.fiji:register_virtual_stack_slices:3.0.5")
        alias("registration3d").to("sc.fiji:registration_3d:2.0.1")
        alias("weaveJy2java").to("sc.fiji:weave_jy2java:2.1.1")

        bundle("all", listOf("fiji", "analyzeSkeleton", "anisotropicDiffusion2D", "archipelagoPlugins", "arrow",
                             "autoLocalThreashold", "autoThreashold", "balloonSegmentation", "bugSubmitter", "cpuMeter",
                             "calculatorPlus", "cellCounter", "colocalisationAnalysis", "colorHistogram",
                             "colorInspector3D", "colourDeconvolution", "correctBleach", "correct3dDrift",
                             "descriptorBasedRegistration", "dichromacy", "directionality", "fsAlignTrakEM2",
                             "featureDetection", /*"_3dBlobSegmentation",*/ "archipelago", "developer", "packageMaker",
                             "plugins", "filamentDetector", "flowJ", "graphCut", "grayMorphology", "h5jLoaderPlugin",
                             "hdf5Vibez", "helmholtzAnalysis", "ijRobot", "io", "image5D",
                             "imageExpressionParser", /*"_3dObjectsCounter", "_3dViewer",*/ "interactive3dSurfacePlot",
                             "isoDataClassifier", "kappa", "kuwaharaFilter", "kymographBuilder", "lsmReader",
                             "lsmToolbox", "lassoAndBlowTool", "linearKuwahara", "localThickness", "mTrack2", "mip",
                             "manualTracking", "multiKymograph", "omeVisual", "pivAnalyser", "quickPalm", "rats",
                             "reconstructReader", "spimOpener", "spimRegistration", "samples", "seriesLabeler",
                             "sioxSegmentation", "skeletonize3d", "splineDeformationGenerator", "stackManipulation",
                             "statisticalRegionMerging", "stitching", "syncWin", "threadKiller", "timeLapse",
                             "timeStamper", "toAst", "topoJ", "trackMate", "trainableSegmentation",
                             "trakEm2Archipelago", "vibLib", "vib", "vaad3dReader", "vaa3dWriter", "videoEditing",
                             "view5d", "volumeCalculator", "volumeViewer", "bUnwarpJ", "bij", "blockmatching", "lib",
                             "legacyImglib1", "levelSets", "palOptimization", "panorama", "registerVirtualStackSlices",
                             "registration3d", "weaveJy2java"))
    }
}