package com.example.trabalhofinal.roomdata

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface UsuarioDAO {
    @Insert
     fun insert(usuario:Usuario)
}