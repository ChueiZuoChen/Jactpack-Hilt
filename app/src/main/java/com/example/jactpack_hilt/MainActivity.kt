package com.example.jactpack_hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "Test string : $testString")

        Log.d("MainActivity", "Test string5 : $testString5")
    }
}