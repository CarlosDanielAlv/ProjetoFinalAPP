package com.example.trabalhofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.trabalhofinal.Adapter.AdapterCiadeBrasil
import com.example.trabalhofinal.Adapter.AdapterCidadeBotsawana

class listViewBotsawana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_botsawana)

        // Escondendo barra de ação da tela
        supportActionBar?.hide()

        // Array de Nomes
        val arrayNomeCidade = arrayOf(
            "Gaborone",
            "Maun ",
            "Francistown",
            "Serowe"
        )

        // Array de img
        val arrayImgCidade = arrayOf(
            R.drawable.imgb1,
            R.drawable.imgb2,
            R.drawable.imgb3,
            R.drawable.imgb4,
        )
        // Passando atributos para meu adapter
        val adapterCidadeBotsawana = AdapterCidadeBotsawana(this, arrayNomeCidade, arrayImgCidade)
        // Capturando minha lista
        val listaCidades = findViewById<ListView>(R.id.listView_botsawana)
        // Inicializando
        listaCidades.adapter = adapterCidadeBotsawana

        // Evento de click
        listaCidades.setOnItemClickListener(){ adapterView, view, position, id->

            // Definindo qual tela acessar
            val intent = Intent(this, botswanaCidade::class.java)
            // Passando o atributo postion como parametro
            intent.putExtra("posicao", position)
            // Iniciando a próxima tela
            startActivity(intent)
        }
    }
}