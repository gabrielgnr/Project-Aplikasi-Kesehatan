package com.vadia.aplikasikesehatanmental

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.login_page.*

class LoginActivity : AppCompatActivity() {

    private val firebaseAuth : FirebaseAuth = FirebaseAuth.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)


        initUI()
    }

    private fun initUI(){
        /*register.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }*/

        log_in.setOnClickListener{
                val username = username.getText().toString()
                val password = password.getText().toString()

                var is_error = false


                if(password.length<8){

                }

            }

        sign_up.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class)
            startActivity(intent)
            finish()
        }

    }
}