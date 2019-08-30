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
class Fragment_khadamat_amlak : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentKhadamatAmlak = inflater.inflate(R.layout.fragment_khadamat_amlak, container, false)
        var back=fragmentKhadamatAmlak.findViewById<ImageView>(R.id.arrow_fragment_khadamat_amlak)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val linajans = fragmentKhadamatAmlak.findViewById<LinearLayout>(R.id.lnrkhadamatAjansAmlak)
        val linmosharekat = fragmentKhadamatAmlak.findViewById<LinearLayout>(R.id.lnrkhadamatMosharekat)
        val linmali = fragmentKhadamatAmlak.findViewById<LinearLayout>(R.id.lnrkhadamatMali)
        val linpishfrosh = fragmentKhadamatAmlak.findViewById<LinearLayout>(R.id.lnrkhadamatPishfrosh)
        val linagahi = fragmentKhadamatAmlak.findViewById<LinearLayout>(R.id.lnrkhadamatamlakAllAgahi)

        linajans.setOnClickListener {

            Toast.makeText(context,"آژانس املاک", Toast.LENGTH_SHORT).show()
        }

        linmosharekat.setOnClickListener {

            Toast.makeText(context,"مشارکت در ساخت", Toast.LENGTH_SHORT).show()
        }
        linmali.setOnClickListener {

            Toast.makeText(context,"امور مالی", Toast.LENGTH_SHORT).show()
        }
        linpishfrosh.setOnClickListener {

            Toast.makeText(context,"پیش فروش", Toast.LENGTH_SHORT).show()
        }
        linagahi.setOnClickListener {

            Toast.makeText(context,"آگهی", Toast.LENGTH_SHORT).show()
        }


        return fragmentKhadamatAmlak
    }


}
