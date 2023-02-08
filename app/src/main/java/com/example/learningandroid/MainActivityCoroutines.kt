package com.example.learningandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.system.measureTimeMillis

class MainActivityCoroutines : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_coroutines)
        val model : MainViewModel by viewModels()
        model.exampleMethodUsingAsync()
        model.exampleMethod()
        GlobalScope.launch {
            val time  = measureTimeMillis {
                val one  = sampleOne()
                val two = sampleTwo()
                //5
                Log.d("GlobalScope()" ,"hi this is one -> $one and this is two $two")
            }
            //6
            Log.d("after Time()" ,"time taken is $time")

        }
        //1
        Log.d("onCreate()" ,"Coroutines are finished")
    }
    private suspend fun sampleOne():Int {
        //2
        Log.d("sampleOne()" ,"Hi from SampleOne()")
        delay(1000)
        return 1
    }
    private  suspend fun sampleTwo() :Int{
        //3
        Log.d("sampleTwo()" ,"Hi from SampleTwo()")
        delay(2000)
        return 2

    }

}

