package com.example.aion.TablayoutYaddashtVaNeshan

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter



    class Adapter(fm: FragmentManager): FragmentStatePagerAdapter(fm){
        override fun getItem(position: Int): Fragment {
            return when(position){

                0 -> TabYaddasht()
                else ->  TabNeshan()
            }
        }

        override fun getCount(): Int {
            return 2
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return when(position){

                0 -> "یادداشت ها"
                else -> "نشان ها"
            }
            return super.getPageTitle(position)
        }
    }
