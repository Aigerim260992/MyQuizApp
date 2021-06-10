package com.example.myquizapp.ui.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myquizapp.ui.main.history.HistoryFragment
import com.example.myquizapp.ui.main.home.HomeFragment
import com.example.myquizapp.ui.main.settings.SettingsFragment

class ViewPagerAdapter (container: FragmentActivity) : FragmentStateAdapter(container) {
    companion object {
        private const val PAGE_COUNT = 3
    }
    override fun getItemCount() = PAGE_COUNT

    override fun createFragment(position: Int): Fragment {
        return  when (position){
            0 -> HomeFragment()
            1 -> HistoryFragment()
            2 -> SettingsFragment()
            else -> HomeFragment()
        }
    }
}