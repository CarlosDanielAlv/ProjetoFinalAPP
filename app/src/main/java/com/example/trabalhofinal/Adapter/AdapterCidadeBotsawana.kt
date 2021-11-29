package com.example.trabalhofinal.Adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.trabalhofinal.R

class AdapterCidadeBotsawana(
    val context: Activity,
    private val nomeCidadeBotsawana: Array<String>,
    private val ImgCidadeBotsawana: Array<Int>
    ) :
    ArrayAdapter<String>(context, R.layout.cidade_item, nomeCidadeBotsawana) {

        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

            val inflater = context.layoutInflater
            val view = inflater.inflate(R.layout.cidade_item, null, true)
            val txtNomeCidade = view.findViewById<TextView>(R.id.txtNomeCidade)
            val imgCidade = view.findViewById<ImageView>(R.id.imagemCidade)

            // Setando atributos aos componentes
            txtNomeCidade.text = nomeCidadeBotsawana[position]
            imgCidade.setBackgroundResource(ImgCidadeBotsawana[position])

            return view
        }

    }

