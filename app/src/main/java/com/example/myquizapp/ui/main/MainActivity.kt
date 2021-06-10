package com.example.myquizapp.ui.main

import android.os.Bundle
import android.view.WindowManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.myquizapp.R
import com.example.myquizapp.ui.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        view_pager2.adapter = ViewPagerAdapter(this)
        view_pager2.isUserInputEnabled = false
        nav_view.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_home -> {
                    view_pager2.currentItem = 0
                }
                R.id.navigation_history -> {
                    view_pager2.currentItem = 1
                }
                R.id.navigation_settings -> {
                    view_pager2.currentItem = 2
                }
                else -> view_pager2.currentItem = 0
            }
            false
        }


    }
}