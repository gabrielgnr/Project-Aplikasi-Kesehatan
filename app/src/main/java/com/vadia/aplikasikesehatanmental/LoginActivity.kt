package com.vadia.aplikasikesehatanmental

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Toast
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
        sign_up.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }

        log_in.setOnClickListener{
                val username = username.getText().toString()
                val password = password.getText().toString()

            if(username.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "Username atau Password kosong, silakan isi!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            FirebaseAuth.getInstance().signInWithEmailAndPassword(username,password)
                    .addOnCompleteListener{
                        if (!it.isSuccessful){ return@addOnCompleteListener
                            val intent = Intent (this, MenuActivity::class.java)
                            startActivity(intent)
                        }
                        else
                            Toast.makeText(this, "Berhasil Login!", Toast.LENGTH_SHORT).show()
                        val intent = Intent (this, HomeActivityPasien::class.java)
                        startActivity(intent)
                    }
                    .addOnFailureListener{
                        Log.d("Main", "Failed Login: ${it.message}")
                        Toast.makeText(this, "Email/Password Salah", Toast.LENGTH_SHORT).show()
                    }
            }

        sign_up.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}