package com.chaithanya.bookmyshow.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.chaithanya.bookmyshow.data.model.HomeEventsChildModel
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.ui.adapter.itemclicklistener.EventsItemClickListener
import com.chaithanya.bookmyshow.ui.fragment.EventsFragmentDirections
import com.chaithanya.bookmyshow.ui.fragment.HomeFragmentDirections

class HomeEventsChildAdapter(val homeEventsChildModelList:MutableList<HomeEventsChildModel>):RecyclerView.Adapter<HomeEventsChildAdapter.HomeEventsChildViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeEventsChildViewHolder {
        val view:View= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout_home_events_child,parent,false)

        return HomeEventsChildViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeEventsChildViewHolder, position: Int) {

        holder.apply {
            Glide.with(ivEventItem).load(homeEventsChildModelList[position].imageUrl).into(ivEventItem)
            tvContentTitle.text = homeEventsChildModelList[position].title
            tvCategory.text = homeEventsChildModelList[position].categoryName

            homeEventsChildConstraint.setOnClickListener {
                it.findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToEventDetailsFragmentFromHome(homeEventsChildModelList[position]))

            }
        }
    }

    override fun getItemCount(): Int {
        return homeEventsChildModelList.size
    }


    class HomeEventsChildViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val homeEventsChildConstraint = itemView.findViewById<ConstraintLayout>(R.id.homeEventsChildConstraint)
        val ivEventItem = itemView.findViewById<ImageView>(R.id.ivEventItem)
        val tvContentTitle = itemView.findViewById<TextView>(R.id.tvContentTitle)
        val tvCategory = itemView.findViewById<TextView>(R.id.tvCategory)
    }
}