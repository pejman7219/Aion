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
class Fragment_vasayel_ashpazkhaneh : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentVasayelAshpazkhaneh = inflater.inflate(R.layout.fragment_vasayel_ashpazkhaneh, container, false)
        var back=fragmentVasayelAshpazkhaneh.findViewById<ImageView>(R.id.fragment_vasayel_ashpazkhan)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val lnrmashinzarfshoei = fragmentVasayelAshpazkhaneh.findViewById<LinearLayout>(R.id.lnrMashinZarfshoei)
        val lnryakhchal = fragmentVasayelAshpazkhaneh.findViewById<LinearLayout>(R.id.lnryakhchal)
        val lnrghazakhori = fragmentVasayelAshpazkhaneh.findViewById<LinearLayout>(R.id.lnrghazakhori)
        val lnrmacrowave = fragmentVasayelAshpazkhaneh.findViewById<LinearLayout>(R.id.lnrMakrowave)
        val lnrmashinLebasshoei = fragmentVasayelAshpazkhaneh.findViewById<LinearLayout>(R.id.lnrMashinLebasshoei)
        val lnragahi = fragmentVasayelAshpazkhaneh.findViewById<LinearLayout>(R.id.lnrallagahiVasayelAshpazkhaneh)



        lnrmashinzarfshoei.setOnClickListener {

            Toast.makeText(context,"ماشین ظرفشویی", Toast.LENGTH_LONG).show()
        }

        lnryakhchal.setOnClickListener {

            Toast.makeText(context,"یخچال و فریزر", Toast.LENGTH_LONG).show()
        }

        lnrghazakhori.setOnClickListener {

            Toast.makeText(context,"وسایل آشپزخانه و غذاخوری", Toast.LENGTH_LONG).show()
        }

        lnrmacrowave.setOnClickListener {

            Toast.makeText(context,"ماکروویو و گاز", Toast.LENGTH_LONG).show()
        }

        lnrmashinLebasshoei.setOnClickListener {

            Toast.makeText(context,"ماشین لباسشویی و خشک کننده", Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های وسایل آشپزخانه", Toast.LENGTH_LONG).show()
        }


        
        return fragmentVasayelAshpazkhaneh
    }


}
