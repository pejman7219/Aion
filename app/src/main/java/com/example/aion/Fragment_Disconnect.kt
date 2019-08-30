package com.example.aion


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aion.Fragment_category.Fragment_categury

/**
 * A simple [Fragment] subclass.
 */
class Fragment_Disconnect : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentDisconnect = inflater.inflate(R.layout.fragment__disconnect, container, false)




        return fragmentDisconnect
    }


}
