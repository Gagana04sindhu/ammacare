plugins {
    id("com.android.application")
    // ALL KOTLIN PLUGINS ARE GONE
}

android {
    namespace = "com.example.ammacareversion0"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.ammacareversion0"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    // ALL KOTLIN AND KSP BLOCKS ARE GONE
}

dependencies {
    // AndroidX Core & UI Libraries
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.activity:activity:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.android.volley:volley:1.2.1")

    // Location Services
    implementation("com.google.android.gms:play-services-location:21.2.0")

    // ALL ROOM DEPENDENCIES ARE GONE

    // Testing Libraries
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}

