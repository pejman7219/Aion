
package com.example.aion.Activity


import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.example.aion.FragmentMain.Fragment_sabtAgahi1
import com.example.aion.NetCheck.NetCheck
import com.example.aion.R
import kotlinx.android.synthetic.main.activity_sabt_agahi1.*


class ActivitySabtAgahi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sabt_agahi1)

        val netCheck= NetCheck(applicationContext)

            val fragment = Fragment_sabtAgahi1()
            val fragmentManager = this.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.LL_Frame_sabt_agahi1, fragment)
            fragmentTransaction.commit()


        if (netCheck.NetStatus())
        {
            sabtagahi_disconnect_layout.visibility=View.GONE
        }
        else
        {
            sabtagahi_disconnect_layout.visibility=View.VISIBLE
        }

        sabtagahi_button_disconnect.setOnClickListener {

            if (netCheck.NetStatus())
            {
                sabtagahi_disconnect_layout.visibility=View.GONE
            }
            else
            {
                sabtagahi_disconnect_layout.visibility=View.VISIBLE
            }
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        var returnintent = intent.putExtra("AddAgahi",4545)

        setResult(Activity.RESULT_OK,returnintent)
        finish()

    }
}
