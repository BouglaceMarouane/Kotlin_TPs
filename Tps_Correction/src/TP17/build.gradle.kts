// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}

extra.apply {
    set("kotlin_version", "1.8.0")
    set("compileSdk", 34)
    set("minSdk", 29)
    set("targetSdk", 34)
}

