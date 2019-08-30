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
class Fragment_varzesh_tanasobandam : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentVarzeshTanasobandam = inflater.inflate(R.layout.fragment_varzesh_tanasobandam, container, false)
        var back=fragmentVarzeshTanasobandam.findViewById<ImageView>(R.id.arrow_fragment_varzesh_tanasbadam)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }

        val lnrvarzeshtopi = fragmentVarzeshTanasobandam.findViewById<LinearLayout>(R.id.lnrvarzeshhaytopi)
        val lnrkohnavardi = fragmentVarzeshTanasobandam.findViewById<LinearLayout>(R.id.lnrkohnavardi)
        val lnrghavasi = fragmentVarzeshTanasobandam.findViewById<LinearLayout>(R.id.lnrghavasi)
        val lnrmahigiri = fragmentVarzeshTanasobandam.findViewById<LinearLayout>(R.id.lnrmahigiri)
        val lnrtajhizat = fragmentVarzeshTanasobandam.findViewById<LinearLayout>(R.id.lnrtajhizatvarzeshi)
        val lnrvarzeshzemestani = fragmentVarzeshTanasobandam.findViewById<LinearLayout>(R.id.lnrvarzeshhayezemestani)
        val lnrasb = fragmentVarzeshTanasobandam.findViewById<LinearLayout>(R.id.lnrasb)
        val lnragahi = fragmentVarzeshTanasobandam.findViewById<LinearLayout>(R.id.lnrallagahivarzesh)




        lnrvarzeshtopi.setOnClickListener {

            Toast.makeText(context,"ورزش های توپی", Toast.LENGTH_LONG).show()
        }

        lnrkohnavardi.setOnClickListener {

            Toast.makeText(context,"کوهنوردی و کمپینگ", Toast.LENGTH_LONG).show()
        }

        lnrghavasi.setOnClickListener {

            Toast.makeText(context,"غواصی و ورزش های آبی", Toast.LENGTH_LONG).show()
        }

        lnrmahigiri.setOnClickListener {

            Toast.makeText(context,"ماهیگیری", Toast.LENGTH_LONG).show()
        }

        lnrtajhizat.setOnClickListener {

            Toast.makeText(context,"تجهیزات ورزشی", Toast.LENGTH_LONG).show()
        }
        lnrvarzeshzemestani.setOnClickListener {

            Toast.makeText(context,"ورزش های زمستانی", Toast.LENGTH_LONG).show()
        }

        lnrasb.setOnClickListener {

            Toast.makeText(context,"اسب و تجهیزات اسب سواری", Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های ورزش و تناسب اندام", Toast.LENGTH_LONG).show()
        }
        
        return fragmentVarzeshTanasobandam
    }


}
