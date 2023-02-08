package com.example.learningandroid

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.*

class MainViewModel : ViewModel(){
    private val job = SupervisorJob()
    private val ioScope by lazy { CoroutineScope(job+ Dispatchers.IO) }
   val d =  Log.d("ExampleOne" , "hi from exampleMethod()")

    fun exampleMethod () {
        Log.d("ExampleOne" , "hi from exampleMethod()")
        ioScope.launch {
            fetchData()
            withContext(Dispatchers.Main){

            }
        }
    }

    private suspend fun sampleOne(): Boolean {
        delay(1000L)
        return true
    }
    private suspend fun sampleTwo(): Boolean {
        delay(3000L)
        return false
    }
    fun exampleMethodUsingAsync(){
        Log.d("exampleMethodUsingAsync" , "hi from Async function()")

        viewModelScope.launch {
            val one = async { sampleOne()}
            val two = async { sampleTwo()}
            if(one.await() && two.await()){
                Log.d("exampleMethodUsingAsync" , "hi from both returned true ()")
            }else {
                Log.d("exampleMethodUsingAsync" , "one is false ")

            }
        }
        Log.d("exampleMethodUsingAsync" , " Async function() ending ....")
    }

    private suspend fun fetchData() {
        Log.d("fetchData()", "hi From fetchData()")
    }
    override fun onCleared() {
        super.onCleared()
        ioScope.cancel()
    }
}