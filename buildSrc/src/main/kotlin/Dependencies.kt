object Dependencies {
    const val kotlinVersion = "1.4.10"

    const val jetpackComposeVersion = "1.0.0-alpha06"

    object AndroidX {
        private const val coreKtxVersion = "1.3.2"
        const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"

        private const val appCompatVersion = "1.2.0"
        const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"

        private const val constraintLayoutVersion = "2.0.4"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"

        object Compose {
            const val composeUi = "androidx.compose.ui:ui:$jetpackComposeVersion"

            const val composeUiTooling = "androidx.ui:ui-tooling:$jetpackComposeVersion"

            const val foundation = "androidx.compose.foundation:foundation:$jetpackComposeVersion"

            const val material = "androidx.compose.material:material:$jetpackComposeVersion"

            const val materialIconsCore = "androidx.compose.material:material-icons-core:$jetpackComposeVersion"

            const val materialIconsExtended = "androidx.compose.material:material-icons-extended:$jetpackComposeVersion"

            const val runtimeRxJava2 = "androidx.compose.runtime:runtime-rxjava2:$jetpackComposeVersion"
        }

        object Testing {
            const val composeUiTest = "androidx.ui:ui-test:$jetpackComposeVersion"

            private const val junitVersion = "1.1.2"
            const val junit = "androidx.test.ext:junit:$junitVersion"

            private const val espressoCoreVersion = "3.3.0"
            const val espressoCore = "androidx.test.espresso:espresso-core:$espressoCoreVersion"
        }
    }

    object Material {
        private const val materialVersion = "1.2.1"
        const val material = "com.google.android.material:material:$materialVersion"
    }

    object Testing {
        private const val junitVersion = "5.7.0"
        const val junitJupiterApi = "org.junit.jupiter:junit-jupiter-api:$junitVersion"

        const val junitJupiterEngine = "org.junit.jupiter:junit-jupiter-engine:$junitVersion"
    }
}