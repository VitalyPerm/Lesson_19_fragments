package com.example.lesson_19_fragments.fragments

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lesson_19_fragments.R
import com.example.lesson_19_fragments.activities.ActivityA
import com.example.lesson_19_fragments.databinding.FragmentClandBinding
import com.example.lesson_19_fragments.utilits.ACTIVITY_C


class FragmentCland : Fragment() {

    lateinit var bind: FragmentClandBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = FragmentClandBinding.inflate(layoutInflater,container,false)
        return bind.root
    }
    override fun onStart() {
        super.onStart()
        bind.btnCToA.setOnClickListener {
            val i = Intent(ACTIVITY_C, ActivityA::class.java)
            startActivity(i)
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind.btnCToA.visibility =
            if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) View.GONE else View.VISIBLE

    }


}