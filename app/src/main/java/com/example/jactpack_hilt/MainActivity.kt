package com.example.jactpack_hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

//every time when I want to inject dependency the entry point must be annotate.
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //using late initialize var to declare the instance variable
    @Inject
    @Named("Dependency2")
    lateinit var testString: String

    @Inject
    @Named("Dependency5")
    lateinit var testString5:String


    /*for viewmodel inject you need to go to build.gradle to add
    * Activity KTX for viewModels()
    * implementation "androidx.activity:activity-ktx:1.4.0"
    * this is for viewmodel inject by delegate viewmodel factory behind the scene
    * */
    private val viewModel: TestViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "Test string : $testString")

        Log.d("MainActivity", "Test string5 : $testString5")

        viewModel
    }
}