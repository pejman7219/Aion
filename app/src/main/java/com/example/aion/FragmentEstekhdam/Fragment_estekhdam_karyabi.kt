package com.example.aion.FragmentEstekhdam


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
class Fragment_estekhdam_karyabi : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentEstekhdamKaryabi = inflater.inflate(R.layout.fragment_estekhdam_karyabi, container, false)
        var back=fragmentEstekhdamKaryabi.findViewById<ImageView>(R.id.arrow_fragment_estekhdam_karyabi)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }

        val lnrmodiriat = fragmentEstekhdamKaryabi.findViewById<LinearLayout>(R.id.lnrmodiriat)
        val lnrsraydari = fragmentEstekhdamKaryabi.findViewById<LinearLayout>(R.id.lnrsrayedary)
        val lnrmemari = fragmentEstekhdamKaryabi.findViewById<LinearLayout>(R.id.lnrmemari)
        val lnrresturan = fragmentEstekhdamKaryabi.findViewById<LinearLayout>(R.id.lnrkhadamatresturan)
        val lnrfanavary = fragmentEstekhdamKaryabi.findViewById<LinearLayout>(R.id.lnrrayanehvaFanavari)
        val lnrmali = fragmentEstekhdamKaryabi.findViewById<LinearLayout>(R.id.lnrmalivahesabdari)
        val lnrbazaryabi = fragmentEstekhdamKaryabi.findViewById<LinearLayout>(R.id.lnrfanivamohandesi)
        val lnrfanivamohandesi = fragmentEstekhdamKaryabi.findViewById<LinearLayout>(R.id.lnrfanivamohandesi)
        val lnramozeshi = fragmentEstekhdamKaryabi.findViewById<LinearLayout>(R.id.lnrAmozeshiestekhdami)
        val lnrhamlonaghl = fragmentEstekhdamKaryabi.findViewById<LinearLayout>(R.id.lnrhamlonaghlestekhdami)
        val lnrdarmani = fragmentEstekhdamKaryabi.findViewById<LinearLayout>(R.id.lnrdarmanivazibaei)
        val lnrhonary = fragmentEstekhdamKaryabi.findViewById<LinearLayout>(R.id.lnrhonaryvaresanei)
        val lnragahi = fragmentEstekhdamKaryabi.findViewById<LinearLayout>(R.id.lnrAllAgahiestekhdamvakaryabi)



        lnrmodiriat.setOnClickListener {

            Toast.makeText(context,"اداری و مدیریت", Toast.LENGTH_LONG).show()
        }

        lnrsraydari.setOnClickListener {

            Toast.makeText(context,"سرایداری و نظافت", Toast.LENGTH_LONG).show()
        }

        lnrmemari.setOnClickListener {

            Toast.makeText(context,"معماری,عمران و ساختمانی", Toast.LENGTH_LONG).show()
        }

        lnrresturan.setOnClickListener {

            Toast.makeText(context,"خدمات فروشگاه و رستوران", Toast.LENGTH_LONG).show()
        }

        lnrfanavary.setOnClickListener {

            Toast.makeText(context,"رایانه و فناوری اطلاعات", Toast.LENGTH_LONG).show()
        }
        lnrmali.setOnClickListener {

            Toast.makeText(context,"مالی و حسابداری و حقوقی", Toast.LENGTH_LONG).show()
        }
        lnrbazaryabi.setOnClickListener {

            Toast.makeText(context,"بازاریابی و فروش", Toast.LENGTH_LONG).show()
        }

        lnrfanivamohandesi.setOnClickListener {

            Toast.makeText(context,"صنعتی و فنی و مهندسی", Toast.LENGTH_LONG).show()
        }

        lnramozeshi.setOnClickListener {

            Toast.makeText(context,"آموزشی", Toast.LENGTH_LONG).show()
        }

        lnrhamlonaghl.setOnClickListener {

            Toast.makeText(context,"حمل و نقل", Toast.LENGTH_LONG).show()
        }

        lnrdarmani.setOnClickListener {

            Toast.makeText(context,"درمانی و زیبایی", Toast.LENGTH_LONG).show()
        }

        lnrhonary.setOnClickListener {

            Toast.makeText(context,"هنری و رسانه", Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های استخدام و کاریابی", Toast.LENGTH_LONG).show()
        }
        
        

        return fragmentEstekhdamKaryabi
    }


}
