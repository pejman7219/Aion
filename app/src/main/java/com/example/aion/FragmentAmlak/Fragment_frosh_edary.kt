package com.example.aion.FragmentAmlak


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
class Fragment_frosh_edary : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentFroshEdary = inflater.inflate(R.layout.fragment_frosh_edary, container, false)
        var back=fragmentFroshEdary.findViewById<ImageView>(R.id.arrow_fragment_frosh_edari)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val linDaftarKar = fragmentFroshEdary.findViewById<LinearLayout>(R.id.lnrDaftarKar)
        val linMaghazeh = fragmentFroshEdary.findViewById<LinearLayout>(R.id.lnrMaghazeh)
        val linsanaati = fragmentFroshEdary.findViewById<LinearLayout>(R.id.lnrSanaati)
        val linagahi = fragmentFroshEdary.findViewById<LinearLayout>(R.id.lnrAgahiEdary)

        linDaftarKar.setOnClickListener {

            Toast.makeText(context,"دفترکار", Toast.LENGTH_SHORT).show()
        }

        linMaghazeh.setOnClickListener {

            Toast.makeText(context,"مغازه", Toast.LENGTH_SHORT).show()
        }
        linsanaati.setOnClickListener {

            Toast.makeText(context,"صنعتی", Toast.LENGTH_SHORT).show()
        }
        linagahi.setOnClickListener {

            Toast.makeText(context,"آگهی", Toast.LENGTH_SHORT).show()
        }

        return fragmentFroshEdary
    }


}
