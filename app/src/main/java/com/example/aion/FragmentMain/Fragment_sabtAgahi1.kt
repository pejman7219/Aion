package com.example.aion.FragmentMain


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.aion.R
import com.orhanobut.dialogplus.DialogPlus
import kotlinx.android.synthetic.main.dialog_layout.*
import kotlinx.android.synthetic.main.fragment_sabt_agahi1.*

/**
 * A simple [Fragment] subclass.
 */
class Fragment_sabtAgahi1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view: View=inflater.inflate(R.layout.fragment_sabt_agahi1, container, false)
        var b=view.findViewById<Button>(R.id.btn_page1_sabtagahi)
        b.setOnClickListener(){
            val fragment = `Fragment-sabtAgahi2`()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.LL_Frame_sabt_agahi1, fragment)

            fragmentTransaction.commit()

        }
        var back=view.findViewById<ImageView>(R.id.arrow_newAdd)
        back.setOnClickListener(){
            activity!!.onBackPressed()
        }

        val refresh=view.findViewById(R.id.refresh_sabt) as ImageView
        refresh.setOnClickListener {


            val  dialog=DialogPlus.newDialog(context)
                .setAdapter(SimpleAdapter())
                .setExpanded(true, 300)
                .setContentBackgroundResource(R.drawable.backgrund_dialog_border)
                .create()

            dialog.show()

        }

        return view
    }


    class SimpleAdapter() : BaseAdapter()
    {
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View
        {
            var view: View? = convertView

            var inflater=LayoutInflater.from(parent!!.context)
            view=inflater.inflate(R.layout.dialog_layout,parent,false)


            var ok=view.findViewById<Button>(R.id.dialog_ok)
            var nok=view.findViewById<Button>(R.id.dialog_nok)

            ok.setOnClickListener {

                Toast.makeText(parent.context,"بله",Toast.LENGTH_SHORT).show()
            }

            nok.setOnClickListener {

                Toast.makeText(parent.context,"نه",Toast.LENGTH_SHORT).show()
            }

            return view
        }

        override fun getItem(p0: Int): Any
        {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getItemId(p0: Int): Long
        {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getCount(): Int
        {
            return 1
        }
    }


}
