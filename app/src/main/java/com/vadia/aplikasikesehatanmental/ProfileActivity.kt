package com.vadia.aplikasikesehatanmental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.auth.User
import com.vadia.aplikasikesehatanmental.UIPasien.EditProfileActivity
import kotlinx.android.synthetic.main.profile_activity.*
import org.w3c.dom.Text
import java.util.*

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
        /*Perlu ini gak sih sebenernya?
        //Info data pribadi
        val name = findViewById<TextView>(R.id.name_info)
        val birth = findViewById<TextView>(R.id.birth_place_and_date_info)
        val telephone = findViewById<TextView>(R.id.phonenumberinfo)
        //Info data akun
        val username = findViewById<TextView>(R.id.username_info)
        val email = findViewById<TextView>(R.id.email_info)
        val password = findViewById<TextView>(R.id.passwordinfo)*/

        edit_data.setOnClickListener {
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}