package com.example.trabalhofinal

import android.content.Context
import android.content.SharedPreferences

class SharedPreferences(context: Context) {
    private val PREFERENCE_NAME = "Nomes"
    val sharedPreference: SharedPreferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

    fun save(key_name:String,valor:String){
        val editor: SharedPreferences.Editor = sharedPreference.edit()
        editor.putString(key_name,valor)
        editor.commit()
    }
}