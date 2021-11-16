package com.example.trabalhofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FormLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_login)

        val textView = findViewById<TextView>(R.id.txtCadastrar)

        // Escondendo barra de ação da tela
        supportActionBar?.hide()
        iniciarComponentes()

        textView.setOnClickListener(){
            val intent = Intent(this, FormCadastro::class.java)
            startActivity(intent)
        }
    }

    fun iniciarComponentes(){

    }
}