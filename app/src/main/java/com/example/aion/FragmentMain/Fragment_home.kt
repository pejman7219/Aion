package com.example.aion.FragmentMain


import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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

        val list = ArrayList<String>()
        list.add("فیلترها")
        list.add("دسته ها")
        list.add("خودرو سواری")
        list.add("فروش مسکونی")
        list.add("تجاری مسکونی")
        list.add("موبایل")
        list.add("مبلمان")
        list.add("حیوانات")
        list.add("وسایل شخصی")
        list.add("خدمات")
        list.add("استخدام")
        list.add("تلویزیون")
        list.add("تعیین محل")
        list.add("تعیین قیمت")

        val card = fragmentHome.findViewById<CardView>(R.id.cardSearch)
        val recy = fragmentHome.findViewById<RecyclerView>(R.id.recycel_view)
        recy.layoutManager = LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
        recy.adapter = HomeAdapter(list)

        card.setOnClickListener {
            startActivity(Intent(context,ActivitySearch::class.java))
        }





        return fragmentHome



    }




    class HomeAdapter ( val list : ArrayList<String>): RecyclerView.Adapter<HomeAdapter.ViewHolder>()
    {
        lateinit var  context: Context
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            context = parent.context
            val view = LayoutInflater.from(context).inflate(R.layout.homeecyclerview_layout,parent,false)

            return ViewHolder(view)


        }

        override fun getItemCount(): Int {

            return list.size

        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.text_view.text = list[(list.size-1)-position]

            if(position==(list.size-1))
            {
                holder.image_view.setImageResource(R.drawable.ic_filter_tool_black_shape)
                holder.image_view.visibility=View.VISIBLE
            }
            else if(position==(list.size-2))
            {
                holder.image_view.setImageResource(R.drawable.ic_list_black_24dp)
                holder.image_view.visibility=View.VISIBLE
            }
            else
            {
                holder.image_view.visibility=View.GONE
            }

            holder.itemView.setOnClickListener {

                Toast.makeText(context,list[(list.size-1)-position],Toast.LENGTH_SHORT).show()
            }

        }

        class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)
        {
            val image_view = itemView.findViewById<ImageView>(R.id.homeecyclerview_layout_image)
            val text_view = itemView.findViewById<TextView>(R.id.homeecyclerview_layout_text)
        }
    }

    }





