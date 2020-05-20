package com.example.spotitrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart(){
        super.onStart()
    }

    private fun connected(){}

    override fun onStop()
    {
        super.onStop()
    }
}
