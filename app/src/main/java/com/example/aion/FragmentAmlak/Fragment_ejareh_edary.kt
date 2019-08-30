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
class Fragment_ejareh_edary : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentEjarehEdary = inflater.inflate(R.layout.fragment_ejareh_edary, container, false)

        var back=fragmentEjarehEdary.findViewById<ImageView>(R.id.arrow_fragment_ejare_edari)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val linDaftarKar = fragmentEjarehEdary.findViewById<LinearLayout>(R.id.lnrEjarehDaftarKar)
        val linMaghazeh = fragmentEjarehEdary.findViewById<LinearLayout>(R.id.lnrEjarehMaghazeh)
        val linsanaati = fragmentEjarehEdary.findViewById<LinearLayout>(R.id.lnrEjarehSanaati)
        val linagahi = fragmentEjarehEdary.findViewById<LinearLayout>(R.id.lnrEjarehAgahiEdary)

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


        return fragmentEjarehEdary
    }


}
