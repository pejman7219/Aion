package com.example.aion.Fragment


import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.aion.Activity.ActivitySearch

import com.example.aion.R
import kotlinx.android.synthetic.main.fragment_home.*


class Fragment_home : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentHome =  inflater.inflate(R.layout.fragment_home, container, false)

        val card = fragmentHome.findViewById<CardView>(R.id.cardSearch)

        card.setOnClickListener {
            startActivity(Intent(context,ActivitySearch::class.java))
        }

        return fragmentHome
    }

    }





