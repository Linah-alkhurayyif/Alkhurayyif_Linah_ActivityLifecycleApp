package com.example.alkhurayyif_linah_activitylifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity","Hi, we are on onCreate function")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity","Hi, we are on onStart function")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity","Hi, we are on onRestart function")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","Hi, we are on onPause function")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","Hi, we are on onStop function")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","Hi, we are on onDestroy function")
    }
}