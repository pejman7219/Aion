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
class Fragment_lavazem_electronic : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentLavazemElectronic = inflater.inflate(R.layout.fragment_fragment_lavazem_electronic, container, false)
        var back=fragmentLavazemElectronic.findViewById<ImageView>(R.id.arrow_fragment_lavazem_electronic)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val mobilvaTablet = fragmentLavazemElectronic.findViewById<LinearLayout>(R.id.lnrmobileTablet)
        val Rayaneh = fragmentLavazemElectronic.findViewById<LinearLayout>(R.id.lnrRayaneh)
        val konsolbazi = fragmentLavazemElectronic.findViewById<LinearLayout>(R.id.lnrKonsolBazi)
        val sotitasziri = fragmentLavazemElectronic.findViewById<LinearLayout>(R.id.lnrSotTasvir)
        val telephoneRomizi = fragmentLavazemElectronic.findViewById<LinearLayout>(R.id.lnrTelephoneRomizi)
        val agahi = fragmentLavazemElectronic.findViewById<LinearLayout>(R.id.lnrAllAgahiLavazemElectronic)

        mobilvaTablet.setOnClickListener {

            val fragment = Fragment_mobil_tablet()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        Rayaneh.setOnClickListener {

            val fragment = Fragment_rayaneh()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        konsolbazi.setOnClickListener {

            Toast.makeText(context,"کنسول بازی ویدیویی و آنلاین",Toast.LENGTH_LONG).show()
        }

        sotitasziri.setOnClickListener {

            val fragment = Fragment_sot_tasvir()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        telephoneRomizi.setOnClickListener {

            Toast.makeText(context,"تلفن رومیزی",Toast.LENGTH_LONG).show()
        }

        agahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های لوازم الکترونیک",Toast.LENGTH_LONG).show()
        }


        return fragmentLavazemElectronic
    }


}
