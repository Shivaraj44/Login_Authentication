package com.practical.shivarajkumarjane.signup

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.practical.shivarajkumarjane.R
import com.practical.shivarajkumarjane.login.LoginScreen
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_signup.*

/**
 * In this Inserting data to database with all the user information using viewmodel
 */
class SignupScreen : AppCompatActivity() {

    lateinit var signupViewModel: Signup_ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        signupViewModel = Signup_ViewModelFactory(this).create(Signup_ViewModel::class.java)

        Save.setOnClickListener(View.OnClickListener {

            signupViewModel.insert(
                0,
                first_name = user_first_name.text.toString(),
                last_name = user_last_name.text.toString(),
                mobile_no = user_mobile_no.text.toString(),
                email = user_email.text.toString(),
                gender = user_gender.text.toString(),
                password = user_password.text.toString()
            )
            val intent=Intent(this, LoginScreen::class.java)
            startActivity(intent)
        })

        signup.setOnClickListener(View.OnClickListener {
            val intent=Intent(this, SignupScreen::class.java)
            startActivity(intent)
        })
    }
}