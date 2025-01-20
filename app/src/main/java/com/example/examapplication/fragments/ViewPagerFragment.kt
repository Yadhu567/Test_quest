package com.example.examapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.examapplication.R
import com.example.examapplication.ViewPageAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ViewPagerFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView=inflater.inflate(R.layout.viewpager_fragment,container,false)

        val tabLayout=rootView.findViewById<TabLayout>(R.id.tabLayout)
        val viewPager=rootView.findViewById<ViewPager2>(R.id.viewPager)

        val viewFragmentOne=ViewFragmentOne()
        val viewFragmentTwo=ViewFragmentTwo()

        val adapter=ViewPageAdapter(this)

        adapter.addFragment(viewFragmentOne,"first page")
        adapter.addFragment(viewFragmentTwo,"second page")

        viewPager.adapter=adapter
        viewPager.currentItem=0
        viewPager.offscreenPageLimit=1

        TabLayoutMediator(tabLayout, viewPager){tab,position->
            tab.text=adapter.getTabTitle(position)
        }.attach()

        return rootView
    }

    override fun onViewCreated(rootView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(rootView, savedInstanceState)
    }
}