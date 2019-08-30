package com.example.aion.FragmentVasayelShakhsi


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import com.example.aion.FragmentAmlak.Fragment_Amlak
import com.example.aion.Fragment_category.Fragment_categury

import com.example.aion.R

/**
 * A simple [Fragment] subclass.
 */
class Fragment_vasayel_shakhsi : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentVasayelShakhsi = inflater.inflate(R.layout.fragment_vasayel_shakhsi, container, false)
        var back=fragmentVasayelShakhsi.findViewById<ImageView>(R.id.arrow_fragment_vasayel_shakhsi)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val kif = fragmentVasayelShakhsi.findViewById<LinearLayout>(R.id.lnrkif)
        val vasayelbache = fragmentVasayelShakhsi.findViewById<LinearLayout>(R.id.lnrVasayelBacheh)
        val tazini = fragmentVasayelShakhsi.findViewById<LinearLayout>(R.id.lnrTazini)
        val arayeshi = fragmentVasayelShakhsi.findViewById<LinearLayout>(R.id.lnrArayeshiBehdashti)
        val kafshbache = fragmentVasayelShakhsi.findViewById<LinearLayout>(R.id.lnrkafsholebasbache)

        val lavazemtahrir = fragmentVasayelShakhsi.findViewById<LinearLayout>(R.id.lnrLavazemTahrir)
        val agahi = fragmentVasayelShakhsi.findViewById<LinearLayout>(R.id.lnrAllAgahiVasayelShakhsi1)

        kif.setOnClickListener {

            val fragment = Fragment_kif_kafsh_lebas()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        vasayelbache.setOnClickListener {

            val fragment = Fragment_vasayel_bacheva_asbabbazi()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        tazini.setOnClickListener {

            val fragment = Fragment_tazeini()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        arayeshi.setOnClickListener {

            Toast.makeText(context,"آرایشی,بهداشتی و درمانی", Toast.LENGTH_LONG).show()
        }

        kafshbache.setOnClickListener {

            Toast.makeText(context,"کفش و لباس بچه", Toast.LENGTH_LONG).show()
        }


        lavazemtahrir.setOnClickListener {

            Toast.makeText(context,"لوازم تحریر", Toast.LENGTH_LONG).show()
        }

        agahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های وسایل شخصی", Toast.LENGTH_LONG).show()
        }

        return fragmentVasayelShakhsi
    }


}
