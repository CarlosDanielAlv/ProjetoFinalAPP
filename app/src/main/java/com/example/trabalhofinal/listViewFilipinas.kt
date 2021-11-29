package com.example.trabalhofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.trabalhofinal.Adapter.AdapterCidadeFilipinas

class listViewFilipinas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_filipinas)

        // Escondendo barra de ação da tela
        supportActionBar?.hide()

        // Array de Nomes
        val arrayNomeCidade = arrayOf(
            "Manila",
            "El Nido",
            "Coron",
            "Cebu"
        )

        // Array de img
        val arrayImgCidade = arrayOf(
            R.drawable.imgf1,
            R.drawable.imgf2,
            R.drawable.imgf3,
            R.drawable.imgf4,
        )
        // Passando atributos para meu adapter
        val adapterCidadeFilipinas = AdapterCidadeFilipinas(this, arrayNomeCidade, arrayImgCidade)
        // Capturando minha lista
        val listaCidades = findViewById<ListView>(R.id.listView_filipinas)
        // Inicializando
        listaCidades.adapter = adapterCidadeFilipinas

        // Evento de click
        listaCidades.setOnItemClickListener(){ adapterView, view, position, id->

            // Definindo qual tela acessar
            val intent = Intent(this, filipinasCidade::class.java)
            // Passando o atributo postion como parametro
            intent.putExtra("posicao", position)
            // Iniciando a próxima tela
            startActivity(intent)
        }
    }
}