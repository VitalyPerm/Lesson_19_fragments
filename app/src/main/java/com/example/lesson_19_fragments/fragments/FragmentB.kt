package com.example.lesson_19_fragments.fragments

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lesson_19_fragments.R
import com.example.lesson_19_fragments.databinding.FragmentBBinding
import com.example.lesson_19_fragments.utilits.APP_ACTIVITY


class FragmentB : Fragment() {
    private lateinit var bind: FragmentBBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = FragmentBBinding.inflate(layoutInflater, container, false)
        return bind.root
    }

    override fun onStart() {
        super.onStart()
        bind.btnBToC.setOnClickListener {
            APP_ACTIVITY.navController.navigate(R.id.action_fragmentB_to_fragmentC)
        }
        bind.btnBToA.setOnClickListener {
            APP_ACTIVITY.navController.navigate(R.id.action_fragmentB_to_fragmentA)
        }
        bind.btnFinish.setOnClickListener {
            activity?.finishAffinity()
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind.btnBToA.visibility =
            if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) View.GONE else View.VISIBLE
        bind.btnBToC.visibility =
            if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) View.GONE else View.VISIBLE
        bind.btnFinish.visibility = if(resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) View.VISIBLE else View.GONE
    }


}