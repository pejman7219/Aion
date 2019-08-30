package com.example.aion.FragmentVasayelShakhsi


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
class Fragment_vasayel_bacheva_asbabbazi : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentVasayelBachevaAsbabbazi = inflater.inflate(R.layout.fragment_vasayel_bacheva_asbabbazi,container,false)
        var back=fragmentVasayelBachevaAsbabbazi.findViewById<ImageView>(R.id.arrow_fragment_vasayel_bacheva_asbabbazi)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val lnrasbabbazi = fragmentVasayelBachevaAsbabbazi.findViewById<LinearLayout>(R.id.lnrasbabbazi)
        val lnrkaleskeh = fragmentVasayelBachevaAsbabbazi.findViewById<LinearLayout>(R.id.lnrkaleskeh)
        val lnrsandalibacheh = fragmentVasayelBachevaAsbabbazi.findViewById<LinearLayout>(R.id.lnrsandalibacheh)
        val lnrasaebacheh = fragmentVasayelBachevaAsbabbazi.findViewById<LinearLayout>(R.id.lnrasasebacheh)
        val lnrsysmonibacheh = fragmentVasayelBachevaAsbabbazi.findViewById<LinearLayout>(R.id.lnrsysmonibachehn)
        val lnragahi = fragmentVasayelBachevaAsbabbazi.findViewById<LinearLayout>(R.id.lnrallagahivasayelbacheh)



        lnrasbabbazi.setOnClickListener {

            Toast.makeText(context,"اسباب بازی", Toast.LENGTH_LONG).show()
        }

        lnrkaleskeh.setOnClickListener {

            Toast.makeText(context,"کالسکه و لوازم جانبی", Toast.LENGTH_LONG).show()
        }

        lnrsandalibacheh.setOnClickListener {

            Toast.makeText(context,"صندلی بچه", Toast.LENGTH_LONG).show()
        }

        lnrasaebacheh.setOnClickListener {

            Toast.makeText(context,"اسباب و اثاث بچه", Toast.LENGTH_LONG).show()
        }

        lnrsysmonibacheh.setOnClickListener {

            Toast.makeText(context,"تخت و سیسمونی بچه", Toast.LENGTH_LONG).show()
        }
        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های وسایل بچه و اسباب بازی", Toast.LENGTH_LONG).show()
        }

        return fragmentVasayelBachevaAsbabbazi
    }


}
