package com.example.aion.FragmentLavazemElectronic


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast

import com.example.aion.R

/**
 * A simple [Fragment] subclass.
 */
class Fragment_mobil_tablet : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentMobilTablet = inflater.inflate(R.layout.fragment_mobil_tablet, container, false)
        var back=fragmentMobilTablet.findViewById<ImageView>(R.id.arrow_fragment_mobile_tablet)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val lnrgoshi = fragmentMobilTablet.findViewById<LinearLayout>(R.id.lnrGoshiMobil)
        val lnrtablet = fragmentMobilTablet.findViewById<LinearLayout>(R.id.lnrTablet)
        val lnrlavazem = fragmentMobilTablet.findViewById<LinearLayout>(R.id.lnrLavazemJanebiMobil)
        val lnrsimkart = fragmentMobilTablet.findViewById<LinearLayout>(R.id.lnrSimKart)
        val lnragahi = fragmentMobilTablet.findViewById<LinearLayout>(R.id.lnrAllAgahiMobil)



        lnrgoshi.setOnClickListener {

            Toast.makeText(context,"گوشی موبایل", Toast.LENGTH_LONG).show()
        }

        lnrtablet.setOnClickListener {

            Toast.makeText(context,"تبلت", Toast.LENGTH_LONG).show()
        }

        lnrlavazem.setOnClickListener {

            Toast.makeText(context,"لوازم جانبی موبایل و تبلت", Toast.LENGTH_LONG).show()
        }

        lnrsimkart.setOnClickListener {

            Toast.makeText(context,"سیم کارت", Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های موبایل و تبلت", Toast.LENGTH_LONG).show()
        }
        
        
        return fragmentMobilTablet
    }


}
