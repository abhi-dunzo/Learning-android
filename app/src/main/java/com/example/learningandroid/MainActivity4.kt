package com.example.learningandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.*


class MainActivity4 : AppCompatActivity(R.layout.activity_main4) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(savedInstanceState ==null){
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<BlankFragment2>(R.id.fragment_container_view_2)
            }
        }
//        setContentView(R.layout.activity_main4)
        Log.d("OnCreate" , "Hi From onCreate() from mainActivity4")
    }

    override fun onStart() {
        super.onStart()

        Log.d("onStart() is called ", "Hi from onStart() in  mainActivity4")

    }

    override fun onResume() {
        // works after onStart , whenever the application is made to come in foreground the lifecycle
        // goes like this onStart-> onResume ->onPause
        super.onResume()
        Log.d("onResume() is called ", "Hi from onResume() in  mainActivity4")

    }

    override fun onPause() {
        // works when the application goes in background
        super.onPause()
        val i = Intent(this , MainActivity::class.java)
        startActivity(i)
        Log.d("onPause() is called ", "Hi from onPause() in  mainActivity4")

    }


    override  fun onStop(){
        //comes after pause

        super.onStop()
        Log.d("onStop() is called" ,"Hi from onStop() in mainActivity4")
    }

    override fun onDestroy() {
        //when app is removed from background
        super.onDestroy()
        Log.d("onDestroy() is called" ,"hi from onDestroy() in mainActivity4")

    }

    //Why ?  is this line executing first
    var s = Log.d("log from mainActivity4 is called ", "hi from mainActivity4")

}