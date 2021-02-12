package com.practical.shivarajkumarjane

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {

    lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        viewModel = ViewModelFactory(this).create(ViewModel::class.java)

        click.setOnClickListener(View.OnClickListener {

            viewModel.insert(
                0,
                first_name = user_first_name.text.toString(),
                last_name = user_last_name.text.toString(),
                mobile_no = user_mobile_no.text.toString(),
                email = user_email.text.toString(),
                gender = user_gender.text.toString(),
                password = user_password.text.toString()
            )
            val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        })
    }
}