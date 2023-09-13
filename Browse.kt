package com.example.browse

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Browse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browse)

        val amazonval = findViewById<Button>(R.id.button2)
        val flipkartval = findViewById<Button>(R.id.button3)
        val googleval = findViewById<Button>(R.id.button4)
        val toival = findViewById<Button>(R.id.button5)
        val openURL = Intent(Intent.ACTION_VIEW)

        amazonval.setOnClickListener {
            openURL.data = Uri.parse("https://www.amazon.in/")
            startActivity(openURL)
        }
        flipkartval.setOnClickListener {
            openURL.data = Uri.parse("https://www.flipkart.com/")
            startActivity(openURL)
        }
        googleval.setOnClickListener {
            openURL.data = Uri.parse("https://www.google.com/")
            startActivity(openURL)
        }
        toival.setOnClickListener {
            openURL.data = Uri.parse("https://m.timesofindia.com/")
            startActivity(openURL)
        }
    }
}