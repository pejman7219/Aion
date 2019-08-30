package com.example.aion.FragmentLavazemElectronic


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
class Fragment_rayaneh : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentRayaneh = inflater.inflate(R.layout.fragment_rayaneh, container, false)
        var back=fragmentRayaneh.findViewById<ImageView>(R.id.arrow_fragment_rayaneh)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val lnrrayanehhamrah = fragmentRayaneh.findViewById<LinearLayout>(R.id.lnrRayanehHamrah)
        val lnrrayanehromizi = fragmentRayaneh.findViewById<LinearLayout>(R.id.lnrRayanehRomizi)
        val lnrghtaat = fragmentRayaneh.findViewById<LinearLayout>(R.id.lnrGhataatVaLavazemJanebi)
        val lnrmodem = fragmentRayaneh.findViewById<LinearLayout>(R.id.lnrModemVaShabakeh)
        val lnrfax = fragmentRayaneh.findViewById<LinearLayout>(R.id.lnrFaxVaKopi)
        val lnragahi = fragmentRayaneh.findViewById<LinearLayout>(R.id.lnrallAgahiRayaneh)



        lnrrayanehhamrah.setOnClickListener {

            Toast.makeText(context,"رایانه همراه", Toast.LENGTH_LONG).show()
        }

        lnrrayanehromizi.setOnClickListener {

            Toast.makeText(context,"رایانه رو میزی", Toast.LENGTH_LONG).show()
        }

        lnrghtaat.setOnClickListener {

            Toast.makeText(context,"قطعات و لوازم جانبی", Toast.LENGTH_LONG).show()
        }

        lnrmodem.setOnClickListener {

            Toast.makeText(context,"مودم و تجهیزات شبکه", Toast.LENGTH_LONG).show()
        }

        lnrfax.setOnClickListener {

            Toast.makeText(context,"پرینتر", Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های رایانه", Toast.LENGTH_LONG).show()
        }



        return fragmentRayaneh
    }


}
