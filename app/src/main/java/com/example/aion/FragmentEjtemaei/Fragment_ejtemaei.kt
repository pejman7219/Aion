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

/**
 * A simple [Fragment] subclass.
 */
class Fragment_ejtemaei : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentEjtemaei = inflater.inflate(R.layout.fragment_ejtemaei, container, false)
        var back=fragmentEjtemaei.findViewById<ImageView>(R.id.arrow_ejtemaei)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val lnrroydad = fragmentEjtemaei.findViewById<LinearLayout>(R.id.lnrroydad)
        val lnrdavtalabaneh = fragmentEjtemaei.findViewById<LinearLayout>(R.id.lnrdavtalabaneh)
        val lnrgomshodehha = fragmentEjtemaei.findViewById<LinearLayout>(R.id.lnrgomshodehha)
        val lnragahi = fragmentEjtemaei.findViewById<LinearLayout>(R.id.lnrAllAgahiejtemaei)

        lnrroydad.setOnClickListener {

            val fragment = Fragment_roydad()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        lnrdavtalabaneh.setOnClickListener {

            val fragment = Fragment_davtalabaneh()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        lnrgomshodehha.setOnClickListener {

            val fragment = Fragment_gomshodeha()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های اجتماعی", Toast.LENGTH_LONG).show()
        }

        return fragmentEjtemaei
    }


}
