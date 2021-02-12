package com.practical.shivarajkumarjane

import android.content.Context
import androidx.lifecycle.ViewModel

class ViewModel(private val context: Context) : ViewModel() {
    private val repository = Repository()

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