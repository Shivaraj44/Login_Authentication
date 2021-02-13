package com.practical.shivarajkumarjane.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practical.shivarajkumarjane.R
import kotlinx.android.synthetic.main.activity_home.*

/**
 * Displaying all the user data only if its correct
 */
class HomeActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val first_name=intent.getStringExtra("Firstname")
        val last_name=intent.getStringExtra("Lastname")
        val email=intent.getStringExtra("Email")
        val mobile=intent.getStringExtra("mobile")

        val gender=intent.getStringExtra("Gender")

        home_first_name.text=first_name
        home_last_name.text=last_name
        home_email.text=email
        home_mobile.text=mobile
        home_gender.text=gender


    }
}