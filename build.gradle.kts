import core.GenerateCode

plugins {
    // Apply the Java Gradle plugin development plugin to add support for developing Gradle plugins
    `java-gradle-plugin`
    embeddedKotlin("jvm")
    `maven-publish`
    `java-library`
    id("com.gradle.plugin-publish") version "1.2.1"
}

group = "org.scijava"
version = "35.1.1+4"

repositories {
    google()
    mavenCentral()
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform(embeddedKotlin("bom")))

    // Use the Kotlin JDK 8 standard library.
    implementation(embeddedKotlin("stdlib-jdk8"))

    // Use the Kotlin test library.
    testImplementation(embeddedKotlin("test"))

    // Use the Kotlin JUnit integration.
    testImplementation(embeddedKotlin("test-junit"))
}

gradlePlugin {
    website = "https://github.com/scijava/gradle-catalog"
    vcsUrl = "https://github.com/scijava/gradle-catalog"
    // Define the plugin
    plugins.create("scijava-catalog") {
        id = "org.scijava.catalogs"
        displayName = "SciJava Gradle catalog"
        description = "Take advantage of the whole SciJava ecosystem via Gradle catalogs feature"
        implementationClass = "sciJava.SciJavaCatalogPlugin"
        tags = listOf("scijava", "catalog")
    }
}
kotlin.jvmToolchain(8)

tasks {
    val generateCode by registering(GenerateCode::class)
    kotlin.sourceSets.main { kotlin.srcDir(generateCode) }
}

// Add a source set for the functional test suite
//val functionalTestSourceSet = sourceSets.create("functionalTest") {
//}
//
//gradlePlugin.testSourceSets(functionalTestSourceSet)
//configurations.getByName("functionalTestImplementation").extendsFrom(configurations.getByName("testImplementation"))
//
//// Add a task to run the functional tests
//val functionalTest by tasks.registering(Test::class) {
//    testClassesDirs = functionalTestSourceSet.output.classesDirs
//    classpath = functionalTestSourceSet.runtimeClasspath
//}
//
//val check by tasks.getting(Task::class) {
//    // Run the functional tests as part of `check`
//    dependsOn(functionalTest)
//}