package com.example.trabalhofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FormCadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_cadastro)

        // Botão Confirmar
        val button = findViewById<Button>(R.id.bt_confirmar)
        // Ação Botão Confirmar
        button.setOnClickListener(){
            val intent = Intent(this, TelaPerfil::class.java)
            startActivity(intent)
        }

        // Escondendo barra de ação da tela
        supportActionBar?.hide()
    }
}