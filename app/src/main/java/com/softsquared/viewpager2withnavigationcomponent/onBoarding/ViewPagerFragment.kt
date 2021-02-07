package com.softsquared.viewpager2withnavigationcomponent.onBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.softsquared.viewpager2withnavigationcomponent.R
import com.softsquared.viewpager2withnavigationcomponent.databinding.FragmentViewPagerBinding
import com.softsquared.viewpager2withnavigationcomponent.onBoarding.screens.FirstScreen
import com.softsquared.viewpager2withnavigationcomponent.onBoarding.screens.SecondScreen
import com.softsquared.viewpager2withnavigationcomponent.onBoarding.screens.ThirdScreen


class ViewPagerFragment : Fragment() {

    // 처음 설명 나오고 안 나올 부분.

    private lateinit var binding:FragmentViewPagerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding= FragmentViewPagerBinding.inflate(layoutInflater, container, false)
        val view =binding.root
        // Inflate the layout for this fragment

        val fragmentList = arrayListOf<Fragment>(

            FirstScreen(),
            SecondScreen(),
            ThirdScreen()

        )

        val adapter =ViewPagerAdapter(

            fragmentList,requireActivity().supportFragmentManager,lifecycle


        )


        binding.viewPager.adapter=adapter


        return view
    }


}