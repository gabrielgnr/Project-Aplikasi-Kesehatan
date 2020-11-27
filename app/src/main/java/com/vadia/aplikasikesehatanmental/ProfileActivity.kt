package com.vadia.aplikasikesehatanmental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.auth.User
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.vadia.aplikasikesehatanmental.DataModel.Pasien
import kotlinx.android.synthetic.main.profile_activity.*

class ProfileActivity : AppCompatActivity() {

    //private val firebaseDatabase = FirebaseDatabase.getInstance()
    //private val firebaseAuth = FirebaseAuth.getInstance()
    private val db = Firebase.firestore
    private val pasien= db.collection("pasien")
    //private val psikiater= db.collection("psikiater")
    private var user: User? = null
    private lateinit var auth: FirebaseAuth

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
        //TODO: Get data?
        /*
        val ref=pasien
        ref.addSnapshotListener { value, error ->
            if(error!=null){

            }
            else
        }

         */
        /*
        pasien.where("user", "==", auth.currentUser?.uid)
        //name_info.text = pasien.get()
        birth_place_and_date_info.text=pasien.birthplace.toString()+", "+pasien.birthdate.toString()
        phone_number.text = pasien.phone.toString()
        username_info.text = user.username.toString()
        email_info.text=""

         */
    }
}