package com.example.activityintent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.enableEdgeToEdge

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView((R.layout.activity_form))
        supportActionBar?.hide()

        // Ambil Isi Field NIM , NAMA, KOTA
        val IsiNim = findViewById<EditText>(R.id.Formnim)
        val IsiNama = findViewById<EditText>(R.id.Formnama)
        val IsiKota = findViewById<EditText>(R.id.Formkota)

        //Logika Button Kirim
        val btnKirim = findViewById<Button>(R.id.btnKirim)

        btnKirim.setOnClickListener {
            val nim = IsiNim.text.toString()
            val nama = IsiNama.text.toString()
            val kota = IsiKota.text.toString()
            val intent = Intent(this, DataActivity::class.java)
            intent.putExtra("MESSAGE NIM", nim)
            intent.putExtra("MESSAGE NAMA", nama)
            intent.putExtra("MESSAGE KOTA", kota)
            startActivity(intent)
        }

    }
}