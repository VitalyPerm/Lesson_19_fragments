package com.example.lesson_19_fragments.fragments

import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.pm.ConfigurationInfo
import android.content.res.Configuration
import android.content.res.Resources
import android.graphics.drawable.GradientDrawable
import android.net.wifi.hotspot2.ConfigParser
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.view.isGone
import androidx.fragment.app.FragmentManager
import com.example.lesson_19_fragments.R
import com.example.lesson_19_fragments.activities.ActivityA
import com.example.lesson_19_fragments.databinding.FragmentCBinding
import com.example.lesson_19_fragments.utilits.ACTIVITY_C

private const val TAG = "FragmentC"
class FragmentC : Fragment() {
    lateinit var bind: FragmentCBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Fragment C created")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = FragmentCBinding.inflate(layoutInflater, container, false)
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind.btnCToA.visibility =
            if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) View.GONE else View.VISIBLE
    }



    override fun onStart() {
        super.onStart()
        bind.btnCToA.setOnClickListener {
            val i = Intent(ACTIVITY_C, ActivityA::class.java)
            startActivity(i)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Fragment C Destroyed")
    }




}