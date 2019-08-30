package com.example.aion

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import com.example.aion.Activity.ActivitySabtAgahi
import com.example.aion.FragmentMain.Fragment_chat
import kotlinx.android.synthetic.main.activity_main.*
import com.example.aion.FragmentMain.Fragment_home
import com.example.aion.FragmentMain.Fragment_mydivar
import com.example.aion.Fragment_category.Fragment_categury
import com.example.aion.NetCheck.NetCheck

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val netCheck=NetCheck(applicationContext)

        buttomnavin.selectedItemId= R.id.divarHome
        val fragment = Fragment_home()
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.framcenter, fragment)
        fragmentTransaction.addToBackStack("home")
        fragmentTransaction.commit()

        if (!netCheck.NetStatus())
        {
            main_disconnect_layout.visibility= View.VISIBLE
        }


        main_button_disconnect.setOnClickListener {

            if (netCheck.NetStatus())
            {
                main_disconnect_layout.visibility= View.GONE
            }
            else
            {
                main_disconnect_layout.visibility= View.VISIBLE
            }
        }

        buttomnavin.setOnNavigationItemSelectedListener {item ->
            when(item.itemId)
            {
                R.id.divarHome -> {

                    if (netCheck.NetStatus())
                    {

                        main_disconnect_layout.visibility= View.GONE

                        if (fragmentManager.backStackEntryCount != 1)
                        {
                            for (i in 0 until fragmentManager.backStackEntryCount -1)
                            {
                                fragmentManager.popBackStack()
                            }

//                        val fragment = Fragment_home()
//                        val fragmentManager = this.supportFragmentManager
//                        val fragmentTransaction = fragmentManager.beginTransaction()
//                        fragmentTransaction.replace(R.id.framcenter, fragment)
//                        fragmentTransaction.addToBackStack("divarHome")
//                        fragmentTransaction.commit()
                        }
                    }
                    else
                    {
                        for (i in 0 until fragmentManager.backStackEntryCount-1)
                        {
                            fragmentManager.popBackStack()
                        }

                        main_disconnect_layout.visibility= View.VISIBLE
                    }
                }

                R.id.categuryHome ->{
                    if (netCheck.NetStatus())
                    {
                        main_disconnect_layout.visibility= View.GONE

                        if (fragmentManager.backStackEntryCount == 1){

                            val fragment = Fragment_categury()
                            val fragmentManager = this.supportFragmentManager
                            val fragmentTransaction = fragmentManager.beginTransaction()
                            fragmentTransaction.replace(R.id.framcenter, fragment)
                            fragmentTransaction.addToBackStack("category")
                            fragmentTransaction.commit()
                        }

                        else if (fragmentManager.backStackEntryCount >= 2 && !(fragmentManager.getBackStackEntryAt(1).name.equals("category")))
                        {
                            for (i in 0 until fragmentManager.backStackEntryCount -1)
                            {
                                fragmentManager.popBackStack()
                            }

                            val fragment = Fragment_categury()
                            val fragmentManager = this.supportFragmentManager
                            val fragmentTransaction = fragmentManager.beginTransaction()
                            fragmentTransaction.replace(R.id.framcenter, fragment)
                            fragmentTransaction.addToBackStack("category")
                            fragmentTransaction.commit()
                        }
                    }
                    else
                    {

                        for (i in 0 until fragmentManager.backStackEntryCount-1)
                        {
                            fragmentManager.popBackStack()
                        }

                        main_disconnect_layout.visibility= View.VISIBLE
                    }



                    //size of backStack
//                    fragmentManager.backStackEntryCount
                    //access to backStack item
//                    fragmentManager.getBackStackEntryAt(0).name

                    // remove item of backStack
//                    fragmentManager.popBackStack()
//                    fragmentManager.popBackStack("fragment name",FragmentManager.POP_BACK_STACK_INCLUSIVE)

                }
                R.id.newaddHome ->{

                    var gotoSabtAgahi:Intent
                    gotoSabtAgahi = Intent(this,ActivitySabtAgahi::class.java)
                    startActivityForResult(gotoSabtAgahi,4545)
                    //startActivity(Intent(this, ActivitySabtAgahi::class.java))

                }
                R.id.chatHome ->

                {
                    main_disconnect_layout.visibility= View.GONE

                    if (fragmentManager.backStackEntryCount == 1)
                    {
                        val fragment = Fragment_chat()
                        val fragmentManager = this.supportFragmentManager
                        val fragmentTransaction = fragmentManager.beginTransaction()
                        fragmentTransaction.replace(R.id.framcenter, fragment)
                        fragmentTransaction.addToBackStack("chatHome")
                        fragmentTransaction.commit()
                    }
                    else if (fragmentManager.backStackEntryCount >= 2 && !(fragmentManager.getBackStackEntryAt(1).name.equals("chatHome")))
                    {
                        for (i in 0 until fragmentManager.backStackEntryCount - 1)
                        {
                            fragmentManager.popBackStack()
                        }

                        val fragment = Fragment_chat()
                        val fragmentManager = this.supportFragmentManager
                        val fragmentTransaction = fragmentManager.beginTransaction()
                        fragmentTransaction.replace(R.id.framcenter, fragment)
                        fragmentTransaction.addToBackStack("chatHome")
                        fragmentTransaction.commit()
                    }

                }
                R.id.mydivarHome ->{

                    main_disconnect_layout.visibility= View.GONE

                    if (fragmentManager.backStackEntryCount == 1)
                    {
                        val fragment = Fragment_mydivar()
                        val fragmentManager = this.supportFragmentManager
                        val fragmentTransaction = fragmentManager.beginTransaction()
                        fragmentTransaction.replace(R.id.framcenter, fragment)
                        fragmentTransaction.addToBackStack("mydivarHome")
                        fragmentTransaction.commit()
                    }
                    else if (fragmentManager.backStackEntryCount >= 2 && !(fragmentManager.getBackStackEntryAt(1).name.equals("mydivarHome")))
                    {
                        for (i in 0 until fragmentManager.backStackEntryCount - 1)
                        {
                            fragmentManager.popBackStack()
                        }

                        val fragment = Fragment_mydivar()
                        val fragmentManager = this.supportFragmentManager
                        val fragmentTransaction = fragmentManager.beginTransaction()
                        fragmentTransaction.replace(R.id.framcenter, fragment)
                        fragmentTransaction.addToBackStack("mydivarHome")
                        fragmentTransaction.commit()
                    }
                }
            }

            true

        }




    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        /*if(resultCode== Activity.RESULT_OK){

        }
*/
        if(requestCode==4545){
            buttomnavin.selectedItemId= R.id.divarHome
            val fragment = Fragment_home()
            val fragmentManager = this.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framcenter, fragment)
            //    fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
    }

    override fun onBackPressed()
    {

        val fragmentManager = this.supportFragmentManager

        if (fragmentManager.backStackEntryCount == 2)
        {
            for (i in 0 until fragmentManager.backStackEntryCount)
            {
                fragmentManager.popBackStack()
            }
            buttomnavin.selectedItemId = R.id.divarHome

            val fragment = Fragment_home()
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.framcenter, fragment)
            fragmentTransaction.addToBackStack("home")
            fragmentTransaction.commit()

        }
        else if (fragmentManager.backStackEntryCount > 2)
        {
            super.onBackPressed()
        }
        else
        {
            super.onBackPressed()
            finish()
        }


    }
}
