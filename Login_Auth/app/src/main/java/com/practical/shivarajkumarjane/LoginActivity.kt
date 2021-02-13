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
    var pass = ""
    var mob = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = Login_ViewModelFactory(this).create(Login_ViewModel::class.java)

        var password: String = login_password.text.toString()
        var mobile: String = login_mobile_no.text.toString()



        btn_check.setOnClickListener(View.OnClickListener {

            viewModel.fetchdata(login_mobile_no.text.toString(), login_password.text.toString()).observe(this,
                Observer {
                    if (it!=null){
                        val intent = Intent(this@LoginActivity, HomeActivity::class.java)
                        intent.putExtra("mobile", it.Firstname)
                        intent.putExtra("password", it.Email)
                        startActivity(intent)
                    } else{
                        Toast.makeText(this@LoginActivity,"User not found", Toast.LENGTH_SHORT).show()
                    }

            })


            //  val model:Model = Database.getInstance(this@LoginActivity).Dao.login(mobile, password)


        })

    }
}