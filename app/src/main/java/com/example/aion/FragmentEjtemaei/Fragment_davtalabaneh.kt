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
class Fragment_davtalabaneh : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentDavtalabaneh = inflater.inflate(R.layout.fragment_davtalabaneh, container, false)
        var back=fragmentDavtalabaneh.findViewById<ImageView>(R.id.arrow_davtalabane)

        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        val lnrkheyreieh = fragmentDavtalabaneh.findViewById<LinearLayout>(R.id.lnrkheyrie)
        val lnrtahghighat = fragmentDavtalabaneh.findViewById<LinearLayout>(R.id.lnrtahghighat)
        val lnragahi = fragmentDavtalabaneh.findViewById<LinearLayout>(R.id.lnrallagahiDavtalabaneh)
        lnrkheyreieh.setOnClickListener {

            Toast.makeText(context,"خیریه و کمک رسانی", Toast.LENGTH_LONG).show()
        }
        lnrtahghighat.setOnClickListener {

            Toast.makeText(context,"تحقیقاتی", Toast.LENGTH_LONG).show()
        }

        lnragahi.setOnClickListener {

            Toast.makeText(context,"همه آگهی های داوطلبانه", Toast.LENGTH_LONG).show()
        }

        return fragmentDavtalabaneh
    }


}
