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


class Fragment_sakhteman_hayat : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentSakhtemanHayat =
            inflater.inflate(R.layout.fragment_sakhteman_hayat, container, false)
        var back=fragmentSakhtemanHayat.findViewById<ImageView>(R.id.arrow_fragment_sakhteman_hayat)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val lnrservisbehdashti =
            fragmentSakhtemanHayat.findViewById<LinearLayout>(R.id.lnrServisBehdashti)
        val lnrsystemGarmayesh =
            fragmentSakhtemanHayat.findViewById<LinearLayout>(R.id.lnrsystemGarmayesh)
        val lnrAshpazkhaneh =
            fragmentSakhtemanHayat.findViewById<LinearLayout>(R.id.lnrAshpazkhaneh)
        val lnrhayatVaEyvan =
            fragmentSakhtemanHayat.findViewById<LinearLayout>(R.id.lnrHayatVaEyvan)
        val lnrabzarBaghbani =
            fragmentSakhtemanHayat.findViewById<LinearLayout>(R.id.lnrAbzarBaghbani)
        val lnragahi =
            fragmentSakhtemanHayat.findViewById<LinearLayout>(R.id.lnrallagahiSakhtemanVaHayat)

        lnrservisbehdashti.setOnClickListener {

            Toast.makeText(context, "سرویس بهداشتی و سونا", Toast.LENGTH_LONG).show()
        }

        lnrsystemGarmayesh.setOnClickListener {

            Toast.makeText(context, "سیستم گرمایشی و سرمایشی و گاز", Toast.LENGTH_LONG).show()
        }

        lnrAshpazkhaneh.setOnClickListener {

            Toast.makeText(context, "آشپزخانه", Toast.LENGTH_LONG).show()
        }

        lnrhayatVaEyvan.setOnClickListener {

            Toast.makeText(context, "حیاط و ایوان", Toast.LENGTH_LONG).show()
        }
        lnrabzarBaghbani.setOnClickListener {

            Toast.makeText(context, "ابزار باغبانی", Toast.LENGTH_LONG).show()
        }
        lnragahi.setOnClickListener {

            Toast.makeText(context, "همه آگهی های ساختمان و حیاط", Toast.LENGTH_LONG).show()

        }

        return fragmentSakhtemanHayat
    }
}


