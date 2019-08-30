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
class Fragment_abzar : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentAbzar = inflater.inflate(R.layout.fragment_abzar, container, false)
        var back=fragmentAbzar.findViewById<ImageView>(R.id.arrow_abzar)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val lnrnezafat = fragmentAbzar.findViewById<LinearLayout>(R.id.lnrNezafat)
        val lnrtamirat = fragmentAbzar.findViewById<LinearLayout>(R.id.lnrTamirat)
        val lnragahi = fragmentAbzar.findViewById<LinearLayout>(R.id.lnrallagahiabzar)

        lnrnezafat.setOnClickListener {

            Toast.makeText(context,"نظافت و خیاطی و اتو", Toast.LENGTH_LONG).show()
        }

        lnrtamirat.setOnClickListener {

            Toast.makeText(context,"تعمیرات", Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های ابزار", Toast.LENGTH_LONG).show()
        }

        return fragmentAbzar
    }


}
