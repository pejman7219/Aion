package com.example.aion.FragmentAmlak


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
class Fragment_Amlak : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentAmlak =  inflater.inflate(R.layout.fragment__amlak, container, false)
var back=fragmentAmlak.findViewById<ImageView>(R.id.amlak_arrow)
        val lnrapartrman = fragmentAmlak.findViewById<LinearLayout>(R.id.lnrforoshMaskoni)
        val lnrejarehMaskoni = fragmentAmlak.findViewById<LinearLayout>(R.id.lnrEjarehMaskoni)
        val lnrForoshEdary = fragmentAmlak.findViewById<LinearLayout>(R.id.lnrFroshTejari)
        val lnrEjarehEdary = fragmentAmlak.findViewById<LinearLayout>(R.id.lnrEjarehTejari)
        val lnrEjarehKotahModat = fragmentAmlak.findViewById<LinearLayout>(R.id.lnrEjarehKotahModat)
        val lnrKhadamatAmlak = fragmentAmlak.findViewById<LinearLayout>(R.id.lnrKhadamatAmlak)
        val lnrAllAgahi = fragmentAmlak.findViewById<LinearLayout>(R.id.lnrAllAgahi)



back.setOnClickListener(){
    activity!!.onBackPressed()
}
        lnrapartrman.setOnClickListener {
            val fragment = Fragment_forosh_maskoni()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        lnrejarehMaskoni.setOnClickListener {
            val fragment = Fragment_ejareh_maskoni()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        lnrForoshEdary.setOnClickListener {
            val fragment = Fragment_frosh_edary()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        lnrEjarehEdary.setOnClickListener {
            val fragment = Fragment_ejareh_edary()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        lnrEjarehKotahModat.setOnClickListener {
            val fragment = Fragment_ejareh_kotahmodat()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        lnrKhadamatAmlak.setOnClickListener {
            val fragment = Fragment_khadamat_amlak()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        lnrAllAgahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های املاک ",Toast.LENGTH_LONG).show()
        }



        return fragmentAmlak
    }


}
