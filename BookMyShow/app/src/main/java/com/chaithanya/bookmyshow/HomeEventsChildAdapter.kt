package com.chaithanya.bookmyshow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class HomeEventsChildAdapter(val homeEventsChildModelList:MutableList<HomeEventsChildModel>):RecyclerView.Adapter<HomeEventsChildAdapter.HomeEventsChildViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeEventsChildViewHolder {
        val view:View= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout_home_events_child,parent,false)

        return HomeEventsChildViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeEventsChildViewHolder, position: Int) {

        holder.apply {
            Glide.with(ivEventItem).load(homeEventsChildModelList[position].imageUrl).into(ivEventItem)
            tvTime.text = homeEventsChildModelList[position].time
            tvContentTitle.text = homeEventsChildModelList[position].title
            tvCategory.text = homeEventsChildModelList[position].categoryName
        }
    }

    override fun getItemCount(): Int {
        return homeEventsChildModelList.size
    }


    class HomeEventsChildViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val homeEventsChildConstraint = itemView.findViewById<ConstraintLayout>(R.id.homeEventsChildConstraint)
        val ivEventItem = itemView.findViewById<ImageView>(R.id.ivEventItem)
        val tvTime = itemView.findViewById<TextView>(R.id.tvTime)
        val tvContentTitle = itemView.findViewById<TextView>(R.id.tvContentTitle)
        val tvCategory = itemView.findViewById<TextView>(R.id.tvCategory)
    }
}