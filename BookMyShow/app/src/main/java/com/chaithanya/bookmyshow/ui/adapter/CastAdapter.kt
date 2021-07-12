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

class CastAdapter(val castList:MutableList<CastModel>):RecyclerView.Adapter<CastAdapter.CastViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CastViewHolder {
        val view:View= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout_artist,parent,false)

        return CastViewHolder(view)
    }

    override fun onBindViewHolder(holder: CastViewHolder, position: Int) {
       holder.apply {
           Glide.with(imageArtist).load(castList[position].castImage).into(imageArtist)

           tvArtistName.text = castList[position].castName
       }
    }

    override fun getItemCount(): Int {
        return castList.size
    }


    class CastViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val imageArtist = itemView.findViewById<ImageView>(R.id.imageArtist)
        val tvArtistName = itemView.findViewById<TextView>(R.id.tvArtistName)
    }
}