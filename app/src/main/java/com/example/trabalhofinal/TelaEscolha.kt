package com.example.trabalhofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaEscolha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_escolha)

        val buttonAviao = findViewById<Button>(R.id.bt_aviao)
        val buttonTrem = findViewById<Button>(R.id.bt_trem)
        val buttonCarro = findViewById<Button>(R.id.bt_carro)

        // Escondendo barra de ação da tela
        supportActionBar?.hide()

        // Métodos Click
        buttonAviao.setOnClickListener(){
            // Alterar quando tiver a tela
            val intent = Intent(this, listView1::class.java)
            startActivity(intent)
        }

        buttonTrem.setOnClickListener(){
            // Alterar quando tiver a tela
            val intent = Intent(this, listView1::class.java)
            startActivity(intent)
        }

        buttonCarro.setOnClickListener(){
            // Alterar quando tiver a tela
            val intent = Intent(this, listView1::class.java)
            startActivity(intent)
        }
    }
}