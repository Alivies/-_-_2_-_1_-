package com.example.toasthandler

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button_ok)
        button?.setOnClickListener()
        {
            Toast.makeText(this@MainActivity, "Кнопка ОК", Toast.LENGTH_LONG).show() }
        //Toast.makeText(this, "Кнопка ОК", Toast.LENGTH_SHORT).show()
    }

}