package com.example.aion.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aion.R
import kotlinx.android.synthetic.main.activity_search.*

class ActivitySearch : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        back.setOnClickListener(){
            this.onBackPressed()
        }


    }
}
