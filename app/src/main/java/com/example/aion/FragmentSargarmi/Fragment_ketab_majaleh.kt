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


class Fragment_ketab_majaleh : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentKetabMajaleh = inflater.inflate(R.layout.fragment_ketab_majaleh, container, false)
        var back=fragmentKetabMajaleh.findViewById<ImageView>(R.id.arrow_fragment_ketab_majale)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }

        val lnramozeshi = fragmentKetabMajaleh.findViewById<LinearLayout>(R.id.lnrAmozeshi)
        val lnradabi = fragmentKetabMajaleh.findViewById<LinearLayout>(R.id.lnrAdabi)
        val lnrtarikhi = fragmentKetabMajaleh.findViewById<LinearLayout>(R.id.lnrtarikhi)
        val lnrmazhabi = fragmentKetabMajaleh.findViewById<LinearLayout>(R.id.lnrmazhabi)
        val lnrmajalat = fragmentKetabMajaleh.findViewById<LinearLayout>(R.id.lnrmajalat)
        val lnragahi = fragmentKetabMajaleh.findViewById<LinearLayout>(R.id.lnrallagahiKetapVaMajaleh)



        lnramozeshi.setOnClickListener {

            Toast.makeText(context,"آموزشی", Toast.LENGTH_LONG).show()
        }

        lnradabi.setOnClickListener {

            Toast.makeText(context,"ادبی", Toast.LENGTH_LONG).show()
        }

        lnrtarikhi.setOnClickListener {

            Toast.makeText(context,"تاریخی", Toast.LENGTH_LONG).show()
        }

        lnrmazhabi.setOnClickListener {

            Toast.makeText(context,"مذهبی", Toast.LENGTH_LONG).show()
        }

        lnrmajalat.setOnClickListener {

            Toast.makeText(context,"مجلات", Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های کتاب و مجله", Toast.LENGTH_LONG).show()
        }

        return fragmentKetabMajaleh
    }


}
