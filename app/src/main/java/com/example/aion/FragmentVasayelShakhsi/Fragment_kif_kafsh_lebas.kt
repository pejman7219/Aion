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
class Fragment_kif_kafsh_lebas : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentKifKafshLebas = inflater.inflate(R.layout.fragment_kif_kafsh_lebas, container, false)
        var back=fragmentKifKafshLebas.findViewById<ImageView>(R.id.arrow_fragment_kif_kafsh)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val lnrkafsh = fragmentKifKafshLebas.findViewById<LinearLayout>(R.id.lnrkifokafsh)
        val lnrlebas = fragmentKifKafshLebas.findViewById<LinearLayout>(R.id.lnrlebas)
        val lnragahi = fragmentKifKafshLebas.findViewById<LinearLayout>(R.id.lnrallagahikifokafsholebas)



        lnrkafsh.setOnClickListener {

            Toast.makeText(context,"کیف/کفش/کمربند", Toast.LENGTH_LONG).show()
        }

        lnrlebas.setOnClickListener {

            Toast.makeText(context,"لباس", Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های کیف,کفش و لباس", Toast.LENGTH_LONG).show()
        }

        return fragmentKifKafshLebas
    }


}
