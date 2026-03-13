package com.example.activityintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView((R.layout.activity_main))
        supportActionBar?.hide()

        //Logika Button Form
        val btnForm = findViewById<Button>(R.id.btnForm)

        btnForm.setOnClickListener {
            val intent = Intent(this, FormActivity::class.java)
            startActivity(intent)
        }

        //Logika Button Linkedln
        val btnLinkedln = findViewById<Button>(R.id.btnLinkedln)

        btnLinkedln.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedin.com/in/thomas-wisnu/")
            startActivity(intent)
        }

    }
}