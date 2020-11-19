package com.vadia.aplikasikesehatanmental

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.vadia.aplikasikesehatanmental.DataModel.Pasien

import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {
    private val db = Firebase.firestore
    private val pasien= Firebase.firestore.collection("pasien")
    private val psikiater= db.collection("psikiater")
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        auth = Firebase.auth
        initUI()
    }

    override fun onStart() {
        super.onStart()
        //val auth = FirebaseAuth.getInstance()
        /*
        if (firebaseAuth.currentUser != null)
            startActivity(Intent(this, HomeActivity::class.java))

         */
    }

    private fun initUI() {
        var role_id=findViewById<RadioButton>(type_pasien.id)
        role.setOnCheckedChangeListener { radioGroup, i ->
            val radio:RadioButton=findViewById(i)
            role_id=radio
        }
        //Date Picker:
       //?

    register.setOnClickListener {
        val fullName=fullname.text.toString()
        val username=username.text.toString()
        val email=email.text.toString()
        val noTelp=no_hp.text.toString()
        //User Type?
        val userType=role_id



    }


    }

    private fun addPasien(fullname:String,username:String,email:String,noTelp:String,password:String){
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d(TAG, "createUserWithEmail:success")
                    val user = auth.currentUser
                    updateUI(user)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "createUserWithEmail:failure", task.exception)
                    Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()
                    updateUI(null)
                }

                // ...
            }
    }

    private fun updateUI(nothing: Nothing?) {

    }

    private fun addPsikiater(){

    }
}