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
class Fragment_ejareh_maskoni : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentejarehMaskoni = inflater.inflate(R.layout.fragment_ejareh_maskoni, container, false)
        var back=fragmentejarehMaskoni.findViewById<ImageView>(R.id.arrow_ejare_maskoni)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val linAparteman = fragmentejarehMaskoni.findViewById<LinearLayout>(R.id.lnrAAparteman)
        val linkhaneh = fragmentejarehMaskoni.findViewById<LinearLayout>(R.id.lnrKkhane)
        val linagahi = fragmentejarehMaskoni.findViewById<LinearLayout>(R.id.lnrAAgahi)

        linAparteman.setOnClickListener {

            Toast.makeText(context,"آپارتمان", Toast.LENGTH_SHORT).show()
        }

        linkhaneh.setOnClickListener {

            Toast.makeText(context,"خانه", Toast.LENGTH_SHORT).show()
        }

        linagahi.setOnClickListener {

            Toast.makeText(context,"آگهی", Toast.LENGTH_SHORT).show()
        }


        return fragmentejarehMaskoni
    }


}
