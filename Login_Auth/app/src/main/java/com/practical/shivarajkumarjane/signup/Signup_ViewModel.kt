package com.practical.shivarajkumarjane.signup

import android.content.Context
import androidx.lifecycle.ViewModel
import com.practical.shivarajkumarjane.splashscreen.Signup_Repository

/**
 * Viewmodel which acts bridge between model and view , in model we are using repository class and inserting
 */
 class Signup_ViewModel(private val context: Context) : ViewModel() {
    private val repository = Signup_Repository()

    fun insert(
        id: Int,
        first_name: String,
        last_name: String,
        mobile_no: String,
        email: String,
        gender: String,
        password: String
    ) {
        repository.InserttoRepositery(
            id,
            first_name,
            last_name,
            mobile_no,
            email,
            gender,
            password,
            context
        )
    }

}