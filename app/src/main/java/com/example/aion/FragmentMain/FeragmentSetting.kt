package com.example.aion.FragmentMain

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import com.example.aion.R

class FeragmentSetting : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view:View= inflater.inflate(R.layout.fragment_setting, container, false)
var v=view.findViewById<LinearLayout>(R.id.LL_settingChatVaNotification)
        v.setOnClickListener(){
            val fragment = FragmentSettingChatVaNotification()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.replace(R.id.framcenter, fragment)
            fragmentTransaction.commit()
        }
        var hazfneshan=view.findViewById<LinearLayout>(R.id.LL_hazfeNeshanha_fragmentsetting)
        hazfneshan.setOnClickListener(){
            Toast.makeText(context,"حذف همه نشان ها", Toast.LENGTH_SHORT).show()
        }

        var hazfyaddasht=view.findViewById<LinearLayout>(R.id.LL_hazfeYaddasht_fragmentsetting)
        hazfyaddasht.setOnClickListener(){
            Toast.makeText(context,"حذف همه یاداداشت ها", Toast.LENGTH_SHORT).show()
        }

        var hazfbazdid=view.findViewById<LinearLayout>(R.id.LL_hazfebazdid_fragmentsetting)
        hazfbazdid.setOnClickListener(){
            Toast.makeText(context,"حذف همه بازدیدهای اخیر", Toast.LENGTH_SHORT).show()
        }
        var back=view.findViewById<ImageView>(R.id.arrow_setting)
        back.setOnClickListener(){
            activity!!.onBackPressed()
        }
        var btnExite=view.findViewById<Button>(R.id.btn_koroj_fragmentsetting)
        btnExite.setOnClickListener(){
            Toast.makeText(context,"خروج از حساب", Toast.LENGTH_SHORT).show()
        }
        return view
    }


}