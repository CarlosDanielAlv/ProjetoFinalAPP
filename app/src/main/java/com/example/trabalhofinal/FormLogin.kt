package com.example.trabalhofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FormLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_login)

        val textView = findViewById<TextView>(R.id.txtCadastrar)
        val button = findViewById<Button>(R.id.bt_entrar)

        // Escondendo barra de ação da tela
        supportActionBar?.hide()
        iniciarComponentes()

        button.setOnClickListener(){
            val intent = Intent(this, TelaVideo::class.java)
            startActivity(intent)
        }
        textView.setOnClickListener(){
            val intent = Intent(this, FormCadastro::class.java)
            startActivity(intent)
        }
    }

    fun iniciarComponentes(){

    }
}