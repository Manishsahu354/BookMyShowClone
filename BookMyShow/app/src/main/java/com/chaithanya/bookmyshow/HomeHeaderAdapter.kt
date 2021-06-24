package com.chaithanya.bookmyshow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class HomeHeaderAdapter(val homeHeaderList:MutableList<HomeHeaderModel>):RecyclerView.Adapter<HomeHeaderAdapter.HomeHeaderViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeHeaderViewHolder {
        val view:View= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout_home_header,parent,false)

        return HomeHeaderViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeHeaderViewHolder, position: Int) {
        Glide.with(holder.headerRecyclerImage)
            .load(homeHeaderList[position].imageUrl)
            .into(holder.headerRecyclerImage)
    }

    override fun getItemCount(): Int {
        return homeHeaderList.size
    }

    class HomeHeaderViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val headerRecyclerImage = itemView.findViewById<ImageView>(R.id.headerRecyclerImage)
    }
}