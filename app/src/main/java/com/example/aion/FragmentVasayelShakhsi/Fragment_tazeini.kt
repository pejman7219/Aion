package com.example.aion.FragmentVasayelShakhsi


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
class Fragment_tazeini : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentTazeini = inflater.inflate(R.layout.fragment_tazeini, container, false)
        var back=fragmentTazeini.findViewById<ImageView>(R.id.arrow_fragment_tazeini)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val lnrsaat = fragmentTazeini.findViewById<LinearLayout>(R.id.lnrsaat)
        val lnrjavaherat = fragmentTazeini.findViewById<LinearLayout>(R.id.lnrjavaherat)
        val lnrbadalijat = fragmentTazeini.findViewById<LinearLayout>(R.id.lnrbadalijat)
        val lnragahi = fragmentTazeini.findViewById<LinearLayout>(R.id.lnrallagahitazeini)



        lnrsaat.setOnClickListener {

            Toast.makeText(context,"ساعت", Toast.LENGTH_LONG).show()
        }

        lnrjavaherat.setOnClickListener {

            Toast.makeText(context,"جواهرات", Toast.LENGTH_LONG).show()
        }

        lnrbadalijat.setOnClickListener {

            Toast.makeText(context,"بدلیجات", Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های تزیئنی", Toast.LENGTH_LONG).show()
        }

        return fragmentTazeini
    }


}
