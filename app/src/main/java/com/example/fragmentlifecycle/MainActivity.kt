package com.example.fragmentlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LifeCycle","onCreate in Activity")
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycle","onStart in Activity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle","onResume in Activity")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle","onPause in Activity")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle","onStop in Activity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LifeCycle","onRestart in Activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle","onDestroy in Activity")
    }

}