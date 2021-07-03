package com.chaithanya.bookmyshow.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.chaithanya.bookmyshow.data.model.HomeHeaderModel
import com.chaithanya.bookmyshow.R

class HomeBestOfAdapter(private val homeBestOfList:MutableList<HomeHeaderModel>):RecyclerView.Adapter<HomeBestOfAdapter.HomeBestOfViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeBestOfViewHolder {
        val view:View= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout_home_best_of_entertainment,parent,false)

        return HomeBestOfViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeBestOfViewHolder, position: Int) {
        Glide.with(holder.imageHomeBestOfItem)
            .load(homeBestOfList[position].imageUrl)
            .into(holder.imageHomeBestOfItem)
    }

    override fun getItemCount(): Int {
        return homeBestOfList.size
    }

    class HomeBestOfViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val imageHomeBestOfItem: ImageView = itemView.findViewById(R.id.imageHomeBestOfItem)
    }
}