package com.example.lesson_19_fragments.fragments

import android.content.res.Configuration.ORIENTATION_LANDSCAPE
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lesson_19_fragments.R
import com.example.lesson_19_fragments.databinding.FragmentABinding
import com.example.lesson_19_fragments.utilits.APP_ACTIVITY

private const val TAG = "FragmentA"
class FragmentA : Fragment() {
    private lateinit var bind: FragmentABinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = FragmentABinding.inflate(layoutInflater, container, false)
        return bind.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "on view created called")
        bind.btnAToB.visibility =
            if (resources.configuration.orientation == ORIENTATION_LANDSCAPE) View.GONE else View.VISIBLE
        bind.btnAToC.visibility =
            if (resources.configuration.orientation == ORIENTATION_LANDSCAPE) View.GONE else View.VISIBLE

    }

    override fun onStart() {
        super.onStart()
        bind.btnAToB.setOnClickListener {
            APP_ACTIVITY.navController.navigate(R.id.action_fragmentA_to_fragmentB)
        }
        bind.btnAToC.setOnClickListener {
            APP_ACTIVITY.navController.navigate(R.id.action_fragmentA_to_fragmentC)
        }


    }


}


