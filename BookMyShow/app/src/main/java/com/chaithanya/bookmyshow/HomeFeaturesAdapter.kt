package com.chaithanya.bookmyshow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class HomeFeaturesAdapter(val homeHeaderList:MutableList<HomeHeaderModel>):RecyclerView.Adapter<HomeFeaturesAdapter.HomeFeaturesViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeFeaturesViewHolder {
        val view:View= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout_home_features,parent,false)

        return HomeFeaturesViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeFeaturesViewHolder, position: Int) {
        Glide.with(holder.featuresRecyclerImage)
            .load(homeHeaderList[position].imageUrl)
            .into(holder.featuresRecyclerImage)
    }

    override fun getItemCount(): Int {
        return homeHeaderList.size
    }

    class HomeFeaturesViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val featuresRecyclerImage = itemView.findViewById<ImageView>(R.id.featuresRecyclerImage)
    }
}