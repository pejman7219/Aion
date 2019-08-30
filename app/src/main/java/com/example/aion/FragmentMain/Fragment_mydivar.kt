package com.example.aion.FragmentMain


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import com.example.aion.R


class Fragment_mydivar : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view:View= inflater.inflate(R.layout.fragment_mydivar, container, false)
        val LL_agahiman=view.findViewById<LinearLayout>(R.id.LL_agahiman)
        val LL_bazdid_Akhir=view.findViewById<LinearLayout>(R.id.LL_bazdid_Akhir)
        val LL_darbare_Divar=view.findViewById<LinearLayout>(R.id.LL_darbare_Divar)
        val LL_poshtibani=view.findViewById<LinearLayout>(R.id.LL_poshtibani)
        val LL_setting=view.findViewById<LinearLayout>(R.id.LL_setting)
        val LL_yaddasht=view.findViewById<LinearLayout>(R.id.LL_yaddasht)



        LL_agahiman.setOnClickListener(){
            val fragment = Fragment_AgahiHayMan()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
            LL_bazdid_Akhir.setOnClickListener(){
                val fragment = FragmentBazdidAkhir()
                val fragmentManager = activity!!.supportFragmentManager
                val fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.framcenter, fragment)
                fragmentTransaction.addToBackStack(null)
                fragmentTransaction.commit()
        }
        LL_darbare_Divar.setOnClickListener(){
Toast.makeText(activity,"درباره ی دیوار",Toast.LENGTH_SHORT).show()
        }
        LL_poshtibani.setOnClickListener(){
            Toast.makeText(activity,"پشتیبانی",Toast.LENGTH_SHORT).show()
        }

        LL_setting.setOnClickListener(){
            val fragment = FeragmentSetting()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
        LL_yaddasht.setOnClickListener(){
            val fragment = Fragment_yaddasht_va_neshan()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()}
        return view
    }


}

