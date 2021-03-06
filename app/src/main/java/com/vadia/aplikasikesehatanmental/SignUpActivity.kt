package com.vadia.aplikasikesehatanmental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.vadia.aplikasikesehatanmental.DataModel.Pasien
import com.vadia.aplikasikesehatanmental.DataModel.Psikiater
import com.vadia.aplikasikesehatanmental.DataModel.User

import kotlinx.android.synthetic.main.activity_sign_up.*
import java.util.*

class SignUpActivity : AppCompatActivity() {
    private val db = Firebase.firestore
    private val pasien= db.collection("pasien")
    //private val user_pasien=db.collection("pasien_user")
    private val psikiater= db.collection("psikiater")
   // private val user_psikiater=db.collection("psikiater_user")
    private val user = db.collection("user")

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        auth = Firebase.auth
        initUI()
    }

    private fun roleOnClick(): String? = when (role.checkedRadioButtonId) {
        R.id.type_psikiater-> "psikiater"
        R.id.type_pasien -> "pasien"
        else -> null
    }

    private fun initUI() {

        click_here.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    register.setOnClickListener {
        val fullName=fullname.text.toString()
        val username=username.text.toString()
        val email=email.text.toString()
        val birthplace = birthplace.text.toString()
        val birthdate = birthdate.text.toString()
        val newPass=new_password.text.toString()
        val confirmPass=confirm_password.text.toString()

        val phone = no_hp.text.toString()

        //User Type
        val userType = roleOnClick()
        //Kalau pasien
        if (userType.equals("pasien")){
            //Cek password
            if(newPass.equals(confirmPass)&&!newPass.isEmpty()) {
                addPasien(fullname = fullName,
                        username = username,
                        email = email,
                    noTelp = phone,
                        birthDate = birthdate,
                        birthplace = birthplace,
                        password = newPass)
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
        //Kalau psikiater
        else{

            if(newPass.equals(confirmPass)&&!newPass.isEmpty()) {
                addPsikiater(fullname = fullName,
                    username = username,
                    email = email,
                    noTelp = phone,
                    password = newPass)
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

    private fun addPasien(fullname: String,
                          username: String,
                          email: String,
                          noTelp: String,
                          birthplace: String,
                          birthDate: String,
                          password: String){
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                //Kalau berhasil
                if (task.isSuccessful) {
                    //Add to DB
                    val uid = auth.uid!!
                    val pasien_id=UUID.randomUUID().toString()
                    val newPasien=Pasien(
                            uid = uid,
                            pasien_id = pasien_id,
                            fullName = fullname,
                            phone = noTelp,
                            birthplace = birthplace,
                            birthdate = birthDate
                    )
                    val newUser = User(
                            user_id = uid,
                            username = username,
                            email = email,
                            role = "pasien"
                    )

                    //Add user:
                    user.document(uid)
                            .set(newUser).
                            addOnSuccessListener { Toast.makeText(baseContext, resources.getString(R.string.success_sign_up), Toast.LENGTH_SHORT).show()}
                            .addOnFailureListener { Toast.makeText(baseContext, "Error, cannot add new user.",Toast.LENGTH_SHORT).show() }
                    //Add pasien info :
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
                    val newPsikiater= Psikiater(uid=uid,
                            psikiater_id = psikiater_id,
                            fullName = fullname,
                            email = email,
                            phone = noTelp)

                    val newUser = User(user_id=uid,
                    username=username,
                    email =email,
                    role="psikiater")
                    //Add user:
                    user.document(uid)
                            .set(newUser).
                            addOnSuccessListener { Toast.makeText(baseContext, resources.getString(R.string.success_sign_up), Toast.LENGTH_SHORT).show()}
                            .addOnFailureListener { Toast.makeText(baseContext, "Error, cannot add new user.",Toast.LENGTH_SHORT).show() }
                    //Add data psikiater
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
        //val intent = Intent(this, HomeActivityPasien::class.java)
        val intent=Intent (this, HomeActivityPasien::class.java)
        startActivity(intent)
        finish()
    }

    private fun updateUIPsikiater() {
        val intent = Intent(this, HomeActivityPsikiater::class.java)
        startActivity(intent)
        finish()
    }


}