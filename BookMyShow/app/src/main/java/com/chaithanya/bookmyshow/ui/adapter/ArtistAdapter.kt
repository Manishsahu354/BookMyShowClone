package com.chaithanya.bookmyshow.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.data.model.ArtistModel

class ArtistAdapter(val artistList:MutableList<ArtistModel>):RecyclerView.Adapter<ArtistAdapter.ArtistViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistViewHolder {
        val view:View= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout_artist,parent,false)

        return ArtistViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArtistViewHolder, position: Int) {
       holder.apply {
           Glide.with(imageArtist).load(artistList[position].imageUrl).into(imageArtist)

           tvArtistName.text = artistList[position].artistName
       }
    }

    override fun getItemCount(): Int {
        return artistList.size
    }


    class ArtistViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val imageArtist = itemView.findViewById<ImageView>(R.id.imageArtist)
        val tvArtistName = itemView.findViewById<TextView>(R.id.tvArtistName)
    }
}