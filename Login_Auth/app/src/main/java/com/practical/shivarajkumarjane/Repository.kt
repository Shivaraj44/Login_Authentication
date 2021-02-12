package com.practical.shivarajkumarjane

import android.content.Context
import com.practical.shivarajkumarjane.database.Database
import com.practical.shivarajkumarjane.database.Model
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Repository {

    fun InserttoRepositery(
        id: Int, first_name: String, last_name: String, mobile_no: String, email: String,
        gender: String, password: String, context: Context
    ) {

        CoroutineScope(Dispatchers.IO).launch {
            val model = Model(
                id,
                Firstname = first_name,
                Lastname = last_name,
                Mobileno = mobile_no,
                Email = email,
                Gender = gender,
                Password = password
            )
            Database.getInstance(context).Dao.insert(model)

        }
    }


}