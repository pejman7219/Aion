package com.example.aion.FragmentVasayelNaghlieh


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import com.example.aion.FragmentfragmentKhodro.Fragment_Khodro

import com.example.aion.R


class FragmentVasayelNaghlieh : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vasayelNaghlieh = inflater.inflate(R.layout.fragment_vasayel_naghlieh, container, false)
        var back=vasayelNaghlieh.findViewById<ImageView>(R.id.arrow_fragment_vasayel_naghlieh)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val lnrkhodro = vasayelNaghlieh.findViewById<LinearLayout>(R.id.lnrkhodro)
        val lnrghatat = vasayelNaghlieh.findViewById<LinearLayout>(R.id.lnrghateatyadakikhodro)
        val lnrghayegh = vasayelNaghlieh.findViewById<LinearLayout>(R.id.lnrghayegh)
        val lnragahi = vasayelNaghlieh.findViewById<LinearLayout>(R.id.lnrAllAgahikhodro)

        lnrkhodro.setOnClickListener {
            val fragment = Fragment_Khodro()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        lnrghatat.setOnClickListener {

            Toast.makeText(context,"قطعات یدکی و لوازم جانبی خودرو",Toast.LENGTH_LONG).show()
        }

        lnrghayegh.setOnClickListener {

            Toast.makeText(context,"قایق",Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های وسایل نقلیه",Toast.LENGTH_LONG).show()
        }


        return vasayelNaghlieh
    }


}
