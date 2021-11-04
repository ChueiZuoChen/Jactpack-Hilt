package com.example.jactpack_hilt

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named


/*
* for viewmodel needs to annotate class as @HiltViewModel
* and before constructor annotate @Inject
*
* */

@HiltViewModel
class TestViewModel @Inject constructor(
    @Named("Dependency1") testString4:String
):ViewModel() {
    init {
        Log.d("ViewModel", "Test string4 from ViewModel: $testString4")
        
    }
}