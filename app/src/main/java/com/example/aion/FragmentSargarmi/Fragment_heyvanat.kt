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
class Fragment_heyvanat : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentHeyvanat = inflater.inflate(R.layout.fragment_heyvanat, container, false)
        var back=fragmentHeyvanat.findViewById<ImageView>(R.id.fragment_arrow_heyvanat)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }

        val lnrcat = fragmentHeyvanat.findViewById<LinearLayout>(R.id.lnrcat)
        val lnrmuse = fragmentHeyvanat.findViewById<LinearLayout>(R.id.lnrmuse)
        val lnrkhazandeh = fragmentHeyvanat.findViewById<LinearLayout>(R.id.lnrkhazandeh)
        val lnrbired = fragmentHeyvanat.findViewById<LinearLayout>(R.id.lnrbird)
        val lnrfish = fragmentHeyvanat.findViewById<LinearLayout>(R.id.lnrfish)
        val lnrlavazemjanebi = fragmentHeyvanat.findViewById<LinearLayout>(R.id.lnrlavazemjanebiheyvanat)
        val lnrheyvanatMazrae = fragmentHeyvanat.findViewById<LinearLayout>(R.id.lnrheyvanatmazrae)
        val lnrdog = fragmentHeyvanat.findViewById<LinearLayout>(R.id.lnrdog)
        val lnragahi = fragmentHeyvanat.findViewById<LinearLayout>(R.id.lnrallagahiheyvanat)



        lnrcat.setOnClickListener {

            Toast.makeText(context,"گربه", Toast.LENGTH_LONG).show()
        }

        lnrmuse.setOnClickListener {

            Toast.makeText(context,"موش و خرگوش", Toast.LENGTH_LONG).show()
        }

        lnrkhazandeh.setOnClickListener {

            Toast.makeText(context,"خزنده", Toast.LENGTH_LONG).show()
        }

        lnrbired.setOnClickListener {

            Toast.makeText(context,"پرنده", Toast.LENGTH_LONG).show()
        }

        lnrfish.setOnClickListener {

            Toast.makeText(context,"ماهی", Toast.LENGTH_LONG).show()
        }
        lnrlavazemjanebi.setOnClickListener {

            Toast.makeText(context,"لوازم جانبی", Toast.LENGTH_LONG).show()
        }
        lnrheyvanatMazrae.setOnClickListener {

            Toast.makeText(context,"حیوانات مزرعه", Toast.LENGTH_LONG).show()
        }

        lnrdog.setOnClickListener {

            Toast.makeText(context,"سگ", Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های حیوانات", Toast.LENGTH_LONG).show()
        }

        return fragmentHeyvanat
    }


}
