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
class Fragment_ejareh_kotahmodat : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentEjarehKotahmodat = inflater.inflate(R.layout.fragment_ejareh_kotahmodat, container, false)
        var back=fragmentEjarehKotahmodat.findViewById<ImageView>(R.id.arrow_ejare_khadamat)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val linsuit = fragmentEjarehKotahmodat.findViewById<LinearLayout>(R.id.lnrkotahModatSuit)
        val linvila = fragmentEjarehKotahmodat.findViewById<LinearLayout>(R.id.lnrkotahModatVila)
        val lindaftarkar = fragmentEjarehKotahmodat.findViewById<LinearLayout>(R.id.lnrkotahModatDaftarKar)
        val linagahi = fragmentEjarehKotahmodat.findViewById<LinearLayout>(R.id.lnrkotahModatAllAgahi)

        linsuit.setOnClickListener {

            Toast.makeText(context,"سوئیت", Toast.LENGTH_SHORT).show()
        }

        linvila.setOnClickListener {

            Toast.makeText(context,"ویلا", Toast.LENGTH_SHORT).show()
        }
        lindaftarkar.setOnClickListener {

            Toast.makeText(context,"دفتر کار", Toast.LENGTH_SHORT).show()
        }
        linagahi.setOnClickListener {

            Toast.makeText(context,"آگهی", Toast.LENGTH_SHORT).show()
        }
        
        return fragmentEjarehKotahmodat
    }


}
