plugins {
    id("com.android.application")
    id("com.google.gms.google-services")

}

android {
    namespace = "com.example.chatapp"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.chatapp"
        minSdk = 30
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true
        

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        viewBinding = true
    }

}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    implementation("androidx.navigation:navigation-fragment:2.5.3")
    implementation("androidx.navigation:navigation-ui:2.5.3")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Scalable Size Unit (support for different screen sizes)
    implementation("com.intuit.sdp:sdp-android:1.0.6")
    implementation("com.intuit.ssp:ssp-android:1.0.6")

    // Rounded ImageView
    implementation("com.makeramen:roundedimageview:2.3.0")

    // Firebase
    implementation("com.google.firebase:firebase-messaging-ktx:23.2.1")
    implementation("com.google.firebase:firebase-firestore-ktx:24.7.0")
    implementation("com.google.firebase:firebase-auth-ktx:22.1.2")
    implementation("com.google.firebase:firebase-database-ktx:20.2.2")
    implementation("com.google.firebase:firebase-database:20.2.2")
    implementation("com.google.firebase:firebase-analytics")

    implementation ("com.google.firebase:firebase-bom:29.0.1")
    implementation ("androidx.appcompat:appcompat:1.4.0")


    // MultiDex
    implementation("androidx.multidex:multidex:2.0.1")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-scalars:2.9.0")

    // QR Code
    implementation ("com.journeyapps:zxing-android-embedded:4.2.0")

    // QR Code Scanner
    implementation ("com.budiyev.android:code-scanner:2.1.0")


    //Notification Badge
    implementation("com.nex3z:notification-badge:1.0.4")

    //EventBus
    implementation("org.greenrobot:eventbus:3.2.0")

    implementation(platform("com.google.firebase:firebase-bom:32.3.1"))


}

