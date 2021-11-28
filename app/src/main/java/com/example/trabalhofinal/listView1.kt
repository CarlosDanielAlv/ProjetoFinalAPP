package com.example.trabalhofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.trabalhofinal.Adapter.AdapterPais

class listView1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view1)

        // Escondendo barra de ação da tela
        supportActionBar?.hide()

        // Array de Imagens
        val arrayImgPaises = arrayOf(
            R.drawable.brasil,
            R.drawable.botswana,
            R.drawable.chile,
            R.drawable.filipinas,
            R.drawable.islandia,
            R.drawable.portugal,
            R.drawable.seychelles
        )

        val adapterPais = AdapterPais(this, arrayImgPaises)
        val listaPais = findViewById<ListView>(R.id.listView_paises)
        listaPais.adapter = adapterPais
        val posicao:Int = intent.getIntExtra("position",-1)
        // Evento de click
        listaPais.setOnItemClickListener(){adapterView, view, position, id->

            Toast.makeText(this, position.toString(), Toast.LENGTH_SHORT).show()

            val intent = Intent(this, listViewBrasil::class.java)
            intent.putExtra("posicao", position)
            startActivity(intent)
        }

    }


}