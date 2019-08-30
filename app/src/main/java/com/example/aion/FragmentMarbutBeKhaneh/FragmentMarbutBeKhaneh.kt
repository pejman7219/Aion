package com.example.aion.FragmentMarbutBeKhaneh


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
class FragmentMarbutBeKhaneh : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentMarbutBeKhaneh = inflater.inflate(R.layout.fragment_marbut_be_khaneh, container, false)
        var back=fragmentMarbutBeKhaneh.findViewById<ImageView>(R.id.arrow_fragment_marbut_be_khaneh)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val tazinat = fragmentMarbutBeKhaneh.findViewById<LinearLayout>(R.id.lnrvasayelTazinatKhaneh)
        val vasayelAshpazkhaneh = fragmentMarbutBeKhaneh.findViewById<LinearLayout>(R.id.lnrVasayelAshpazkhaneh)
        val Abzar = fragmentMarbutBeKhaneh.findViewById<LinearLayout>(R.id.lnrAbzar)
        val SakhtemanVaHayat = fragmentMarbutBeKhaneh.findViewById<LinearLayout>(R.id.lnrSakhtemanVaHayat)
        val agahi = fragmentMarbutBeKhaneh.findViewById<LinearLayout>(R.id.lnrAllAgahiMarbutBeKhaneh)
        tazinat.setOnClickListener {

            val fragment = Fragment_vasayel_tazinat()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        vasayelAshpazkhaneh.setOnClickListener {

            val fragment = Fragment_vasayel_ashpazkhaneh()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        Abzar.setOnClickListener {

            val fragment = Fragment_abzar()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        SakhtemanVaHayat.setOnClickListener {

            val fragment = Fragment_sakhteman_hayat()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        agahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های مربوط به خانه", Toast.LENGTH_LONG).show()

        }



        return fragmentMarbutBeKhaneh
    }


}
