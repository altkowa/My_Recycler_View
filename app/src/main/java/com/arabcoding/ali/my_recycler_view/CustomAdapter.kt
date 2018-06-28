package com.arabcoding.ali.my_recycler_view

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.recycler_row.view.*
import java.text.FieldPosition

class CustomAdapter(val userList : ArrayList<data>):RecyclerView.Adapter<CustomAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
       val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
     return  userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val data :data =userList[position]
        holder.text_name.text =data.name
        holder.text_age.text = data.age.toString()
        holder.my_image.setImageResource(data.image)
    }


    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val text_name = itemView.tx_name as TextView
        val text_age = itemView.tx_age as TextView
        val my_image = itemView.iv_image as ImageView

    }


}