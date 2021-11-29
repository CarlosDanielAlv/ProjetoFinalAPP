package com.example.trabalhofinal.roomdata

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "usuario")
data class Usuario (
    @PrimaryKey(autoGenerate = true) val uid:Int?,
    val uname:String?,
    val password:String?,
    val email:String?
)