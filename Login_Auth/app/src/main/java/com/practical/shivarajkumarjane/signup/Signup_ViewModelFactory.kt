package com.practical.shivarajkumarjane.signup

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * This Gives the context to the viewmodel class helps in creating a ViewmodelProvider in the Activity
 */
class Signup_ViewModelFactory(private val context: Context) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(Signup_ViewModel::class.java)) {
            return Signup_ViewModel(context) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }


}