package com.vadia.aplikasikesehatanmental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.EditText

class SignUpActivity : AppCompatActivity() {
    //private val firebaseAuth: FirebaseAuth = FirebaseAuth.getInstance()
    //private val firebaseDatabase: FirebaseDatabase = FirebaseDatabase.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        initUI()
    }

    override fun onStart() {
        super.onStart()
        /*
        if (firebaseAuth.currentUser != null)
            startActivity(Intent(this, HomeActivity::class.java))

         */
    }

    private fun initUI() {
    val fullName=findViewById<EditText>(R.id.fullname)


    }
}