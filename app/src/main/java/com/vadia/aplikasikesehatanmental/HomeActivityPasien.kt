package com.vadia.aplikasikesehatanmental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import android.widget.Toolbar
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
        //initUI()
    }

    private fun initUI(){
        val drawerLayout : DrawerLayout = findViewById(R.id.drawer_layout)
        val toolbar : Toolbar = findViewById(R.id.toolbar)
        /*menu.setOnClickListener{
            openDrawer(drawerLayout)
        }

        nav_edit.setOnClickListener{
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
        }
        nav_setting.setOnClickListener {

        }
        nav_logout.setOnClickListener {
            drawerLayout.closeDrawer(GravityCompat.START)
            FirebaseAuth.getInstance().signOut()
            Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        main_layout.setOnClickListener {
            closeDrawer(drawerLayout)
        }*/
    }




    private fun openDrawer(drawerLayout: DrawerLayout){
        drawerLayout.openDrawer(GravityCompat.START)
    }

    private fun closeDrawer(drawerLayout: DrawerLayout){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START)
        }
    }
}