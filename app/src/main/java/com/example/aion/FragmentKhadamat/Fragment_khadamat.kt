package com.example.aion.FragmentKhadamat


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast

import com.example.aion.R


class Fragment_khadamat : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentKhadamat = inflater.inflate(R.layout.fragment_khadamat, container, false)



        val lnrkhadamatrayaneh = fragmentKhadamat.findViewById<LinearLayout>(R.id.lnrkhadamatRayanehVaMobile)
        val lnramuzeshi = fragmentKhadamat.findViewById<LinearLayout>(R.id.lnrAmuzeshi)
        val lnrmotor = fragmentKhadamat.findViewById<LinearLayout>(R.id.lnrmotorVaMashin)
        val lnrpaziraei = fragmentKhadamat.findViewById<LinearLayout>(R.id.lnrmarasemPaziraei)
        val lnrbimeh = fragmentKhadamat.findViewById<LinearLayout>(R.id.lnrBimeh)
        val lnrhamlonaghl = fragmentKhadamat.findViewById<LinearLayout>(R.id.lnrhamloNaghl)
        val lnrpisheh = fragmentKhadamat.findViewById<LinearLayout>(R.id.lnrpisheVaMaharat)
        val lnrarayashgari = fragmentKhadamat.findViewById<LinearLayout>(R.id.lnrarayeshgary)
        val lnrsargarmi = fragmentKhadamat.findViewById<LinearLayout>(R.id.lnrsargarmi)
        val lnrnezafat = fragmentKhadamat.findViewById<LinearLayout>(R.id.lnrnezafatkhadamat)
        val lnrbaghbani = fragmentKhadamat.findViewById<LinearLayout>(R.id.lnrbaghbanivaDerakhtkari)
        val lnragahi = fragmentKhadamat.findViewById<LinearLayout>(R.id.lnrallagahikhadamat)

        lnrkhadamatrayaneh.setOnClickListener {

            val fragment = Fragment_khadamat_rayaneh_mobile()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        lnramuzeshi.setOnClickListener {

            val fragment = Fragment_amuzeshi()
            val fragmentManager = activity!!.getSupportFragmentManager()
            val fragmentTransaction  = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        lnrmotor.setOnClickListener {

            Toast.makeText(context,"موتور و ماشین", Toast.LENGTH_LONG).show()
        }

        lnrpaziraei.setOnClickListener {

            Toast.makeText(context,"پذیرایی/مراسم", Toast.LENGTH_LONG).show()
        }

        lnrbimeh.setOnClickListener {

            Toast.makeText(context,"مالی/حسابداری/بیمه", Toast.LENGTH_LONG).show()
        }

        lnrhamlonaghl.setOnClickListener {

            Toast.makeText(context,"حمل و نقل", Toast.LENGTH_LONG).show()
        }

        lnrpisheh.setOnClickListener {

            Toast.makeText(context,"پیشه و مهارت", Toast.LENGTH_LONG).show()
        }
        lnrarayashgari.setOnClickListener {

            Toast.makeText(context,"آریشکری و زیبایی", Toast.LENGTH_LONG).show()
        }
        lnrsargarmi.setOnClickListener {

            Toast.makeText(context,"سرگرمی", Toast.LENGTH_LONG).show()
        }

        lnrnezafat.setOnClickListener {

            Toast.makeText(context,"نظافت", Toast.LENGTH_LONG).show()
        }

        lnrbaghbani.setOnClickListener {

            Toast.makeText(context,"باغبانی و درختکاری", Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های خدمات", Toast.LENGTH_LONG).show()
        }

        return fragmentKhadamat
    }

}
