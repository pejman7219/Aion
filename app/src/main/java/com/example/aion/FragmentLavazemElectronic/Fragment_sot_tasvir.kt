package com.example.aion.FragmentLavazemElectronic


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
class Fragment_sot_tasvir : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentSotTasvir = inflater.inflate(R.layout.fragment_sot_tasvir, container, false)
        var back=fragmentSotTasvir.findViewById<ImageView>(R.id.arrow_fragment_sot_tasvir)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val lnrfilm = fragmentSotTasvir.findViewById<LinearLayout>(R.id.lnrfilmVaMosighi)
        val lnrdorbin = fragmentSotTasvir.findViewById<LinearLayout>(R.id.lnrDorbin)
        val lnrpakhshkonandeh = fragmentSotTasvir.findViewById<LinearLayout>(R.id.lnrPakhshkonandehHamrah)
        val lnrsystem = fragmentSotTasvir.findViewById<LinearLayout>(R.id.lnrSystemKhanrgi)
        val lnrdvd = fragmentSotTasvir.findViewById<LinearLayout>(R.id.lnrDvD)
        val lnrprojector = fragmentSotTasvir.findViewById<LinearLayout>(R.id.lnrTvPerjector)
        val lnrdorbinmadarbasteh = fragmentSotTasvir.findViewById<LinearLayout>(R.id.lnrdorbinMadarbasteh)
        val lnragahi = fragmentSotTasvir.findViewById<LinearLayout>(R.id.lnrallagahiSotiVaTasviry)



        lnrfilm.setOnClickListener {

            Toast.makeText(context,"فیلم و موسیقی", Toast.LENGTH_LONG).show()
        }

        lnrdorbin.setOnClickListener {

            Toast.makeText(context,"دوربین عکاسی و فیلمبرداری", Toast.LENGTH_LONG).show()
        }

        lnrpakhshkonandeh.setOnClickListener {

            Toast.makeText(context,"پخش کننده همراه", Toast.LENGTH_LONG).show()
        }

        lnrsystem.setOnClickListener {

            Toast.makeText(context,"سیستم صوتی خانگی", Toast.LENGTH_LONG).show()
        }

        lnrdvd.setOnClickListener {

            Toast.makeText(context,"ویدیو و پخش کننده DVD", Toast.LENGTH_LONG).show()
        }
        lnrprojector.setOnClickListener {

            Toast.makeText(context,"تلویزیون و پروژکتور", Toast.LENGTH_LONG).show()
        }
        lnrdorbinmadarbasteh.setOnClickListener {

            Toast.makeText(context,"دوربین مدار بسته", Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های صوتی و تصویری", Toast.LENGTH_LONG).show()
        }
        
        return fragmentSotTasvir
    }


}
