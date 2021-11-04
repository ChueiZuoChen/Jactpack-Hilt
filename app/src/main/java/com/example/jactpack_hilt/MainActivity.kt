package com.example.jactpack_hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

//every time when I want to inject dependency the entry point must be annotate.
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //using lateinit var to declare the instance variable
    @Inject
    lateinit var testString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "Test string : $testString")
    }
}