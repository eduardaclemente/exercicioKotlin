package com.example.eduardaalmeidaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var util = EduardaUtil()

    fun exibirMensagem(view: View) {
        var nome = findViewById<TextView>(R.id.textView)
        var campoAlterado = findViewById<TextView>(R.id.textName)

        nome.text = "Seja bem vindo, "+ campoAlterado.text.toString() + " !!❤❤"

        util.exibirMensagem(campoAlterado.text.toString())
    }

    fun proximaTela(view: View) {
        var campoTexto = findViewById<TextView>(R.id.textName)

        var intent = Intent(this, SegundaActivity::class.java).apply {
            putExtra("insertDados", campoTexto.text.toString())
        }

        startActivity(intent)
    }

}