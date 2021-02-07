package com.softsquared.viewpager2withnavigationcomponent.onBoarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.softsquared.viewpager2withnavigationcomponent.R
import com.softsquared.viewpager2withnavigationcomponent.databinding.FragmentThirdscreenBinding


class ThirdScreen : Fragment() {



    private lateinit var binding:FragmentThirdscreenBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding= FragmentThirdscreenBinding.inflate(layoutInflater,container, false)


        val view =binding.root


        binding.finish.setOnClickListener {


            findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)

            onBoardingFinishing()
        }

        return view
    }

    private fun onBoardingFinishing(){
        val sharedPref =requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor =sharedPref.edit()
        editor.putBoolean("Finished",true)
        editor.apply()


    }


}