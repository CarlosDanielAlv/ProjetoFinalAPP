package com.example.trabalhofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.trabalhofinal.Adapter.AdapterCidadeFilipinas
import com.example.trabalhofinal.Adapter.AdapterCidadeIslandia

class listViewIslandia : AppCompatActivity(){
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_list_view_islandia)

    // Escondendo barra de ação da tela
    supportActionBar?.hide()

    // Array de Nomes
    val arrayNomeCidade = arrayOf(
        "Reykjavik",
        "Kopavogur",
        "Hafnarfjörður",
    )

    // Array de img
    val arrayImgCidade = arrayOf(
        R.drawable.imgi1,
        R.drawable.imgi2,
        R.drawable.imgi3,
    )
    // Passando atributos para meu adapter
    val adapterCidadeIslandia = AdapterCidadeIslandia(this, arrayNomeCidade, arrayImgCidade)
    // Capturando minha lista
    val listaCidades = findViewById<ListView>(R.id.listView_islandia)
    // Inicializando
    listaCidades.adapter = adapterCidadeIslandia

    // Evento de click
    listaCidades.setOnItemClickListener(){ adapterView, view, position, id->

        // Definindo qual tela acessar
        val intent = Intent(this, islandiaCidade::class.java)
        // Passando o atributo postion como parametro
        intent.putExtra("posicao", position)
        // Iniciando a próxima tela
        startActivity(intent)
    }
}
}