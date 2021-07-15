package com.example.lesson_19_fragments.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lesson_19_fragments.R
import com.example.lesson_19_fragments.databinding.ActivityABinding
import com.example.lesson_19_fragments.utilits.APP_ACTIVITY


class ActivityA : AppCompatActivity() {
    lateinit var navController: NavController

    private lateinit var bind: ActivityABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityABinding.inflate(layoutInflater)
        setContentView(bind.root)
        APP_ACTIVITY = this
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
    }


}



