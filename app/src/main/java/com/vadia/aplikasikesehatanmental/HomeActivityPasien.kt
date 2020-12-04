package com.vadia.aplikasikesehatanmental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.Gravity
import android.widget.*
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.navbar_drawer.*
import kotlinx.android.synthetic.main.toolbar_pasien.*
import kotlinx.android.synthetic.main.toolbar_pasien.view.*

class HomeActivityPasien : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_pasien)
        initUI()
    }

    private fun initUI(){
        val drawerLayout : DrawerLayout = findViewById(R.id.drawer_layout)
        val menu : ImageButton = findViewById<RelativeLayout>(R.id.toolbar_pasien).findViewById(R.id.menu)
        val navPasien: LinearLayout = findViewById(R.id.navbar_pasien)
        val edit : LinearLayout = navPasien.findViewById(R.id.nav_edit)
        val setting : LinearLayout = navPasien.findViewById(R.id.nav_setting)
        val logout : LinearLayout = navPasien.findViewById(R.id.nav_logout)
        val mainLayout : LinearLayout = navPasien.findViewById(R.id.main_layout)

        menu.setOnClickListener{
            openDrawer(drawerLayout)
        }

        edit.setOnClickListener{
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
        }

        /*setting.setOnClickListener {

        }*/

        logout.setOnClickListener {
            //drawerLayout.closeDrawer(GravityCompat.START)
            FirebaseAuth.getInstance().signOut()
            //Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        mainLayout.setOnClickListener {
            closeDrawer(drawerLayout)
        }
    }

    private fun openDrawer(drawerLayout: DrawerLayout){
        drawerLayout.openDrawer(GravityCompat.END)
    }

    private fun closeDrawer(drawerLayout: DrawerLayout){
        if(drawerLayout.isDrawerOpen(GravityCompat.END)){
            drawerLayout.closeDrawer(GravityCompat.END)
        }
    }
}