pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
    pluginManagement {
        plugins {
            id("org.graalvm.buildtools.native") version "0.9.28"
        }
    }
}

rootProject.name = "hellograalvm"

