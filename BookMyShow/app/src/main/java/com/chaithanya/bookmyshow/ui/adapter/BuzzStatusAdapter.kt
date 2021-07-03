package com.chaithanya.bookmyshow.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.chaithanya.bookmyshow.data.model.HomeHeaderModel
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.data.model.BuzzStatusModel

class BuzzStatusAdapter(private val buzzStatusList:MutableList<BuzzStatusModel>):RecyclerView.Adapter<BuzzStatusAdapter.BuzzStatusViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuzzStatusViewHolder {
        val view:View= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout_buzz_status,parent,false)

        return BuzzStatusViewHolder(view)
    }

    override fun onBindViewHolder(holder: BuzzStatusViewHolder, position: Int) {
        Glide.with(holder.buzzStatusRoundImage)
            .load(buzzStatusList[position].imageUrl)
            .into(holder.buzzStatusRoundImage)

        holder.buzzStatusTitle.text = buzzStatusList[position].statusTitle
    }

    override fun getItemCount(): Int {
        return buzzStatusList.size
    }

    class BuzzStatusViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val buzzStatusRoundImage: ImageView = itemView.findViewById(R.id.buzzStatusRoundImage)
        val buzzStatusTitle: TextView = itemView.findViewById(R.id.buzzStatusTitle)
    }
}