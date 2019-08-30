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
class Fragment_blit : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentBlit = inflater.inflate(R.layout.fragment_blit, container, false)
        var back=fragmentBlit.findViewById<ImageView>(R.id.arrow_blit)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }

        val lnrkonsert = fragmentBlit.findViewById<LinearLayout>(R.id.lnrkonsert)
        val lnrtatr = fragmentBlit.findViewById<LinearLayout>(R.id.lnrtaatrvasinama)
        val lnrkartehadieh = fragmentBlit.findViewById<LinearLayout>(R.id.lnrkarthadiehvatakhfif)
        val lnramaken = fragmentBlit.findViewById<LinearLayout>(R.id.lnramakenvamosabeghatvarzeshi)
        val lnrvarzesh = fragmentBlit.findViewById<LinearLayout>(R.id.lnrvarzeshi1)
        val lnrotobos = fragmentBlit.findViewById<LinearLayout>(R.id.lnrotobos)
        val lnragahi = fragmentBlit.findViewById<LinearLayout>(R.id.lnrallagahiBlit)



        lnrkonsert.setOnClickListener {

            Toast.makeText(context,"کنسرت", Toast.LENGTH_LONG).show()
        }

        lnrtatr.setOnClickListener {

            Toast.makeText(context,"تئاتر و سینما", Toast.LENGTH_LONG).show()
        }

        lnrkartehadieh.setOnClickListener {

            Toast.makeText(context,"کارت هدیه و تخفیف", Toast.LENGTH_LONG).show()
        }

        lnramaken.setOnClickListener {

            Toast.makeText(context,"اماکن و مسابقات ورزشی", Toast.LENGTH_LONG).show()
        }

        lnrvarzesh.setOnClickListener {

            Toast.makeText(context,"ورزشی", Toast.LENGTH_LONG).show()
        }
        lnrotobos.setOnClickListener {

            Toast.makeText(context,"اتوبوس,مترو و قطار", Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های بلیط", Toast.LENGTH_LONG).show()
        }

        return fragmentBlit
    }


}
