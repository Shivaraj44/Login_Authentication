package com.practical.shivarajkumarjane

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(private val context: Context) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(com.practical.shivarajkumarjane.Signup_ViewModel::class.java)) {
            return com.practical.shivarajkumarjane.Signup_ViewModel(context) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }


}