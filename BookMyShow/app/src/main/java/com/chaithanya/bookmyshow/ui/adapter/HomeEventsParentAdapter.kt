package com.chaithanya.bookmyshow.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.chaithanya.bookmyshow.data.model.HomeEventsParentModel
import com.chaithanya.bookmyshow.R

class HomeEventsParentAdapter(val homeEventsParentList:MutableList<HomeEventsParentModel>):RecyclerView.Adapter<HomeEventsParentAdapter.HomeEventsParentViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeEventsParentViewHolder {
        val view:View= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout_home_events_parent,parent,false)

       return HomeEventsParentViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeEventsParentViewHolder, position: Int) {
        holder.tvEventName.text = homeEventsParentList[position].eventsName

        val childList = homeEventsParentList[position].homeEventsChildList

        val childRecyclerAdapter = HomeEventsChildAdapter(childList)
        holder.homeEventsChildRecycleView.adapter =  childRecyclerAdapter
    }

    override fun getItemCount(): Int {
        return homeEventsParentList.size
    }

    class HomeEventsParentViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val tvEventName = itemView.findViewById<TextView>(R.id.tvEventName)
        val tvSeeAll = itemView.findViewById<TextView>(R.id.tvSeeAll)
        val homeEventsChildRecycleView = itemView.findViewById<RecyclerView>(R.id.homeEventsChildRecycleView)
    }


}