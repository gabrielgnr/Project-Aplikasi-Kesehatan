package com.vadia.aplikasikesehatanmental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.vadia.aplikasikesehatanmental.DataModel.Pasien
import com.vadia.aplikasikesehatanmental.DataModel.Psikiater

import kotlinx.android.synthetic.main.activity_sign_up.*
import java.util.*

class SignUpActivity : AppCompatActivity() {
    private val db = Firebase.firestore
    private val pasien= db.collection("pasien")
    private val user_pasien=db.collection("pasien_user")
    private val psikiater= db.collection("psikiater")
    private val user_psikiater=db.collection("psikiater_user")

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
        var role_id=findViewById<RadioButton>(type_pasien.id).id
        //type_pasien.isChecked
        role.setOnCheckedChangeListener { radioGroup, i ->
            val radio:RadioButton=findViewById(i)
            role_id=radio.id
        }
       //setDifferences(role_id)
        //Date Picker?


    register.setOnClickListener {
        val fullName=fullname.text.toString()
        val username=username.text.toString()
        val email=email.text.toString()
        val newPass=new_password.text.toString()
        val confirmPass=confirm_password.text.toString()

        //User Type?
        val userType=role_id
        if (userType.equals(type_pasien.id)){
            val noTelp=no_hp.text.toString()
            if(newPass.equals(confirmPass)&&!newPass.isEmpty()) {
                addPasien(fullname = fullName, username=username, email = email, noTelp = noTelp, password = newPass)
            }
            else{
                if(newPass.isEmpty()){
                    Toast.makeText(baseContext, "Password is Empty!",Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(baseContext, "Password and Confirm Password is not Match!",Toast.LENGTH_SHORT).show()
                }
            }
        }
        else{
            val noTelp=no_hp.text.toString()
            if(newPass.equals(confirmPass)&&!newPass.isEmpty()) {
                addPsikiater(fullname = fullName, username = username, email = email,noTelp = noTelp,password = newPass)
            }
            else{
                if(newPass.isEmpty()){
                    Toast.makeText(baseContext, "Password is Empty!",Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(baseContext, "Password and Confirm Password is not Match!",Toast.LENGTH_SHORT).show()
                }
            }
        }

    }


    }

    private fun addPasien(fullname:String,username:String,email:String,noTelp:String,password:String){

        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    //Add to DB
                    val uid = auth.uid!!
                    val pasien_id=UUID.randomUUID().toString()
                    val newPasien=Pasien(uid = uid,pasien_id=pasien_id,fullName = fullname,userName = username,email = email,phone = noTelp)

                    //Add user:
                    pasien.document(uid)
                        .set(newPasien)
                        .addOnSuccessListener { Toast.makeText(baseContext, resources.getString(R.string.success_sign_up), Toast.LENGTH_SHORT).show() }
                        .addOnFailureListener { Toast.makeText(baseContext, "Error, cannot add new user.",Toast.LENGTH_SHORT).show() }




                    // Sign in success, update UI with the signed-in user's information
                    Toast.makeText(baseContext, resources.getString(R.string.success_sign_up), Toast.LENGTH_SHORT).show()
                    //val user = auth.currentUser
                    updateUIPasien()
                } else {
                    // If sign in fails, display a message to the user.

                    Toast.makeText(baseContext, "Authentication failed.",Toast.LENGTH_SHORT).show()
                }

                // ...
            }
    }

    private fun addPsikiater(fullname:String,username:String,email:String,noTelp:String,password:String){
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    //Add to DB
                    val uid = auth.uid!!
                    val psikiater_id=UUID.randomUUID().toString()
                    val newPsikiater= Psikiater(uid=uid,psikiater_id = psikiater_id,fullName = fullname,email = email,phone = noTelp)

                    //Add user:
                    psikiater.document(uid)
                        .set(newPsikiater)
                        .addOnSuccessListener { Toast.makeText(baseContext, resources.getString(R.string.success_sign_up), Toast.LENGTH_SHORT).show() }
                        .addOnFailureListener { Toast.makeText(baseContext, "Error, cannot add new user.",Toast.LENGTH_SHORT).show() }

                    // Sign in success, update UI with the signed-in user's information
                    Toast.makeText(baseContext, resources.getString(R.string.success_sign_up), Toast.LENGTH_SHORT).show()
                   // val user = auth.currentUser
                    updateUIPsikiater()
                } else {
                    // If sign in fails, display a message to the user.

                    Toast.makeText(baseContext, "Authentication failed.",Toast.LENGTH_SHORT).show()

                }

                // ...
            }
    }

    private fun updateUIPasien() {
        val intent = Intent(this, HomeActivityPasien::class.java)
        startActivity(intent)
        finish()
    }

    private fun updateUIPsikiater() {
        val intent = Intent(this, HomeActivityPsikiater::class.java)
        startActivity(intent)
        finish()
    }

    fun roleOnClick(view: View) {

    }

}