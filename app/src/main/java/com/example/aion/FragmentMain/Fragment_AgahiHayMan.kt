package com.example.aion.FragmentMain


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.aion.R

class Fragment_AgahiHayMan : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view:View= inflater.inflate(R.layout.feragment_agahi_hay_man, container, false)
        var back=view.findViewById<ImageView>(R.id.arrow_AgahiMan)
        back.setOnClickListener(){
            activity!!.onBackPressed()
        }

        return view

}}