package com.example.activityintent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.enableEdgeToEdge

class DataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView((R.layout.activity_data))
        supportActionBar?.hide()

        //Isi Field NIM
        val IsiNim = findViewById<TextView>(R.id.tvnim)
        val ambildatanim = intent.getStringExtra("MESSAGE NIM")
        IsiNim.text = ambildatanim


        //ISI Field NAMA
        val IsiNama = findViewById<TextView>(R.id.tvnama)
        val ambildatanama = intent.getStringExtra("MESSAGE NAMA")
        IsiNama.text = ambildatanama

        //Isi Field KOTA
        val IsiKota = findViewById<TextView>(R.id.tvkota)
        val ambildatakota = intent.getStringExtra("MESSAGE KOTA")
        IsiKota.text = ambildatakota

        //Logika Button Kembali
        val btnKembali = findViewById<Button>(R.id.btnKembali)

        btnKembali.setOnClickListener {
            val intent = Intent(this, FormActivity::class.java)
            startActivity(intent)
        }

    }
}