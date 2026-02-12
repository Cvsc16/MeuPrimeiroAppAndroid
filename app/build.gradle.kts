plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.dev.caiovinicius.meuprimeiroappandroid"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.dev.caiovinicius.meuprimeiroappandroid"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures {
        viewBinding = true
    }

}

dependencies {
    implementation(libs.bundles.androidx)
    implementation(libs.material)
    testImplementation(libs.junit)
}