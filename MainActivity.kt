package com.example.browse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val submitval = findViewById<Button>(R.id.button)

        submitval.setOnClickListener {
            val intent1 = Intent(this, Browse::class.java)
            startActivity(intent1)
        }
    }
}