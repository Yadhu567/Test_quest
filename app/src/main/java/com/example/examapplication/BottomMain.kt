package com.example.examapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.fragment.app.FragmentActivity
import com.example.examapplication.fragments.RecylerFragment
import com.example.examapplication.fragments.ViewPagerFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomMain:FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        setContentView(R.layout.bottom_navigation_main)

        val bottomNavigation=findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigation.selectedItemId=R.id.nav_fragment_one


        bottomNavigation.setOnItemSelectedListener { item->
            when(item.itemId){
                R.id.nav_fragment_one->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame1, RecylerFragment())
                        .commit()
                }
                else -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame1, ViewPagerFragment())
                        .commit()
                }
            }
            true
        }
        supportFragmentManager.beginTransaction().replace(R.id.frame1, RecylerFragment())
            .commit()
    }
}