package com.example.trabalhofinal.Adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import com.example.trabalhofinal.R

class AdapterPais(val context: Activity, private val ImgPaises: Array<Int>) :
    ArrayAdapter<Int>(context, R.layout.paises_item, ImgPaises) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = context.layoutInflater
        val view = inflater.inflate(R.layout.paises_item, null, true)
        val imgPais = view.findViewById<ImageView>(R.id.imagemPais)

        // Setando atributos aos componentes
        imgPais.setBackgroundResource(ImgPaises[position])

        return view
    }

}

