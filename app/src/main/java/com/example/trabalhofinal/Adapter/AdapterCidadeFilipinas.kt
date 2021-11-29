package com.example.trabalhofinal.Adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.trabalhofinal.R

class AdapterCidadeFilipinas (
    val context: Activity,
    private val nomeCidadeFilipinas: Array<String>,
    private val ImgCidadeFilipinas: Array<Int>
) :
    ArrayAdapter<String>(context, R.layout.cidade_item, nomeCidadeFilipinas) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = context.layoutInflater
        val view = inflater.inflate(R.layout.cidade_item, null, true)
        val txtNomeCidade = view.findViewById<TextView>(R.id.txtNomeCidade)
        val imgCidade = view.findViewById<ImageView>(R.id.imagemCidade)

        // Setando atributos aos componentes
        txtNomeCidade.text = nomeCidadeFilipinas[position]
        imgCidade.setBackgroundResource(ImgCidadeFilipinas[position])

        return view
    }

}