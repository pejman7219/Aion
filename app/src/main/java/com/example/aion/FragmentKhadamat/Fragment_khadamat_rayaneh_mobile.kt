package com.example.aion.FragmentKhadamat


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
class Fragment_khadamat_rayaneh_mobile : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentKhadamatRayanehMobile = inflater.inflate(R.layout.fragment_khadamat_rayaneh_mobile, container, false)
        var back=fragmentKhadamatRayanehMobile.findViewById<ImageView>(R.id.arrow_fragment_khadamatRayane)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }

        val lnrfroshdamaneh = fragmentKhadamatRayanehMobile.findViewById<LinearLayout>(R.id.lnrForoshDamaneh)
        val lnrmizbany = fragmentKhadamatRayanehMobile.findViewById<LinearLayout>(R.id.lnrMizbaniVaTarahiSayt)
        val lnrkhadamatpahnayeband = fragmentKhadamatRayanehMobile.findViewById<LinearLayout>(R.id.lnrKhadamatPahnayeBand)
        val lnrkhadamatrayaneh = fragmentKhadamatRayanehMobile.findViewById<LinearLayout>(R.id.lnrKhadamatnarmAfzarComputer)
        val lnrtamirat = fragmentKhadamatRayanehMobile.findViewById<LinearLayout>(R.id.lnrTamirNarmafzar)
        val lnragahi = fragmentKhadamatRayanehMobile.findViewById<LinearLayout>(R.id.lnrallagahikhadamatRayaneh)




        lnrfroshdamaneh.setOnClickListener {

            Toast.makeText(context,"فروش دامنه و سایت", Toast.LENGTH_LONG).show()
        }

        lnrmizbany.setOnClickListener {

            Toast.makeText(context,"میزبانی و طراحی سایت", Toast.LENGTH_LONG).show()
        }

        lnrkhadamatpahnayeband.setOnClickListener {

            Toast.makeText(context,"خدمات پهنای باند اینترنت", Toast.LENGTH_LONG).show()
        }

        lnrkhadamatrayaneh.setOnClickListener {

            Toast.makeText(context,"خدمات نرم افزار و سخت افزار کامپیوتر", Toast.LENGTH_LONG).show()
        }

        lnrtamirat.setOnClickListener {

            Toast.makeText(context,"تهمیرات نرم افزار و سخت افزار گوشی موبایل", Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های خدمات رایانه و موبایل", Toast.LENGTH_LONG).show()
        }

        return fragmentKhadamatRayanehMobile
    }


}
