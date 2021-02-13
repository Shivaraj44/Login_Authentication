package com.practical.shivarajkumarjane

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
       val mob=intent.getStringExtra("mobile")
       val  password=intent.getStringExtra("password")
        home_mobile.text=mob
        home_first_name.text=password


    }
}