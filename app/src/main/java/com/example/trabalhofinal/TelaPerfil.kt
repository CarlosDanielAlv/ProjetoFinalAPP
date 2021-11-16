package com.example.trabalhofinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TelaPerfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_perfil)

        // Escondendo barra de ação da tela
        supportActionBar?.hide()

    }
}