package com.example.trabalhofinal

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson

class islandiaCidade : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var textViewNomeCidadeIslandia: TextView
    lateinit var textViewDescricaoCidade: TextView
    lateinit var textViewMoedaCidade: TextView
    lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_islandia_cidade)

        imageView = findViewById(R.id.imgCidadeIslandia)
        textViewNomeCidadeIslandia= findViewById(R.id.txtNomeCidadeIslandia)
        textViewDescricaoCidade = findViewById(R.id.txtDescricaoCidade)
        textViewMoedaCidade = findViewById(R.id.txtMoedaCidade)
        button = findViewById(R.id.btnMaps)

        val queue = Volley.newRequestQueue(this)
        // Passando o valor de CEP para a url da API
        val url = "https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/isk/brl.json"
        //Realizando a request com a minha url
        val stringRequest = StringRequest(
            Request.Method.GET, url,
            Response.Listener<String> { response ->
                var gson = Gson()
                var moeda = gson.fromJson(response, FormataJson.Valores::class.java)
                textViewMoedaCidade.text = "Valor da moeda do país em R$: ${moeda.brl}"
            },
            Response.ErrorListener { textViewMoedaCidade.text = "Moeda Indisponivel"})

        queue.add(stringRequest)


        // Escondendo barra de ação da tela
        supportActionBar?.hide()

        val posicao: Int = intent.getIntExtra("posicao", -1)


        if (posicao == 0) {
            imageView.setBackgroundResource(R.drawable.imgi1)
            textViewNomeCidadeIslandia.text = "Reykjavik"
            textViewDescricaoCidade.text =
                "A Islândia já é um país pacato por excelência " +
                        " Pastoril, vulcânico e cercado por águas geladas, só poderia ter uma capital como Reykjavik" +
                        "com pouco mais de 100 mil habitantes, é a capital mais setentrional do mundo " +
                        " Sem arranha-céus ou grandes monumentos, destaca-se pelos telhados coloridos de suas casas.  \n" +
                        ""
            button.setOnClickListener() {
                intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.google.com.br/maps/place/Reykjavik,+Isl%C3%A2ndia/@64.1335484,-21.9224816,12z/data=!3m1!4b1!4m5!3m4!1s0x48d674b9eedcedc3:0xec912ca230d26071!8m2!3d64.146582!4d-21.9426354"))
                startActivity(intent)
            }
        }
        if (posicao == 1) {
            imageView.setBackgroundResource(R.drawable.imgi2)
            textViewNomeCidadeIslandia.text = "Kopavogur"
            textViewDescricaoCidade.text =
                "Acolhe os viajantes com suas opções para observar a aurora boreal, suas vistas para o lago, suas opções de passeios turísticos e muito mais" +
                        "uma cidade ideal para caminhadas: vista para o lago, cafeterias e atrações como Museu de História Natural de Kópavogur e Igreja de Kopavogur."

            button.setOnClickListener() {
                intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.google.com.br/maps/place/K%C3%B3pavogur,+Isl%C3%A2ndia/@64.0888772,-21.9354929,12z/data=!3m1!4b1!4m5!3m4!1s0x48d60caa53ba0911:0xfde65bc34ebedbad!8m2!3d64.1033023!4d-21.8832579"))
                startActivity(intent)
            }
        }
        if (posicao == 2) {
            imageView.setBackgroundResource(R.drawable.imgi3)
            textViewNomeCidadeIslandia.text = "Hafnarfjörður"
            textViewDescricaoCidade.text =
                "Saia da trilha batida e pegue o ônibus número 1 no centro de Reykjavík por 20 minutos até Hafnarfjörður " +
                        "Harbour Village é perfeito para explorar a pé, com museus gratuitos, pequenas joalherias curiosas, cafés, boutiques e galerias " +
                        " proveite os locais aconchegantes e os restaurantes familiares que servem uma variedade de pratos saborosos" +
                        "Dê um passeio ao longo do belo porto " +
                        "Para os entusiastas da história, visite o Museu Hafnarfjörður para uma viagem pela rica herança da cidade e aprecie a arte contemporânea no Museu de Arte de Hafnarborg"

            button.setOnClickListener() {
                intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.google.com.br/maps/place/Hafnarfj%C3%B6r%C3%B0ur,+Isl%C3%A2ndia/@64.0318429,-22.0401206,12z/data=!3m1!4b1!4m5!3m4!1s0x48d60c56eb15f675:0x5577bad72ba1387d!8m2!3d64.0291054!4d-21.9684626"))
                startActivity(intent)
            }
        }


    }
}