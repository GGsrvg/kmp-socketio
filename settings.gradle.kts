pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        mavenLocal()
    }
}

rootProject.name = "kmp-socketio"
include(":kmp-socketio")

include(":example:shared")
if (System.getProperty("os.name") == "Mac OS X") {
    include(":example:androidApp")
}
