package com.example.lesson_19_fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lesson_19_fragments.databinding.ActivityMainBinding
import com.example.lesson_19_fragments.utilits.APP_ACTIVITY

class MainActivity : AppCompatActivity() {

    lateinit var mNavController : NavController
    private lateinit var bind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        APP_ACTIVITY = this
        mNavController = Navigation.findNavController(this, R.id.nav_host_fragment)
    }


}