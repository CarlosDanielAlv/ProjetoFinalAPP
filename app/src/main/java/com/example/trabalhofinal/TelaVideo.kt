package com.example.trabalhofinal

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView

class TelaVideo : AppCompatActivity() {

    lateinit var notificationManager: NotificationManager
    lateinit var notificationChannel: NotificationChannel
    lateinit var build: Notification.Builder
    private val ChannelID = "VOA"
    private val desc = "Notificatiions"

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

        notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val buttonconfirma = findViewById<Button>(R.id.btn_continua)
        // Ação Botão Confirmar
        buttonconfirma.setOnClickListener(){
            videoView.pause()
            notificationChannel = NotificationChannel(ChannelID,desc,NotificationManager.IMPORTANCE_HIGH)
            notificationChannel.lightColor = Color.GRAY
            notificationManager.createNotificationChannel(notificationChannel)
            build = Notification.Builder(this)
                .setContentTitle("BEM VINDO!")
                .setContentText("Viagens com tranquilidade!")
                .setSmallIcon(R.drawable.ic_baseline_flight_takeoff)
                .setChannelId(ChannelID)
            notificationManager.notify(1,build.build())
            val intent = Intent(this, TelaEscolha::class.java)
            startActivity(intent)
        }
    }
}