package com.example.easychef
import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences

class UserInfoSharedPref(val context: Context){

    val sharedPref: SharedPreferences = context.getSharedPreferences("UserInfo", MODE_PRIVATE)

    fun save(KEY_NAME: String, value:HashSet<String>) {
        val editor: SharedPreferences.Editor = sharedPref.edit()
        editor.putStringSet(KEY_NAME, value)
        editor.commit()
    }

    fun getValue(KEY_NAME: String): MutableSet<String>? {

        return sharedPref.getStringSet(KEY_NAME, null)
    }
}
