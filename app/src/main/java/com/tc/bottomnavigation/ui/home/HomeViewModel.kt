package com.tc.bottomnavigation.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    fun getUserList(): List<String> {
        return listOf(
            "Peter",
            "Tiewah",
            "Abdullahi",
            "Munye",
            "Samuel",
            "Bassett",
            "Jermaine",
            "Tucker",
            "Mukarrim",
            "Adam"
        )
    }

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}