package com.vadia.aplikasikesehatanmental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.auth.User
import kotlinx.android.synthetic.main.profile_activity.*

class ProfileActivity : AppCompatActivity() {

    private val firebaseDatabase = FirebaseDatabase.getInstance()
    private val firebaseAuth = FirebaseAuth.getInstance()
    private var user: User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_activity)

        initUI()
    }

    private fun initUI(){
        setData()

        edit_data.setOnClickListener {
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun setData(){
        name_info.text = pasien.fullname.toString()
        birth_place_and_date_info.text=pasien.birthplace.toString()+", "+pasien.birthdate.toString()
        phone_number.text = pasien.phone.toString()
        username_info.text = user.username.toString()
        email_info.text=""
    }
}