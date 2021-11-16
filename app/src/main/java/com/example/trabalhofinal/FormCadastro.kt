package com.example.trabalhofinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FormCadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_cadastro)

        // Escondendo barra de ação da tela
        supportActionBar?.hide()
    }
}