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
class Fragment_tajhizat_mashinalat : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentTajhizatMashinalat = inflater.inflate(R.layout.fragment_tajhizat_mashinalat, container, false)

        var back=fragmentTajhizatMashinalat.findViewById<ImageView>(R.id.arrow_fragment_tajhizat_mashinalat)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val lnrforoshgah = fragmentTajhizatMashinalat.findViewById<LinearLayout>(R.id.lnrforoshgahvamaghazeh)
        val lnrarayeshgah = fragmentTajhizatMashinalat.findViewById<LinearLayout>(R.id.lnrArayeshgahvasalon)
        val lnrdaftarkar = fragmentTajhizatMashinalat.findViewById<LinearLayout>(R.id.lnrdaftarkartajhizat)
        val lnrsanati = fragmentTajhizatMashinalat.findViewById<LinearLayout>(R.id.lnrsanati)
        val lnrkafishop = fragmentTajhizatMashinalat.findViewById<LinearLayout>(R.id.lnrkafishop)
        val lnrpezeshki = fragmentTajhizatMashinalat.findViewById<LinearLayout>(R.id.lnrpezeshki)
        val lnragahi = fragmentTajhizatMashinalat.findViewById<LinearLayout>(R.id.lnrallagahitajhizatvamashinalat)



        lnrforoshgah.setOnClickListener {

            Toast.makeText(context,"فروشگاه و مغازه", Toast.LENGTH_LONG).show()
        }

        lnrarayeshgah.setOnClickListener {

            Toast.makeText(context,"آرایشگاه و سالن زیبایی", Toast.LENGTH_LONG).show()
        }

        lnrdaftarkar.setOnClickListener {

            Toast.makeText(context,"دفتر کار", Toast.LENGTH_LONG).show()
        }

        lnrsanati.setOnClickListener {

            Toast.makeText(context,"صنعتی", Toast.LENGTH_LONG).show()
        }

        lnrkafishop.setOnClickListener {

            Toast.makeText(context,"کافی شاپ و رستوران", Toast.LENGTH_LONG).show()
        }
        lnrpezeshki.setOnClickListener {

            Toast.makeText(context,"پزشکی", Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های تجهیزات و ماشین آلات", Toast.LENGTH_LONG).show()
        }
        
        return fragmentTajhizatMashinalat
    }


}
