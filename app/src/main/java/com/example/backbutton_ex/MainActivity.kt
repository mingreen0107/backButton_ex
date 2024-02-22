package com.example.backbutton_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import android.window.OnBackInvokedDispatcher

class MainActivity : AppCompatActivity() {

    private var isDouble = false

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        Log.d("MainActivity", "backbutton")
        if(isDouble == true) {
            finish()
        }

        isDouble = true
        Toast.makeText(this, "종료시 더블클릭", Toast.LENGTH_LONG).show()

        Handler().postDelayed(Runnable {
            isDouble = false
        }, 2000)
    }

}