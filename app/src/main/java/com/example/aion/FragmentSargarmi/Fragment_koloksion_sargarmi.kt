package com.example.aion.FragmentSargarmi


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
class Fragment_koloksion_sargarmi : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentKoloksionSargarmi = inflater.inflate(R.layout.fragment_koloksion_sargarmi, container, false)
        var back=fragmentKoloksionSargarmi.findViewById<ImageView>(R.id.arrow_fragment_koloksioni_sargarmi)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val lnrsekeh = fragmentKoloksionSargarmi.findViewById<LinearLayout>(R.id.lnrsekeh)
        val lnratigheh = fragmentKoloksionSargarmi.findViewById<LinearLayout>(R.id.lnratigheh)
        val lnragahi = fragmentKoloksionSargarmi.findViewById<LinearLayout>(R.id.lnrallagahikoleksion)



        lnrsekeh.setOnClickListener {

            Toast.makeText(context,"سکه,تمبر و اسکناس", Toast.LENGTH_LONG).show()
        }

        lnratigheh.setOnClickListener {

            Toast.makeText(context,"اشیای عتیقه", Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های کلکسیون و سرگرمی", Toast.LENGTH_LONG).show()
        }


        return fragmentKoloksionSargarmi
    }


}
