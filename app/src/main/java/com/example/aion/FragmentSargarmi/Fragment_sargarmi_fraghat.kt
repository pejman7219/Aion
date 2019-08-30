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
class Fragment_sargarmi_fraghat : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentSargarmiFraghat = inflater.inflate(R.layout.fragment_sargarmi_fraghat, container, false)

        val blit = fragmentSargarmiFraghat.findViewById<LinearLayout>(R.id.lnrblit)
        val tor = fragmentSargarmiFraghat.findViewById<LinearLayout>(R.id.lnrtor)
        val ketab = fragmentSargarmiFraghat.findViewById<LinearLayout>(R.id.lnrketab)
        val docharkheh = fragmentSargarmiFraghat.findViewById<LinearLayout>(R.id.lnrdocharkheh)
        val heyvanat = fragmentSargarmiFraghat.findViewById<LinearLayout>(R.id.lnrheyvanat)
        val koloksion = fragmentSargarmiFraghat.findViewById<LinearLayout>(R.id.lnrkolecsioni)
        val alatmosighi = fragmentSargarmiFraghat.findViewById<LinearLayout>(R.id.lnralatmosighi)
        val varzesh = fragmentSargarmiFraghat.findViewById<LinearLayout>(R.id.lnrvarzeshvatanasobandam)
        val asbabbazi = fragmentSargarmiFraghat.findViewById<LinearLayout>(R.id.asbabbazi)
        val agahi = fragmentSargarmiFraghat.findViewById<LinearLayout>(R.id.lnrAllAgahisargarmivafarghat)
        val fragmentTransaction  = fragmentManager!!.beginTransaction()
        fragmentTransaction.addToBackStack(null)

        blit.setOnClickListener {

            val fragment = Fragment_blit()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        tor.setOnClickListener {

            Toast.makeText(context,"تور و چارتر", Toast.LENGTH_LONG).show()
        }

        ketab.setOnClickListener {

            val fragment = Fragment_ketab_majaleh()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        docharkheh.setOnClickListener {

            Toast.makeText(context,"دوچرخه/اسکیت/اسکوتر", Toast.LENGTH_LONG).show()
        }

        heyvanat.setOnClickListener {

            val fragment = Fragment_heyvanat()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        koloksion.setOnClickListener {

            val fragment = Fragment_koloksion_sargarmi()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        alatmosighi.setOnClickListener {

            val fragment = Fragment_alat_mosighi()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        varzesh.setOnClickListener {

            val fragment = Fragment_varzesh_tanasobandam()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        asbabbazi.setOnClickListener {

            Toast.makeText(context,"اسباب بازی", Toast.LENGTH_LONG).show()
        }

        agahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های سرگرمی و فراغت", Toast.LENGTH_LONG).show()
        }


        return fragmentSargarmiFraghat
    }


}
