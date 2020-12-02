package com.vadia.aplikasikesehatanmental.ui.editprofile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EditProfileViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Kendal kaline wungu."
    }
    val text: LiveData<String> = _text
}