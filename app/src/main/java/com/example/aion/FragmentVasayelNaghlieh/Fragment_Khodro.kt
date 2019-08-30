package com.example.aion.FragmentfragmentKhodro


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
class Fragment_Khodro : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val fragmentKhodro = inflater.inflate(R.layout.fragment__khodro, container, false)
        var back=fragmentKhodro.findViewById<ImageView>(R.id.khodro_arrow)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val lnrsavary = fragmentKhodro.findViewById<LinearLayout>(R.id.lnrsavary)
        val lnrclasic = fragmentKhodro.findViewById<LinearLayout>(R.id.lnrclasic)
        val lnrejarehi = fragmentKhodro.findViewById<LinearLayout>(R.id.lnrejarehei)
        val lnrsangin = fragmentKhodro.findViewById<LinearLayout>(R.id.lnrsangin)
        val lnragahi = fragmentKhodro.findViewById<LinearLayout>(R.id.lnrallkhodro)



        lnrsavary.setOnClickListener {

            Toast.makeText(context,"سواری", Toast.LENGTH_LONG).show()
        }

        lnrclasic.setOnClickListener {

            Toast.makeText(context,"کلاسیک", Toast.LENGTH_LONG).show()
        }

        lnrejarehi.setOnClickListener {

            Toast.makeText(context,"اجاره ای", Toast.LENGTH_LONG).show()
        }

        lnrsangin.setOnClickListener {

            Toast.makeText(context,"سنگین", Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های خودرو", Toast.LENGTH_LONG).show()
        }
        
        return fragmentKhodro
    }


}
