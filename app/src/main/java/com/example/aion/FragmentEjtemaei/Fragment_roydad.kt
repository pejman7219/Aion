package com.example.aion.FragmentEjtemaei


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
class Fragment_roydad : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentRoydad = inflater.inflate(R.layout.fragment_roydad, container, false)
        var back=fragmentRoydad.findViewById<ImageView>(R.id.arrow_fragment_roydad)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }

        val lnrharaj = fragmentRoydad.findViewById<LinearLayout>(R.id.lnrharaj)
        val lnrgerdehamai = fragmentRoydad.findViewById<LinearLayout>(R.id.lnrgerdehamaei)
        val lnrtartr = fragmentRoydad.findViewById<LinearLayout>(R.id.lnrmosighivatatr)
        val lnrvarzeshi = fragmentRoydad.findViewById<LinearLayout>(R.id.lnrvarzeshiroydad)
        val lnragahi = fragmentRoydad.findViewById<LinearLayout>(R.id.lnrallagahiRoydad)



        lnrharaj.setOnClickListener {

            Toast.makeText(context,"حراج", Toast.LENGTH_LONG).show()
        }

        lnrgerdehamai.setOnClickListener {

            Toast.makeText(context,"گردهمایی و همایش", Toast.LENGTH_LONG).show()
        }

        lnrtartr.setOnClickListener {

            Toast.makeText(context,"موسیقی و تئاتر", Toast.LENGTH_LONG).show()
        }

        lnrvarzeshi.setOnClickListener {

            Toast.makeText(context,"ورزشی", Toast.LENGTH_LONG).show()
        }


        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های رویداد", Toast.LENGTH_LONG).show()
        }

        return fragmentRoydad
    }


}
