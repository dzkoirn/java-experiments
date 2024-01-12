
plugins {
    id("java")
    id("application")
    id("org.graalvm.buildtools.native")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass = "com.github.dzkoirn.javaexperiments.Main"
}

repositories {
    mavenCentral()
}

