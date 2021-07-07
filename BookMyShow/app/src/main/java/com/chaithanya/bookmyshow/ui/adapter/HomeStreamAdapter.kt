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

class HomeStreamAdapter(val homeStreamList:MutableList<HomeStreamModel>):RecyclerView.Adapter<HomeStreamAdapter.HomeStreamViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeStreamViewHolder {
        val view:View= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout_home_stream,parent,false)

        return HomeStreamViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeStreamViewHolder, position: Int) {

        holder.apply {
            Glide.with(imageHomeStreamItem)
                .load(homeStreamList[position].thumbImage)
                .into(imageHomeStreamItem)

            tvHomeStreamTitle.text = homeStreamList[position].title
            tvHomeStreamTimeAndAge.text = homeStreamList[position].time
            tvHomeStreamCategory.text = homeStreamList[position].categoryName.toString()
            tvHomeStreamLang.text = homeStreamList[position].language
            tvHomeStreamDescription.text = homeStreamList[position].about

//            btnBuyOrRent.setOnClickListener {
//
//            }
            constraintHomeStream.setOnClickListener {

            }
        }

    }

    override fun getItemCount(): Int {
        return homeStreamList.size
    }

    class HomeStreamViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val constraintHomeStream = itemView.findViewById<ConstraintLayout>(R.id.constraintHomeStream)
        val imageHomeStreamItem = itemView.findViewById<ImageView>(R.id.imageHomeStreamItem)
        val tvHomeStreamTitle = itemView.findViewById<TextView>(R.id.tvHomeStreamTitle)
        val tvHomeStreamTimeAndAge = itemView.findViewById<TextView>(R.id.tvHomeStreamTimeAndAge)
        val tvHomeStreamCategory = itemView.findViewById<TextView>(R.id.tvHomeStreamCategory)
        val tvHomeStreamLang = itemView.findViewById<TextView>(R.id.tvHomeStreamLang)
        val tvHomeStreamDescription = itemView.findViewById<TextView>(R.id.tvHomeStreamDescription)
       // val btnBuyOrRent = itemView.findViewById<Button>(R.id.btnBuyOrRent)
    }
}