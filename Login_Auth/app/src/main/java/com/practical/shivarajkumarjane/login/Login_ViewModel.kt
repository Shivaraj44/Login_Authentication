package com.practical.shivarajkumarjane.login

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.practical.shivarajkumarjane.database.Database
import com.practical.shivarajkumarjane.database.Model

/**
 * This Class is fetching data from database
 */
class Login_ViewModel(private val context: Context): ViewModel() {

    fun fetchdata(mob:String,pass:String):LiveData<Model>{
        return Database.getInstance(context).Dao.login(mob,pass)
    }
}