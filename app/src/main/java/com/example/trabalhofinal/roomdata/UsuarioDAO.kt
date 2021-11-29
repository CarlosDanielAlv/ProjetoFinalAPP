package com.example.trabalhofinal.roomdata

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UsuarioDAO {
    @Insert
   fun insert(usuario:Usuario)
}