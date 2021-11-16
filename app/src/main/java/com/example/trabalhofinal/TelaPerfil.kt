package com.example.trabalhofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaPerfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_perfil)

        // Escondendo barra de ação da tela
        supportActionBar?.hide()

        // Botão Deslogar
        val buttonDeslogar = findViewById<Button>(R.id.bt_deslogar)

        buttonDeslogar.setOnClickListener(){
            val intent = Intent(this, FormLogin::class.java)
            startActivity(intent)
        }

    }
}