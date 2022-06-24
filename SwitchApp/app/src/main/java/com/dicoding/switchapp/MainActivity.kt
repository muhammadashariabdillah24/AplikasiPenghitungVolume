package com.dicoding.switchapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveSatu: Button = findViewById(R.id.btn_move_satu)
        btnMoveSatu.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_move_satu -> {
                val moveSatu = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(moveSatu)
            }
        }
    }
}