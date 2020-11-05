plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdkVersion(App.Version.compileSdkVersion)

    defaultConfig {
        minSdkVersion(App.Version.minSdkVersion)
        targetSdkVersion(App.Version.targetSdkVersion)

        applicationId = App.appId
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        compose = true
    }
    buildTypes {
        named("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }
    composeOptions {
        kotlinCompilerVersion = Dependencies.kotlinVersion
        kotlinCompilerExtensionVersion = Dependencies.jetpackComposeVersion
    }
}

dependencies {
    implementation(kotlin("stdlib", Dependencies.kotlinVersion))
    implementation(Dependencies.AndroidX.coreKtx)
    implementation(Dependencies.AndroidX.appCompat)

    implementation(Dependencies.Material.material)
    implementation(Dependencies.AndroidX.constraintLayout)

    implementation (Dependencies.AndroidX.Compose.composeUi)
    // Tooling support (Previews, etc.)
    implementation(Dependencies.AndroidX.Compose.composeUiTooling)
    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
    implementation(Dependencies.AndroidX.Compose.foundation)
    // Material Design
    implementation(Dependencies.AndroidX.Compose.material)
    // Material design icons
    implementation(Dependencies.AndroidX.Compose.materialIconsCore)
    implementation(Dependencies.AndroidX.Compose.materialIconsExtended)
    // Integration with observables
    implementation(Dependencies.AndroidX.Compose.runtimeRxJava2)

    // UI Tests
    androidTestImplementation(Dependencies.AndroidX.Testing.composeUiTest)
    // testing
    testImplementation(Dependencies.Testing.junitJupiterApi)
    testRuntimeOnly(Dependencies.Testing.junitJupiterEngine)
    // Android testing
    androidTestImplementation(Dependencies.AndroidX.Testing.junit)
    androidTestImplementation(Dependencies.AndroidX.Testing.espressoCore)
}