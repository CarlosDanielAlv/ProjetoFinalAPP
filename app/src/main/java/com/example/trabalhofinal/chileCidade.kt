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

class chileCidade : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var textViewNomeCidadeChile: TextView
    lateinit var textViewDescricaoCidade: TextView
    lateinit var textViewMoedaCidade: TextView
    lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chile_cidade)

        imageView = findViewById(R.id.imgCidadeChile)
        textViewNomeCidadeChile = findViewById(R.id.txtNomeCidadeChile)
        textViewDescricaoCidade = findViewById(R.id.txtDescricaoCidade)
        textViewMoedaCidade = findViewById(R.id.txtMoedaCidade)
        button = findViewById(R.id.btnMaps)

        val queue = Volley.newRequestQueue(this)
        // Passando a url da API para buscar os valores de moeda
        val url = "https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/clp/brl.json"
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
            imageView.setBackgroundResource(R.drawable.imgc1)
            textViewNomeCidadeChile.text = "Santiago"
            textViewDescricaoCidade.text =
                "Santiago do Chile é uma cidade cheia de atrações" +
                        "Moderna e charmosa, a cidade impressiona seus visitantes antes mesmo da aeronave pousar em terra firme  " +
                        " A capital chilena é um dos destinos mais desenvolvidos da América do Sul" +
                        " possui pontos turisticos como o Palacio de La Moneda  " +
                        "onde fica a sede da presidência chilena é um dos pontos turísticos mais famosos do país"
            button.setOnClickListener() {
                intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.google.com.br/maps/place/Santiago,+Chile/@-33.4718999,-70.9100192,10z/data=!3m1!4b1!4m5!3m4!1s0x9662c5410425af2f:0x8475d53c400f0931!8m2!3d-33.4488897!4d-70.6692655"))
                startActivity(intent)
            }
        }
        if (posicao == 1) {
            imageView.setBackgroundResource(R.drawable.imgc2)
            textViewNomeCidadeChile.text = "Púcon"
            textViewDescricaoCidade.text =
                "O principal atrativo da cidade é, sem dúvidas, o Vulcão Villarrica" +
                        "Seu cume está a cerca de 2800m de altitude e pode ser visto de diversos pontos da região " +
                        " A neve permanece na parte alta do vulcão durante todo o ano, mas, claro, está em maior quantidade do inverno, período em que o vulcão funciona também como estação de esqui"

            button.setOnClickListener() {
                intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.google.com.br/maps/place/Puc%C3%B3n,+Pucon,+Araucan%C3%ADa,+Chile/@-39.2803931,-71.9766899,14z/data=!3m1!4b1!4m5!3m4!1s0x96147f42351988d1:0x3c5c238b02dc5935!8m2!3d-39.2722541!4d-71.9776285"))
                startActivity(intent)
            }
        }
        if (posicao == 2) {
            imageView.setBackgroundResource(R.drawable.imgc3)
            textViewNomeCidadeChile.text = "Valparáiso"
            textViewDescricaoCidade.text =
                "Valparaíso e Viña del Mar: essas duas cidades ficam próximas da cidade de Santiago, no Chile." +
                        "Por isso, tornaram-se um dos passeios obrigatórios para quem viaja ao Chile. Mas o que fazer em Valparaíso e Viña del Mar e como organizar o seu roteiro. " +
                        "A origem e a história de Valparaíso sempre esteve ligada a sua atividade portuária " +
                        "ara ocupar sua estreita faixa de terra, as muitas pessoas que começaram a se mudar para lá foram obrigadas a ocupar as colinas " +
                        "E a diversidade é uma das características de sua população, atraindo diversas nacionalidades "

            button.setOnClickListener() {
                intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.google.com.br/maps/place/Valpara%C3%ADso,+Chile/@-33.0501236,-71.646068,13z/data=!3m1!4b1!4m5!3m4!1s0x9689dde3de20cec7:0xeb0a3a8cbfe19b76!8m2!3d-33.047238!4d-71.6126885"))
                startActivity(intent)
            }
        }
        if (posicao == 3) {
            imageView.setBackgroundResource(R.drawable.imgc4)
            textViewNomeCidadeChile.text = "Viña Del Mar"
            textViewDescricaoCidade.text =
                "Viña del Mar é um local rico em arquitetura, cultura e culinária " +
                        "Nela existem diversos palácios, parques, restaurantes e bares incríveis para você conhecer nos seus dias de viagem " +
                        " É difícil alguma outra praia da região tentar competir com a Playa Reñaca" +
                        "Dona da vista mais bela do pôr do sol de Viña " +
                        "ela se destaca por sua orla enorme, seus rochedos paradisíacos e por ser lar de animais que não vemos nas praias brasileiras, como o leão marinho"

            button.setOnClickListener() {
                intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.google.com.br/maps/place/Vi%C3%B1a+del+Mar,+Valpara%C3%ADso,+Chile/@-33.0053654,-71.6002957,12z/data=!3m1!4b1!4m5!3m4!1s0x9689de84ead41255:0x8e5fde76df3d413f!8m2!3d-33.0153481!4d-71.5500276"))
                startActivity(intent)
            }
        }

    }
}