package com.example.aion.FragmentMain


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageButton
import android.widget.ImageView
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager

import com.example.aion.R
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_yaddasht_va_neshan.*

class Fragment_yaddasht_va_neshan : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view:View= inflater.inflate(R.layout.fragment_yaddasht_va_neshan, container, false)
        var viewPager_yaddasht_va_neshan=view.findViewById<ViewPager>(R.id.viewPager_yaddasht_va_neshan)
       var tablayout_yaddasht_va_neshan=view.findViewById<TabLayout>(R.id.tablayout_yaddasht_va_neshan)
        viewPager_yaddasht_va_neshan.adapter=com.example.aion.TablayoutYaddashtVaNeshan.Adapter(childFragmentManager)

        tablayout_yaddasht_va_neshan.addTab(tablayout_yaddasht_va_neshan.newTab().setText("یادداشت ها"))
        tablayout_yaddasht_va_neshan.addTab(tablayout_yaddasht_va_neshan.newTab().setText(" نشان ها"))

        var back=view.findViewById<ImageView>(R.id.arrow_yaddasht)
        back.setOnClickListener(){
            activity!!.onBackPressed()
        }







        viewPager_yaddasht_va_neshan.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tablayout_yaddasht_va_neshan))
        tablayout_yaddasht_va_neshan.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager_yaddasht_va_neshan!!.currentItem = tab.position

            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })
        return view
    }


}
