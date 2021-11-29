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

class botswanaCidade : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var textViewNomeCidadeBotsawana: TextView
    lateinit var textViewDescricaoCidade: TextView
    lateinit var textViewMoedaCidade: TextView
    lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_botswana_cidade)

        imageView = findViewById(R.id.imgCidadeBotsawana)
        textViewNomeCidadeBotsawana = findViewById(R.id.txtNomeCidadeBotsawana)
        textViewDescricaoCidade = findViewById(R.id.txtDescricaoCidade)
        textViewMoedaCidade = findViewById(R.id.txtMoedaCidade)
        button = findViewById(R.id.btnMaps)

        val queue = Volley.newRequestQueue(this)
        // Passando a url da API para buscar os valores de moeda
        val url = "https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/zar/brl.json"
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
            imageView.setBackgroundResource(R.drawable.imgb1)
            textViewNomeCidadeBotsawana.text = "Gaborone"
            textViewDescricaoCidade.text =
                "Gaborone é a capital e maior cidade do Botswana. A sua população estimada para 2010 é de 228 166 habitantes"+
                        " É a capital administrativa do distrito Sudeste, bem como do subdistrito de Gaborone"+
                        " Gaborone é bastante ensolarada. Os verões são geralmente quentes. As noites são frescas o que torna o ponto ideal para uma viagem de verão"
            button.setOnClickListener() {
                intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.google.com.br/maps/place/Gaborone,+Botsuana/@-24.6091349,25.8604641,12z/data=!3m1!4b1!4m5!3m4!1s0x1ebb5b3c2ceea9bf:0x49a1769397ae11a1!8m2!3d-24.6282079!4d25.9231471"))
                startActivity(intent)
            }
        }
        if (posicao == 1) {
            imageView.setBackgroundResource(R.drawable.imgb2)
            textViewNomeCidadeBotsawana.text = "Maun "
            textViewDescricaoCidade.text =
                "Situada ao norte do país e na margem sul do Delta Okavango, Maun é a capital do turismo na Botsuana \n" +
                        "A cidade, que foi descoberta pelos viajantes na década de 1980, hoje é conhecida pela boa infraestrutura, com modernos centros comerciais, lojas, hotéis e restaurantes. \n" +
                        "Entretanto, o que realmente atrai milhares de turistas todos os anos são as centenas de opções de safáris e o ponto de acesso ao Delta do Rio Okavango. \n"

            button.setOnClickListener() {
                intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.google.com.br/maps/place/Maun,+Botsuana/@-20.0002812,23.3838839,13z/data=!3m1!4b1!4m5!3m4!1s0x19544d054c080299:0xad7cc125ed822f4b!8m2!3d-19.9952622!4d23.4180769"))
                startActivity(intent)
            }
        }
        if (posicao == 2) {
            imageView.setBackgroundResource(R.drawable.imgb3)
            textViewNomeCidadeBotsawana.text = "Francistown"
            textViewDescricaoCidade.text =
                "Francistown é uma cidade na região nordeste do Botsuana, perto da fronteira com o Zimbábue" +
                        "É a segunda maior cidade do pais, com uma população de cerca de 108.400 " +
                        " Francistown era o centro da África Austral do primeiro ouro, e que ainda se encontra rodeado por antigas minas abandonadas" +
                        "Boa opção pra quem deseja uma viagem turistica com pontos historicos "
            button.setOnClickListener() {
                intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.google.com.br/maps/place/Francistown,+Botsuana/@-21.1649763,27.432644,12z/data=!3m1!4b1!4m5!3m4!1s0x1eb46883156e55a3:0x18db953a74373104!8m2!3d-21.1661005!4d27.5143603"))
                startActivity(intent)
            }
        }
        if (posicao == 3) {
            imageView.setBackgroundResource(R.drawable.imgb4)
            textViewNomeCidadeBotsawana.text = "Serowe"
            textViewDescricaoCidade.text =
                "Serowe é uma cidade do Botswana. Possui cerca de noventa mil habitantes " +
                        "Perto de Serowe existe uma reserva de 4300 hectares - o Khama Rhino Sanctuary - concebida para a preservação de rinocerontes " +
                        "ótimo destino para quem gosta de trilhar reservas e ambientes naturais "
            button.setOnClickListener() {
                intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.google.com.br/maps/place/Serowe,+Botsuana/@-22.4046669,26.6878504,13z/data=!3m1!4b1!4m5!3m4!1s0x1eb11978b0023d47:0x4ab497d0cc2d267d!8m2!3d-22.4036831!4d26.7142835"))
                startActivity(intent)
            }
        }

    }
}