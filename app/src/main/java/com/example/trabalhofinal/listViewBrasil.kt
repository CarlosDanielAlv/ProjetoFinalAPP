package com.example.trabalhofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.trabalhofinal.Adapter.AdapterCiadeBrasil

class listViewBrasil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brasil)

        // Escondendo barra de ação da tela
        supportActionBar?.hide()

        // Array de Nomes
        val arrayNomeCidade = arrayOf(
            "Bonito, Mato Grosso do Sul",
            "Lençóis (Chapada Diamantina), Bahia",
            "Pirenópolis, Goiás",
            "Alto Paraíso (Chapada dos Veadeiros), Goiás"
        )

        // Array de img
        val arrayImgCidade = arrayOf(
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
        )

        // Passando atributos para meu adapter
        val adapterCidadeBrasil = AdapterCiadeBrasil(this, arrayNomeCidade, arrayImgCidade)
        // Capturando minha lista
        val listaCidades = findViewById<ListView>(R.id.listView_brasil)
        // Inicializando
        listaCidades.adapter = adapterCidadeBrasil

        // Evento de click
        listaCidades.setOnItemClickListener(){ adapterView, view, position, id->

            // Definindo qual tela acessar
            val intent = Intent(this, brasilCidade::class.java)
            // Passando o atributo postion como parametro
            intent.putExtra("posicao", position)
            // Iniciando a próxima tela
            startActivity(intent)
        }
    }
}