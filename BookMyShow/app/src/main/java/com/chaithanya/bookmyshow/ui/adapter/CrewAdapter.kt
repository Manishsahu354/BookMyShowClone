package com.chaithanya.bookmyshow.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.data.model.CastModel
import com.chaithanya.bookmyshow.data.model.CrewModel

class CrewAdapter(val crewList:MutableList<CrewModel>):RecyclerView.Adapter<CrewAdapter.CrewViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CrewViewHolder {
        val view:View= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout_artist,parent,false)

        return CrewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CrewViewHolder, position: Int) {
       holder.apply {
           Glide.with(imageArtist).load(crewList[position].crewImage).into(imageArtist)

           tvArtistName.text = crewList[position].crewName
       }
    }

    override fun getItemCount(): Int {
        return crewList.size
    }


    class CrewViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val imageArtist = itemView.findViewById<ImageView>(R.id.imageArtist)
        val tvArtistName = itemView.findViewById<TextView>(R.id.tvArtistName)
    }
}