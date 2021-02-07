package com.softsquared.viewpager2withnavigationcomponent.onBoarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.softsquared.viewpager2withnavigationcomponent.R
import com.softsquared.viewpager2withnavigationcomponent.databinding.FragmentFirstScreenBinding

class FirstScreen : Fragment() {



    private lateinit var binding:FragmentFirstScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding= FragmentFirstScreenBinding.inflate(layoutInflater, container, false)

        val view =binding.root


        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)


        binding.nextSecondButton.setOnClickListener {


            viewPager?.currentItem =1

        }
        return view
    }


}