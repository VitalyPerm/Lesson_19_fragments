package com.example.lesson_19_fragments.fragments

import android.content.Intent
import android.content.res.Configuration.ORIENTATION_LANDSCAPE
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lesson_19_fragments.activities.ActivityB
import com.example.lesson_19_fragments.activities.ActivityC
import com.example.lesson_19_fragments.databinding.FragmentABinding
import com.example.lesson_19_fragments.utilits.ACTIVITY_A

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
            val i = Intent(ACTIVITY_A, ActivityB::class.java)
            startActivity(i)
        }
        bind.btnAToC.setOnClickListener {
            val i = Intent(ACTIVITY_A, ActivityC::class.java)
            startActivity(i)
        }


    }
//    override fun onConfigurationChanged(newConfig: Configuration) {
//        super.onConfigurationChanged(newConfig)
//        Log.d(TAG, "Configuration changed called")
//        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            bind.btnAToB.visibility = View.GONE
//        }
//    }


}


//ACTIVITY_A.mNavController.navigate(R.id.action_fragmentA_to_fragmentC )