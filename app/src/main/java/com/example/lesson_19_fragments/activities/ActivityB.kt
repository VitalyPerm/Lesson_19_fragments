package com.example.lesson_19_fragments.activities

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson_19_fragments.databinding.ActivityBBinding
import com.example.lesson_19_fragments.utilits.ACTIVITY_B

class ActivityB : AppCompatActivity() {
    private lateinit var bind: ActivityBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityBBinding.inflate(layoutInflater)
        setContentView(bind.root)
        ACTIVITY_B = this
    }
}