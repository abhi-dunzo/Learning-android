package com.example.learningandroid

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    //
    override fun onStart() {
        //makes the activity visible to user
        super.onStart()
        Log.d("onStart() is called ", "hi from onStart() of mainActivity")

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        // used when we need some logic to be performed only once during the whole lifecycle
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<BlankFragment>(R.id.fragment_container_view)
            }
        }
//        setContentView(R.layout.activity_main)
        Log.d("onCreate() is called ", "hi from onCreate() of mainActivity")

    }

    override fun onResume() {
        // works after onStart , whenever the application is made to come in foreground the lifecycle
        // goes like this onStart-> onResume ->onPause
        super.onResume()
        Log.d("onResume() is called ", "hi from onResume() in  mainActivity")

    }

    override fun onPause() {
        // works when the application goes in background
        super.onPause()
        val i = Intent(this, MainActivity4::class.java)
        startActivity(i)
        Log.d("onPause() is called ", "hi from onPause() in  mainActivity")

    }


    override fun onStop() {
        //comes after pause

        super.onStop()
        Log.d("onStop() is called", "hi from onStop() in mainActivity")

    }

    override fun onDestroy() {
        //when app is removed from background
        super.onDestroy()
        Log.d("onDestroy() is called", "hi from onDestroy() in mainActivity")

    }

    //Why ?  is this line executing first
    var s = Log.d("log from mainActivity is called ", "hi from mainActivity")


}