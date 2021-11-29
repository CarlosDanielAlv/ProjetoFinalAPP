package com.example.trabalhofinal

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.trabalhofinal.roomdata.Usuario
import com.example.trabalhofinal.roomdata.UsuarioDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class FormCadastro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_cadastro)

        val editText_nome = findViewById<EditText>(R.id.edit_nome)
        val editText_email = findViewById<EditText>(R.id.edit_email)
        val editText_senha = findViewById<EditText>(R.id.edit_senha)
        // Botão Confirmar
        val buttonconfirma = findViewById<Button>(R.id.bt_confirmar)
        // Ação Botão Confirmar
        val sharedPreference = SharedPreferences(this)
        sharedPreference.save("nome",editText_nome.text.toString())

        buttonconfirma.setOnClickListener(){

            if(!editText_nome.text.isEmpty() && !editText_email.text.isEmpty() && !editText_senha.text.isEmpty()){
                val objUser = Usuario(null,editText_nome.text.toString(),editText_email.text.toString(),editText_senha.text.toString())
                GlobalScope.launch(Dispatchers.IO){
                    UsuarioDatabase.getInstance(this@FormCadastro).usuarioDAO().insert(objUser)
                }
                Toast.makeText(applicationContext,"Cadastro realizado",Toast.LENGTH_LONG).show()
                val intent = Intent(this, TelaVideo::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext,"Erro ao cadastrar",Toast.LENGTH_LONG).show()
            }
        }

        // Escondendo barra de ação da tela
        supportActionBar?.hide()
    }
}