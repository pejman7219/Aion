package com.example.aion.Fragment_category


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.aion.FragmentAmlak.Fragment_Amlak
import com.example.aion.FragmentEjtemaei.Fragment_ejtemaei
import com.example.aion.FragmentEstekhdam.Fragment_estekhdam_karyabi
import com.example.aion.FragmentKasbOkar.Fragment_kasb_kar
import com.example.aion.FragmentKhadamat.Fragment_khadamat
import com.example.aion.FragmentLavazemElectronic.Fragment_lavazem_electronic
import com.example.aion.FragmentMarbutBeKhaneh.FragmentMarbutBeKhaneh
import com.example.aion.FragmentSargarmi.Fragment_sargarmi_fraghat
import com.example.aion.FragmentVasayelNaghlieh.FragmentVasayelNaghlieh
import com.example.aion.FragmentVasayelShakhsi.Fragment_vasayel_shakhsi
import com.example.aion.R



class Fragment_categury : Fragment() {


       override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentCategury = inflater.inflate(com.example.aion.R.layout.fragment_categury, container, false)

        val linrAmlak = fragmentCategury.findViewById<LinearLayout>(com.example.aion.R.id.lnrAmlak)
        val linrvasayelnaghlieh = fragmentCategury.findViewById<LinearLayout>(com.example.aion.R.id.lnrvasayelnaghlieh)
        val linrlavazemElectronic = fragmentCategury.findViewById<LinearLayout>(com.example.aion.R.id.lnrLavazemElectronic)
        val lnrmarbotbrkhaneh = fragmentCategury.findViewById<LinearLayout>(R.id.lnrMarbutBeKhaneh)
        val lnrkhadamat = fragmentCategury.findViewById<LinearLayout>(R.id.lnrKhadamat)
        val lnrvasayelshakhsi = fragmentCategury.findViewById<LinearLayout>(R.id.lnrVasayelShakhsi)
        val lnrsargarmivafraghat = fragmentCategury.findViewById<LinearLayout>(R.id.lnrSargarmivaFraghat)
        val lnrejtemaei = fragmentCategury.findViewById<LinearLayout>(R.id.lnrejtemaei)
        val lnrkasbokar = fragmentCategury.findViewById<LinearLayout>(R.id.lnrkasbokar)
        val lnrestekhdam = fragmentCategury.findViewById<LinearLayout>(R.id.lnrestekhdam)

           


           linrAmlak.setOnClickListener {

               val fragment = Fragment_Amlak()
               val fragmentManager = activity!!.getSupportFragmentManager()
               val fragmentTransaction  = fragmentManager.beginTransaction()
               fragmentTransaction.replace(R.id.framcenter, fragment)
               fragmentTransaction.addToBackStack(null)
               fragmentTransaction.commit()

           }

           linrvasayelnaghlieh.setOnClickListener {

               val fragment = FragmentVasayelNaghlieh()
               val fragmentManager = activity!!.getSupportFragmentManager()
               val fragmentTransaction  = fragmentManager.beginTransaction()
               fragmentTransaction.replace(R.id.framcenter, fragment)
               fragmentTransaction.addToBackStack(null)
               fragmentTransaction.commit()

           }

           linrlavazemElectronic.setOnClickListener {

               val fragment = Fragment_lavazem_electronic()
               val fragmentManager = activity!!.getSupportFragmentManager()
               val fragmentTransaction  = fragmentManager.beginTransaction()
               fragmentTransaction.replace(R.id.framcenter, fragment)
               fragmentTransaction.addToBackStack(null)
               fragmentTransaction.commit()

           }

           lnrmarbotbrkhaneh.setOnClickListener {

               val fragment = FragmentMarbutBeKhaneh()
               val fragmentManager = activity!!.getSupportFragmentManager()
               val fragmentTransaction  = fragmentManager.beginTransaction()
               fragmentTransaction.replace(R.id.framcenter, fragment)
               fragmentTransaction.addToBackStack(null)
               fragmentTransaction.commit()

           }

           lnrkhadamat.setOnClickListener {

               val fragment = Fragment_khadamat()
               val fragmentManager = activity!!.getSupportFragmentManager()
               val fragmentTransaction  = fragmentManager.beginTransaction()
               fragmentTransaction.replace(R.id.framcenter, fragment)
               fragmentTransaction.addToBackStack(null)
               fragmentTransaction.commit()

           }

           lnrvasayelshakhsi.setOnClickListener {

               val fragment = Fragment_vasayel_shakhsi()
               val fragmentManager = activity!!.getSupportFragmentManager()
               val fragmentTransaction  = fragmentManager.beginTransaction()
               fragmentTransaction.replace(R.id.framcenter, fragment)
               fragmentTransaction.addToBackStack(null)
               fragmentTransaction.commit()

           }

           lnrsargarmivafraghat.setOnClickListener {

               val fragment = Fragment_sargarmi_fraghat()
               val fragmentManager = activity!!.getSupportFragmentManager()
               val fragmentTransaction  = fragmentManager.beginTransaction()
               fragmentTransaction.replace(R.id.framcenter, fragment)
               fragmentTransaction.addToBackStack(null)
               fragmentTransaction.commit()

           }

           lnrejtemaei.setOnClickListener {

               val fragment = Fragment_ejtemaei()
               val fragmentManager = activity!!.getSupportFragmentManager()
               val fragmentTransaction  = fragmentManager.beginTransaction()
               fragmentTransaction.replace(R.id.framcenter, fragment)
               fragmentTransaction.addToBackStack(null)
               fragmentTransaction.commit()

           }

           lnrkasbokar.setOnClickListener {

               val fragment = Fragment_kasb_kar()
               val fragmentManager = activity!!.getSupportFragmentManager()
               val fragmentTransaction  = fragmentManager.beginTransaction()
               fragmentTransaction.replace(R.id.framcenter, fragment)
               fragmentTransaction.addToBackStack(null)
               fragmentTransaction.commit()

           }

           lnrestekhdam.setOnClickListener {

               val fragment = Fragment_estekhdam_karyabi()
               val fragmentManager = activity!!.getSupportFragmentManager()
               val fragmentTransaction  = fragmentManager.beginTransaction()
               fragmentTransaction.replace(R.id.framcenter, fragment)
               fragmentTransaction.addToBackStack(null)
               fragmentTransaction.commit()

           }

        return fragmentCategury
    }


}
