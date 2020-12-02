package com.vadia.aplikasikesehatanmental.ui.editprofile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.vadia.aplikasikesehatanmental.R

class EditProfileFragment : Fragment() {

    private lateinit var editProfileViewModel: EditProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        editProfileViewModel =
            ViewModelProvider(this).get(EditProfileViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_edit_profile, container, false)
        initUI()
        /*editProfileViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/
        return root
    }

    private fun initUI() {
        //Code to change profile
    }
}