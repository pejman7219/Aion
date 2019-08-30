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
class Fragment_vasayel_tazinat : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentVasayelTazinat = inflater.inflate(R.layout.fragment_vasayel_tazinat, container, false)
        var back=fragmentVasayelTazinat.findViewById<ImageView>(R.id.arrow_fragment_vasayel_tazinat)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }

        val lnrasarhonary = fragmentVasayelTazinat.findViewById<LinearLayout>(R.id.lnrAsarHonary)
        val lnrlavazemroshanaei = fragmentVasayelTazinat.findViewById<LinearLayout>(R.id.lnrLavazemRoshanaei)
        val lnrmizvasandali = fragmentVasayelTazinat.findViewById<LinearLayout>(R.id.lnrMizVaSandali)
        val lnrfarshvaglim = fragmentVasayelTazinat.findViewById<LinearLayout>(R.id.lnrFarshVaGlim)
        val lnrkomodVaBofeh = fragmentVasayelTazinat.findViewById<LinearLayout>(R.id.lnrKomodVaBufeh)
        val lnrpardehvaromizi = fragmentVasayelTazinat.findViewById<LinearLayout>(R.id.lnrPardehVaRumizi)
        val lnrtakhtVaotagh = fragmentVasayelTazinat.findViewById<LinearLayout>(R.id.lnrTakhtVaOtagh)
        val lnrmoblVasandali = fragmentVasayelTazinat.findViewById<LinearLayout>(R.id.lnrMoblemanVaSandali)
        val lnrmizTV = fragmentVasayelTazinat.findViewById<LinearLayout>(R.id.lnrMizTV)
        val lnragahi = fragmentVasayelTazinat.findViewById<LinearLayout>(R.id.lnrallagahiVasayelKhaneh)



        lnrasarhonary.setOnClickListener {

            Toast.makeText(context,"تزئینی و آثار هنری", Toast.LENGTH_LONG).show()
        }

        lnrlavazemroshanaei.setOnClickListener {

            Toast.makeText(context,"لوازم روشنایی", Toast.LENGTH_LONG).show()
        }

        lnrmizvasandali.setOnClickListener {

            Toast.makeText(context,"میز و صندلی", Toast.LENGTH_LONG).show()
        }

        lnrfarshvaglim.setOnClickListener {

            Toast.makeText(context,"فرش و گلیم", Toast.LENGTH_LONG).show()
        }

        lnrkomodVaBofeh.setOnClickListener {

            Toast.makeText(context,"کمد و بوفه", Toast.LENGTH_LONG).show()
        }
        lnrpardehvaromizi.setOnClickListener {

            Toast.makeText(context,"پرده و رومیزی", Toast.LENGTH_LONG).show()
        }
        lnrtakhtVaotagh.setOnClickListener {

            Toast.makeText(context,"تخت و اتاق خواب", Toast.LENGTH_LONG).show()
        }

        lnrmoblVasandali.setOnClickListener {

            Toast.makeText(context,"مبلمان و صندلی راحتی", Toast.LENGTH_LONG).show()
        }
        lnrmizTV.setOnClickListener {

            Toast.makeText(context,"میز تلویزیون و وسایل سیستم پخش", Toast.LENGTH_LONG).show()
        }
        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های وسایل و تزئینات خانه", Toast.LENGTH_LONG).show()
        }



        return fragmentVasayelTazinat
    }


}
