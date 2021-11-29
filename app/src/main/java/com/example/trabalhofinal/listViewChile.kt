package com.example.trabalhofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.trabalhofinal.Adapter.AdapterCidadeBotsawana

class listViewChile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_chile)

        // Escondendo barra de ação da tela
        supportActionBar?.hide()

        // Array de Nomes
        val arrayNomeCidade = arrayOf(
            "Santiago",
            "Pucón",
            "Valparaiso",
            "Vina Del Mar"
        )

        // Array de img
        val arrayImgCidade = arrayOf(
            R.drawable.imgc1,
            R.drawable.imgc2,
            R.drawable.imgc3,
            R.drawable.imgc4,
        )
        // Passando atributos para meu adapter
        val adapterCidadeChile = AdapterCidadeBotsawana(this, arrayNomeCidade, arrayImgCidade)
        // Capturando minha lista
        val listaCidades = findViewById<ListView>(R.id.listView_chile)
        // Inicializando
        listaCidades.adapter = adapterCidadeChile

        // Evento de click
        listaCidades.setOnItemClickListener(){ adapterView, view, position, id->

            // Definindo qual tela acessar
            val intent = Intent(this, chileCidade::class.java)
            // Passando o atributo postion como parametro
            intent.putExtra("posicao", position)
            // Iniciando a próxima tela
            startActivity(intent)
        }
    }
}