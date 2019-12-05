package com.example.recyclerviewwithdatabinding.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MyViewModel {
    private val _selectedID = MutableLiveData<String>()
    val selectedId: LiveData<String> = _selectedID
}