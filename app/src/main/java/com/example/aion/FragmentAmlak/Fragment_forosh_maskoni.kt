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


class Fragment_forosh_maskoni : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentForoshMaskoni = inflater.inflate(R.layout.fragment_forosh_maskoni, container, false)
        var back=fragmentForoshMaskoni.findViewById<ImageView>(R.id.arrow_fragment_frosh_maskoni)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val linAparteman = fragmentForoshMaskoni.findViewById<LinearLayout>(R.id.lnrAparteman)
        val linkhaneh = fragmentForoshMaskoni.findViewById<LinearLayout>(R.id.lnrkhane)
        val linzamin = fragmentForoshMaskoni.findViewById<LinearLayout>(R.id.lnrzamin)
        val linagahi = fragmentForoshMaskoni.findViewById<LinearLayout>(R.id.lnrAgahi)

        linAparteman.setOnClickListener {

            Toast.makeText(context,"آپارتمان",Toast.LENGTH_SHORT).show()
        }

        linkhaneh.setOnClickListener {

            Toast.makeText(context,"خانه",Toast.LENGTH_SHORT).show()
        }
        linzamin.setOnClickListener {

            Toast.makeText(context,"زمین",Toast.LENGTH_SHORT).show()
        }
        linagahi.setOnClickListener {

            Toast.makeText(context,"آگهی",Toast.LENGTH_SHORT).show()
        }


        return fragmentForoshMaskoni
    }


}
