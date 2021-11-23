package com.example.trabalhofinal.roomdata

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Usuario::class], version = 1)
abstract class UsuarioDatabase:RoomDatabase(){
abstract fun usuarioDAO():UsuarioDAO

companion object {

    var INSTANCE:UsuarioDatabase? = null
    fun getInstance(context: Context):UsuarioDatabase{

        if(INSTANCE==null){
            INSTANCE = Room.databaseBuilder(context.applicationContext
                ,UsuarioDatabase::class.java,"usuarios.db").build()
        }
        return INSTANCE!!
    }

}

}