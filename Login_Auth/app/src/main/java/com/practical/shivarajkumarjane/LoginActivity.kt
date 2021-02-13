package com.practical.shivarajkumarjane

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {

    private lateinit var viewModel: Login_ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = Login_ViewModelFactory(this).create(Login_ViewModel::class.java)




        Login.setOnClickListener(View.OnClickListener {

            viewModel.fetchdata(login_mobile_no.text.toString(), login_password.text.toString()).observe(this,
                Observer {
                    if (it!=null){
                        val intent = Intent(this@LoginActivity, HomeActivity::class.java)
                        intent.putExtra("Firstname", it.Firstname)
                        intent.putExtra("password", it.Email)
                        intent.putExtra("Lastname", it.Lastname)
                        intent.putExtra("Gender", it.Gender)
                        intent.putExtra("mobile", it.Mobileno)
                        
                        startActivity(intent)
                    } else{
                        Toast.makeText(this@LoginActivity,"User not found", Toast.LENGTH_SHORT).show()
                    }

            })




        })

    }
}