package com.practical.shivarajkumarjane.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.practical.shivarajkumarjane.login.LoginScreen
import com.practical.shivarajkumarjane.R

/**
 Splash Screen to display My name and it will with stay 3seconds then Opens LoginActivity
 */
class Splash_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash__screen_)

        Handler().postDelayed({
            val intent = Intent(this, LoginScreen::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3000 is the delayed time in milliseconds.
    }
}