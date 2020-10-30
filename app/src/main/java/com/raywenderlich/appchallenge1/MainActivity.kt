package com.raywenderlich.appchallenge1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    internal lateinit var vegetaRage: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vegetaRage = findViewById(R.id.vegetaRage)

        vegetaRage.setOnClickListener { view ->
            val text = "Rage"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()


        }
    }
}