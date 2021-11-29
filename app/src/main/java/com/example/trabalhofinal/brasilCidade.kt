package com.example.trabalhofinal

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson

class brasilCidade : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var textViewNomeCidadeBrasil: TextView
    lateinit var textViewDescricaoCidade: TextView
    lateinit var textViewMoedaCidade: TextView
    lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brasil_cidade)

        imageView = findViewById(R.id.imgCidadeBrasil)
        textViewNomeCidadeBrasil = findViewById(R.id.txtNomeCidadeBrasil)
        textViewDescricaoCidade = findViewById(R.id.txtDescricaoCidade)
        textViewMoedaCidade = findViewById(R.id.txtMoedaCidade)
        button = findViewById(R.id.btnMaps)

        val queue = Volley.newRequestQueue(this)
        // Passando o valor de CEP para a url da API
        val url = "https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/eur/brl.json"
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
            imageView.setBackgroundResource(R.drawable.img1)
            textViewNomeCidadeBrasil.text = "Bonito, Mato Grosso do Sul"
            textViewDescricaoCidade.text =
                "Excelente para quem busca contato com a natureza, Bonito é o lugar perfeito para" +
                        " quem quer contato com a natureza e uma boa dose aventura! A cidade tem um " +
                        "ritmo de cidade de interior e dezenas de passeios para fazer, que incluem " +
                        "flutuação em rios cristalinos, caminhadas e banhos de cachoeira. Tudo é " +
                        "feito de forma bem organizada e de maneira a preservar o meio ambiente."
            button.setOnClickListener() {
                intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.google.com.br/maps/place/Bonito+-+MS/@-20.9647023,-57.0427725,9z/data=!3m1!4b1!4m5!3m4!1s0x947c58d50c8407c7:0x4de9a9fbc7e1ac30!8m2!3d-21.1282226!4d-56.4878805"))
                startActivity(intent)
            }
        }
        if (posicao == 1) {
            imageView.setBackgroundResource(R.drawable.img2)
            textViewNomeCidadeBrasil.text = "Lençóis (Chapada Diamantina), Bahia"
            textViewDescricaoCidade.text =
                "Uma das cidades para se ter como base para visitar a Chapada dos Veadeiros, em Goiás," +
                        " é a pequena Alto Paraíso. Pequenina e simpática, ela é uma cidade simples, mas" +
                        " com várias pousadinhas, casas para alugar e bons restaurantes. A partir de lá" +
                        " você pode ir de carro para dezenas de cachoeiras incríveis, com os mais diversos" +
                        " cenários, fazer trilhas, voar de balão, além de observar a fauna e flora locais," +
                        " que são encatadoras!"
            button.setOnClickListener() {
                intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.google.com.br/maps/place/Len%C3%A7%C3%B3is,+BA,+46960-000/@-12.563922,-41.3978607,15z/data=!3m1!4b1!4m5!3m4!1s0x742077b04f90759:0xd9229c09c8074a2!8m2!3d-12.5623255!4d-41.3886026"))
                startActivity(intent)
            }
        }
        if (posicao == 2) {
            imageView.setBackgroundResource(R.drawable.img3)
            textViewNomeCidadeBrasil.text = "Pirenópolis, Goiás"
            textViewDescricaoCidade.text =
                "Apenas “Piri” para os mais íntimos, Pirenópolis é uma cidade pequena, com ruas de pedra," +
                        " muito frequentada nos fins de semana, e tem uma arquitetura charmosa com casarões" +
                        " coloniais em seu centro histórico. É uma cidade com várias cachoeiras ao seu redor" +
                        " e uma excelente estrutura para quem quer ficar bem hospedado, com diversas opções" +
                        " de pousadas charmosas. Muitas pessoas que vivem em Brasília procuram Piri quando" +
                        " querem relaxar e curtir novos ares."
            button.setOnClickListener() {
                intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.google.com.br/maps/place/Piren%C3%B3polis,+GO,+72980-000/@-15.8535404,-48.9699847,15z/data=!3m1!4b1!4m5!3m4!1s0x935c6bf7ce026fd3:0xb6f6b3e0a2fafbd1!8m2!3d-15.8521031!4d-48.9590795"))
                startActivity(intent)
            }
        }
        if (posicao == 3) {
            imageView.setBackgroundResource(R.drawable.img4)
            textViewNomeCidadeBrasil.text = "Alto Paraíso (Chapada dos Veadeiros), Goiás"
            textViewDescricaoCidade.text =
                "Lençóis é o nome da cidadezinha mais indicada aos que desejam conhecer as belezas da " +
                        "Chapada Diamantina, na Bahia. Com ruas de pedra e enorme quantidade de atividades, " +
                        "é o destino ideal para quem procura contato com a natureza e quer se desligar das " +
                        "grandes cidades, com direito a mergulhos em cachoeiras refrescantes, passeios por " +
                        "trilhas e um bom acarajé no fim da tarde!"
            button.setOnClickListener() {
                intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.google.com.br/maps/place/Alto+Para%C3%ADso+de+Goi%C3%A1s,+GO,+73770-000/@-14.137483,-47.5255588,15z/data=!3m1!4b1!4m5!3m4!1s0x93457f2175bd1f01:0xda1a6754d116a0e7!8m2!3d-14.1339855!4d-47.5139943"))
                startActivity(intent)
            }
        }

    }
}
