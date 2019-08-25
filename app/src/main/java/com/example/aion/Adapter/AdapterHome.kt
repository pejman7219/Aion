package com.example.aion.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.aion.Fragment.*

class AdapterHome (fm : FragmentManager):FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when(position)
        {
            0 -> return Fragment_home()
            1 -> return Fragment_categury()
            2 -> return Fragment_new_add()
            3 -> return Fragment_chat()
            else -> return Fragment_mydivar()
        }
    }

    override fun getCount(): Int {
        return 5
   }
}