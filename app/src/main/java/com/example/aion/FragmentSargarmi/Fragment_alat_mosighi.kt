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
class Fragment_alat_mosighi : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentAlatMosighi = inflater.inflate(R.layout.fragment_alat_mosighi, container, false)
        var back=fragmentAlatMosighi.findViewById<ImageView>(R.id.arrow_fragment_alatMosighi)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }

        val lnrgitar = fragmentAlatMosighi.findViewById<LinearLayout>(R.id.lnrgitar)
        val lnrsazbadi = fragmentAlatMosighi.findViewById<LinearLayout>(R.id.lnrsazbadi)
        val lnrpiano = fragmentAlatMosighi.findViewById<LinearLayout>(R.id.lnrpiano)
        val lnrsonati = fragmentAlatMosighi.findViewById<LinearLayout>(R.id.lnrsonati)
        val lnrdram = fragmentAlatMosighi.findViewById<LinearLayout>(R.id.lnrdram)
        val lnrvialon = fragmentAlatMosighi.findViewById<LinearLayout>(R.id.lnrvialon)
        val lnragahi = fragmentAlatMosighi.findViewById<LinearLayout>(R.id.lnrallagahiAlatmosighi)



        lnrgitar.setOnClickListener {

            Toast.makeText(context,"گیتار,بیس و امپلیفایر", Toast.LENGTH_LONG).show()
        }

        lnrsazbadi.setOnClickListener {

            Toast.makeText(context,"سازهای بادی", Toast.LENGTH_LONG).show()
        }

        lnrpiano.setOnClickListener {

            Toast.makeText(context,"پیانو/کیبورد/آکاردئون", Toast.LENGTH_LONG).show()
        }

        lnrsonati.setOnClickListener {

            Toast.makeText(context,"سنتی", Toast.LENGTH_LONG).show()
        }

        lnrdram.setOnClickListener {

            Toast.makeText(context,"درام و پرکاشن", Toast.LENGTH_LONG).show()
        }
        lnrvialon.setOnClickListener {

            Toast.makeText(context,"ویولن", Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های آلات موسیقی", Toast.LENGTH_LONG).show()
        }

        return fragmentAlatMosighi
    }


}
