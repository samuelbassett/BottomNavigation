package com.tc.bottomnavigation.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tc.bottomnavigation.R

class DashboardViewModel : ViewModel() {

    fun getTitleList() : List<String> {
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

    fun getDescriptionList() : List<String> {
        return listOf(
            "An adventurous traveler who loves exploring new cultures and cuisines, always with a camera in hand.",
            "A dedicated programmer with a passion for solving complex problems and a knack for elegant code.",
            "A fitness enthusiast who enjoys outdoor activities like hiking and cycling, striving for a healthy lifestyle.",
            "A talented musician who can play multiple instruments and compose beautiful melodies that touch the soul.",
            "A nature lover and environmentalist, actively involved in conservation efforts to protect our planet.",
            "A foodie with a culinary talent, delighting friends and family with gourmet dishes from around the world.",
            "A dedicated teacher who empowers students to learn, grow, and achieve their full potential.",
            "A philanthropist with a big heart, making a difference by helping those in need through various charities.",
            "An aspiring author, weaving stories that captivate readers with vivid characters and imaginative worlds.",
            "A lifelong learner, constantly seeking new knowledge and skills to adapt to an ever-changing world."
        )
    }

    fun getImageList() : List<Int> {
        return listOf(
            R.drawable.ic_person1,
            R.drawable.ic_person2,
            R.drawable.ic_person3,
            R.drawable.ic_person4,
            R.drawable.ic_person5,
            R.drawable.ic_person6,
            R.drawable.ic_person7,
            R.drawable.ic_person8,
            R.drawable.ic_person9,
            R.drawable.ic_person10,
        )
    }

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}
