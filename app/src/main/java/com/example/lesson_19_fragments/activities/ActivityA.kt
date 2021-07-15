package com.example.lesson_19_fragments.activities

import android.content.pm.ActivityInfo.SCREEN_ORIENTATION_USER_PORTRAIT
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson_19_fragments.databinding.ActivityABinding
import com.example.lesson_19_fragments.utilits.ACTIVITY_A

class ActivityA : AppCompatActivity() {


    private lateinit var bind: ActivityABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityABinding.inflate(layoutInflater)
        setContentView(bind.root)
        ACTIVITY_A = this
    }



}


//lateinit var mNavController : NavController
//        mNavController = Navigation.findNavController(this, R.id.fragment_container_a)