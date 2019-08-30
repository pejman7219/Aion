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

/**
 * A simple [Fragment] subclass.
 */
class Fragment_amuzeshi : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentAmuzeshi =  inflater.inflate(R.layout.fragment_fragment_amuzeshi, container, false)
        var back=fragmentAmuzeshi.findViewById<ImageView>(R.id.arrow_fragment_amoozeshi)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }

        val lnrzaban = fragmentAmuzeshi.findViewById<LinearLayout>(R.id.lnrZabanKhareji)
        val lnrdorosmadreseh = fragmentAmuzeshi.findViewById<LinearLayout>(R.id.lnrDrosMadreseh)
        val lnrnarmafzar = fragmentAmuzeshi.findViewById<LinearLayout>(R.id.lnrNarmafzar)
        val lnrhonary = fragmentAmuzeshi.findViewById<LinearLayout>(R.id.lnrHonary)
        val lnrvarzeshi = fragmentAmuzeshi.findViewById<LinearLayout>(R.id.lnrVarzeshi)
        val lnrmoshaverehtahsili = fragmentAmuzeshi.findViewById<LinearLayout>(R.id.lnrMoshaverhTahsili)
        val lnragahi = fragmentAmuzeshi.findViewById<LinearLayout>(R.id.lnrallagahiAmozeshi)



        lnrzaban.setOnClickListener {

            Toast.makeText(context,"زبان خارجی", Toast.LENGTH_LONG).show()
        }

        lnrdorosmadreseh.setOnClickListener {

            Toast.makeText(context,"دروس مدرسه و دانشگاه", Toast.LENGTH_LONG).show()
        }

        lnrnarmafzar.setOnClickListener {

            Toast.makeText(context,"نرم افزار", Toast.LENGTH_LONG).show()
        }

        lnrhonary.setOnClickListener {

            Toast.makeText(context,"هنری", Toast.LENGTH_LONG).show()
        }

        lnrvarzeshi.setOnClickListener {

            Toast.makeText(context,"ورزشی", Toast.LENGTH_LONG).show()
        }
        lnrmoshaverehtahsili.setOnClickListener {

            Toast.makeText(context, "مشاوره تحصیلی", Toast.LENGTH_LONG).show()
        }


                   lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های آموزشی", Toast.LENGTH_LONG).show()
        }

        return fragmentAmuzeshi
    }
    }



