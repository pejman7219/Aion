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


class Fragment_gomshodeha : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentGomshodeha = inflater.inflate(R.layout.fragment_gomshodeha, container, false)
        var back=fragmentGomshodeha.findViewById<ImageView>(R.id.arrow_fragment_gomshodeha)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val lnrheyvanat = fragmentGomshodeha.findViewById<LinearLayout>(R.id.lnrheyvanatgomshodehha)
        val lnrashia = fragmentGomshodeha.findViewById<LinearLayout>(R.id.lnrashia)
        val lnragahi = fragmentGomshodeha.findViewById<LinearLayout>(R.id.lnrallagahiGomshodehha)

        lnrheyvanat.setOnClickListener {

            Toast.makeText(context,"حیوانات", Toast.LENGTH_LONG).show()
        }
        lnrashia.setOnClickListener {

            Toast.makeText(context,"اشیا", Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های گم شده ها", Toast.LENGTH_LONG).show()
        }

        return fragmentGomshodeha
    }


}
