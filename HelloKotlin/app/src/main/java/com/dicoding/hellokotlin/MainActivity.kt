package com.dicoding.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi komponen
        var edTglLahir = findViewById<EditText>(R.id.ed_tanggal_lahir)
        var btnKlik = findViewById<Button>(R.id.btn_klik)
        var tvHasil = findViewById<TextView>(R.id.tv_hasil)

        btnKlik.setOnClickListener{
            val input = edTglLahir.text.toString()
            val hasil = when(input.toInt()){
                in 1946.rangeTo(1964) -> "Baby Boomers"
                in 1965.rangeTo(1980) -> "X"
                in 1981.rangeTo(1995) -> "Millenial"
                in 1996.rangeTo(2010) -> "Z"
                else -> "Gak ada zaman"
            }

            tvHasil.text = "Kamu generasi $hasil"
        }
    }
}