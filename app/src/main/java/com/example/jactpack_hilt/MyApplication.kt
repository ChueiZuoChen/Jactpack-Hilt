package com.example.jactpack_hilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


/*
* Step 1. Create a class extends Application()
* Step 2. On manifests <Application> name field add that I have created class's name.
* Step 3. Create a app module type is Object
*
* */


@HiltAndroidApp
class MyApplication:Application() {
}