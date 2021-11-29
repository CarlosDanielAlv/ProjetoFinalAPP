package com.example.trabalhofinal.roomdata

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Usuario")
data class Usuario (
    @PrimaryKey(autoGenerate = true)
    val uid:Int?,
    val uname:String?,
    val email:String?,
    val password:String?
)