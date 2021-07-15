package com.example.lesson_19_fragments.fragments

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lesson_19_fragments.R
import com.example.lesson_19_fragments.databinding.FragmentCBinding
import com.example.lesson_19_fragments.utilits.APP_ACTIVITY

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
            APP_ACTIVITY.navController.navigate(R.id.action_fragmentC_to_fragmentA)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Fragment C Destroyed")
    }




}