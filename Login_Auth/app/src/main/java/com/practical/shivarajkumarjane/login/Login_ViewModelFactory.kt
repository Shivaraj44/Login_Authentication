package com.practical.shivarajkumarjane.login

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * This Gives the context to the viewmodel class helps in creating a ViewmodelProvider in the Activity
 */
class Login_ViewModelFactory (private val context: Context) : ViewModelProvider.Factory {

    override fun <T: ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(Login_ViewModel::class.java)) {
            return Login_ViewModel(context) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }


}