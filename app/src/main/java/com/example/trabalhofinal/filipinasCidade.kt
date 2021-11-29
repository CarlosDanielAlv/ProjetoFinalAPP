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

class filipinasCidade : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var textViewNomeCidadeFilipinas: TextView
    lateinit var textViewDescricaoCidade: TextView
    lateinit var textViewMoedaCidade: TextView
    lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filipinas_cidade)

        imageView = findViewById(R.id.imgCidadeFilipinas)
        textViewNomeCidadeFilipinas = findViewById(R.id.txtNomeCidadeFilipinas)
        textViewDescricaoCidade = findViewById(R.id.txtDescricaoCidade)
        textViewMoedaCidade = findViewById(R.id.txtMoedaCidade)
        button = findViewById(R.id.btnMaps)

        val queue = Volley.newRequestQueue(this)
        // Passando a url da API para buscar os valores de moeda
        val url = "https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/ils/brl.json"
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
            imageView.setBackgroundResource(R.drawable.imgf1)
            textViewNomeCidadeFilipinas.text = "Manila"
            textViewDescricaoCidade.text =
                "Coloque Manila é... no Google e se surpreenda com os resultados" +
                        " Segura. Perigosa. Caótica. Encantadora. Quente. Suja. Moderna. De tirar o fôlego " +
                        "A melhor definição que encontramos para a cidade foi: \"um diamante bruto\" " +
                        " Porque Manila pode ser o que você quiser. Depende apenas do seu ponto de vista"

            button.setOnClickListener() {
                intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.google.com.br/maps/place/Ba%C3%ADa+de+Manila/@14.5297656,120.4565971,10z/data=!3m1!4b1!4m5!3m4!1s0x33963092fa6e5db9:0x9fcd5f23701e7643!8m2!3d14.5188312!4d120.7579834"))
                startActivity(intent)
            }
        }
        if (posicao == 1) {
            imageView.setBackgroundResource(R.drawable.imgf2)
            textViewNomeCidadeFilipinas.text = "El Nido"
            textViewDescricaoCidade.text =
                "Formado por mais de 7 mil ilhas no Sudeste Asiático, o arquipélago das Filipinas reúne algumas das praias mais paradisíacas do mundo" +
                        "com águas mornas e cristalinas, mata nativa e grande riqueza natural. " +
                        "O próprio nome El Nido é resultado da presença espanhola no arquipélago, que reúne outros destinos com nomes espanhóis, como Coron e Luzon " +
                        "Uma das praias mais famosas do país, El Nido fica na ilha de Palawan, um dos principais destinos turísticos filipinos, no extremo sudoeste do país. "

            button.setOnClickListener() {
                intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.google.com.br/maps/place/El+Nido,+Palawan,+Filipinas/@11.2052834,119.125885,10z/data=!3m1!4b1!4m5!3m4!1s0x33b65515ef5c9e0f:0xfc4e665b599b0455!8m2!3d11.1905581!4d119.5082006"))
                startActivity(intent)
            }
        }
        if (posicao == 2) {
            imageView.setBackgroundResource(R.drawable.imgf3)
            textViewNomeCidadeFilipinas.text = "Coron"
            textViewDescricaoCidade.text =
                "Coron é aquele tipo de lugar que parece surreal de tão lindo, cheio de imagens paradisíacas e memoráveis" +
                        "Coron é um convite ao paraíso, tanto para quem busca aventura quanto para quem quer apenas relaxar " +
                        "a beleza inigualável de Coron agrada a todos os gostos! "

            button.setOnClickListener() {
                intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.google.com.br/maps/place/Coron,+Palawan,+Filipinas/@12.0186065,119.934436,10z/data=!3m1!4b1!4m5!3m4!1s0x33ba1ef225b0d675:0x68841ab9a85e968e!8m2!3d12.0489179!4d120.1519011"))
                startActivity(intent)
            }
        }
        if (posicao == 3) {
            imageView.setBackgroundResource(R.drawable.imgf4)
            textViewNomeCidadeFilipinas.text = "Cebu"
            textViewDescricaoCidade.text =
                " Cebu é a segunda maior cidade das Filipinas, logo após Manila." +
                        " Localizada mais ao sul do arquipélago, as semelhanças com a capital são tão grandes que é difícil acreditar que estamos em outro lugar" +
                        "Quem vai a Cebu geralmente está mais interessado em explorar as praias e ilhas nos arredores, como Mactan, Oslob, Bohol ou Panglao" +
                        " passando pouco tempo na cidade"

            button.setOnClickListener() {
                intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.google.com.br/maps/place/Cebu,+Filipinas/@10.3790718,123.7062074,11z/data=!3m1!4b1!4m5!3m4!1s0x33a999258dcd2dfd:0x4c34030cdbd33507!8m2!3d10.3156992!4d123.8854366"))
                startActivity(intent)
            }
        }

    }
}