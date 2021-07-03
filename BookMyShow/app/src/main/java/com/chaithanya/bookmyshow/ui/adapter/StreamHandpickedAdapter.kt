package com.chaithanya.bookmyshow.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.chaithanya.bookmyshow.data.model.HomeStreamModel
import com.chaithanya.bookmyshow.R

class StreamHandpickedAdapter(private val homeStreamList:MutableList<HomeStreamModel>):RecyclerView.Adapter<StreamHandpickedAdapter.StreamHandpickedViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StreamHandpickedViewHolder {
        val view:View= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout_stream_handpicked,parent,false)

        return StreamHandpickedViewHolder(view)
    }

    override fun onBindViewHolder(holder: StreamHandpickedViewHolder, position: Int) {

        holder.apply {
            Glide.with(imageHomeStreamItem)
                .load(homeStreamList[position].imageUrl)
                .into(imageHomeStreamItem)

            tvStreamHandpickedTitle.text = homeStreamList[position].title
            tvStreamLanguage.text = homeStreamList[position].language
            tvStreamCategory.text = homeStreamList[position].category

            constraintStreamHandpicked.setOnClickListener {

            }
        }

    }

    override fun getItemCount(): Int {
        return homeStreamList.size
    }

    class StreamHandpickedViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val constraintStreamHandpicked = itemView.findViewById<ConstraintLayout>(R.id.constraintStreamHandpicked)
        val imageHomeStreamItem = itemView.findViewById<ImageView>(R.id.imageHomeStreamItem)
        val tvStreamHandpickedTitle = itemView.findViewById<TextView>(R.id.tvStreamHandpickedTitle)
        val tvStreamLanguage = itemView.findViewById<TextView>(R.id.tvStreamLanguage)
        val tvStreamCategory = itemView.findViewById<TextView>(R.id.tvStreamCategory)

    }
}