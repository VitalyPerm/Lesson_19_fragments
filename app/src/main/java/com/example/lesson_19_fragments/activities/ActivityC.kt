package com.example.lesson_19_fragments.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.example.lesson_19_fragments.R
import com.example.lesson_19_fragments.databinding.ActivityCBinding
import com.example.lesson_19_fragments.utilits.ACTIVITY_C
lateinit var fragmentManager:FragmentManager
class ActivityC : AppCompatActivity() {
    private lateinit var bind: ActivityCBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityCBinding.inflate(layoutInflater)
        setContentView(bind.root)
        ACTIVITY_C = this

    }

    override fun onBackPressed() {
        super.onBackPressed()
        supportFragmentManager.popBackStack()
    }

}