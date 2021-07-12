package com.example.lesson_19_fragments.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lesson_19_fragments.R
import com.example.lesson_19_fragments.databinding.FragmentABinding
import com.example.lesson_19_fragments.utilits.APP_ACTIVITY


class FragmentA : Fragment() {
    private var _binding: FragmentABinding? = null
    private val mBinding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentABinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onStart() {
        super.onStart()
        mBinding.btnAToB.setOnClickListener {
            APP_ACTIVITY.mNavController.navigate(R.id.action_fragmentA_to_fragmentB)
        }
    }

}