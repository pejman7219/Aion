package com.example.aion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.aion.Adapter.AdapterHome
import kotlinx.android.synthetic.main.activity_main.*
import android.R
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import com.example.aion.Fragment.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.aion.R.layout.activity_main)


        //view_pager.adapter = AdapterHome(supportFragmentManager)

        buttomnavin.setOnNavigationItemSelectedListener {item ->

            when(item.itemId)
            {
                com.example.aion.R.id.divarHome ->{

                    val fragment = Fragment_home()
                    val fragmentManager = this.getSupportFragmentManager()
                    val fragmentTransaction = fragmentManager.beginTransaction()
                    fragmentTransaction.replace( com.example.aion.R.id.framcenter, fragment)
                    fragmentTransaction.addToBackStack(null)
                    fragmentTransaction.commit()
                }

                com.example.aion.R.id.categuryHome ->{
//                    view_pager.setCurrentItem(1,true)
                    val fragment = Fragment_categury()
                    val fragmentManager = this.getSupportFragmentManager()
                    val fragmentTransaction = fragmentManager.beginTransaction()
                    fragmentTransaction.replace( com.example.aion.R.id.framcenter, fragment)
                    fragmentTransaction.addToBackStack(null)
                    fragmentTransaction.commit()

                }
                com.example.aion.R.id.newaddHome ->{
                    val fragment = Fragment_new_add()
                    val fragmentManager = this.getSupportFragmentManager()
                    val fragmentTransaction = fragmentManager.beginTransaction()
                    fragmentTransaction.replace( com.example.aion.R.id.framcenter, fragment)
                    fragmentTransaction.addToBackStack(null)
                    fragmentTransaction.commit()

                }
                com.example.aion.R.id.chatHome ->{
                    val fragment = Fragment_chat()
                    val fragmentManager = this.getSupportFragmentManager()
                    val fragmentTransaction = fragmentManager.beginTransaction()
                    fragmentTransaction.replace( com.example.aion.R.id.framcenter, fragment)
                    fragmentTransaction.addToBackStack(null)
                    fragmentTransaction.commit()

                }
                com.example.aion.R.id.divarHome ->{
                    val fragment = Fragment_mydivar()
                    val fragmentManager = this.getSupportFragmentManager()
                    val fragmentTransaction = fragmentManager.beginTransaction()
                    fragmentTransaction.replace( com.example.aion.R.id.framcenter, fragment)
                    fragmentTransaction.addToBackStack(null)
                    fragmentTransaction.commit()
                }
            }

            true

        }



    }
}
