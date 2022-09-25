package com.example.eduardaalmeidaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        var parametroRecebido = intent.getStringExtra("insertDados")
        var messageOla = findViewById<TextView>(R.id.textSegunda)
        messageOla.text = "Ola "+ parametroRecebido
    }
}