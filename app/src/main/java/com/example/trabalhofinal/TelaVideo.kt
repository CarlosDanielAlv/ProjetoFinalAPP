package com.example.trabalhofinal

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView

class TelaVideo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_video)
        val videoView = findViewById<VideoView>(R.id.videoView)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        val offlineURI = Uri.parse("android.resource://$packageName/${R.raw.viagem}")
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(offlineURI)
        videoView.requestFocus()
        videoView.start()

        val buttonconfirma = findViewById<Button>(R.id.btn_continua)
        // Ação Botão Confirmar
        buttonconfirma.setOnClickListener(){
            videoView.pause()
            val intent = Intent(this, TelaEscolha::class.java)
            startActivity(intent)
        }
    }
}