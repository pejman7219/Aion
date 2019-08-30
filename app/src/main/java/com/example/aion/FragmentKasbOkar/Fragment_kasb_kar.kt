package com.example.aion.FragmentKasbOkar


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
class Fragment_kasb_kar : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentKasbKar = inflater.inflate(R.layout.fragment_kasb_kar, container, false)
        var back=fragmentKasbKar.findViewById<ImageView>(R.id.arrow_fragment_kasb_kar)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val lnrtajhizat = fragmentKasbKar.findViewById<LinearLayout>(R.id.lnrtajhizatvamashinalat)
        val lnromdehforoshi = fragmentKasbKar.findViewById<LinearLayout>(R.id.lnromdehforoshi)
        val lnragahi = fragmentKasbKar.findViewById<LinearLayout>(R.id.lnrAllAgahikasbokar)
        lnrtajhizat.setOnClickListener {

            val fragment = Fragment_tajhizat_mashinalat()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        lnromdehforoshi.setOnClickListener {

            Toast.makeText(context,"عمده فروشی", Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های برای کسب کار", Toast.LENGTH_LONG).show()
        }

        return fragmentKasbKar
    }


}
