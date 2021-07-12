package com.chaithanya.bookmyshow.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.chaithanya.bookmyshow.data.model.HomeEventsParentModel
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.data.model.HomeEventsChildModel
import com.chaithanya.bookmyshow.ui.adapter.itemclicklistener.EventsItemClickListener

class HomeEventsParentAdapter(var homeEventsParentList:MutableList<HomeEventsParentModel>)
    :RecyclerView.Adapter<HomeEventsParentAdapter.HomeEventsParentViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeEventsParentViewHolder {
        val view:View= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout_home_events_parent,parent,false)

       return HomeEventsParentViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeEventsParentViewHolder, position: Int) {
        holder.tvEventName.text = homeEventsParentList[position].eventsName

        holder.tvSeeAll.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_eventsFragment2)
        }

        val childList = homeEventsParentList[position].childList

        val childRecyclerAdapter = childList?.let { HomeEventsChildAdapter(it) }
        holder.homeEventsChildRecycleView.adapter =  childRecyclerAdapter
    }

    override fun getItemCount(): Int {
        return homeEventsParentList.size
    }

    fun updateData(newData:MutableList<HomeEventsParentModel>){
        homeEventsParentList = newData
        notifyDataSetChanged()
    }

    class HomeEventsParentViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val tvEventName = itemView.findViewById<TextView>(R.id.tvEventName)
        val tvSeeAll = itemView.findViewById<TextView>(R.id.tvSeeAll)
        val homeEventsChildRecycleView = itemView.findViewById<RecyclerView>(R.id.homeEventsChildRecycleView)
    }



}