package com.example.learningandroid

import android.util.Log
import androidx.lifecycle.ViewModel
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

    private suspend fun fetchData() {
        Log.d("fetchData()", "hi From fetchData()")
    }
    override fun onCleared() {
        super.onCleared()
        ioScope.cancel()
    }
}