package com.chaithanya.bookmyshow.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.chaithanya.bookmyshow.data.model.HomeEventsChildModel
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.ui.adapter.itemclicklistener.EventsItemClickListener

class EventsAdapter(var homeEventsChildModelList:MutableList<HomeEventsChildModel>,private val listener:EventsItemClickListener):RecyclerView.Adapter<EventsAdapter.EventsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventsViewHolder {
        val view:View= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout_events,parent,false)

        return EventsViewHolder(view)
    }

    override fun onBindViewHolder(holder: EventsViewHolder, position: Int) {

        holder.apply {
            Glide.with(imageEvents).load(homeEventsChildModelList[position].imageUrl).into(imageEvents)
            tvEventsTitle.text = homeEventsChildModelList[position].title
            tvEventsCategory.text = homeEventsChildModelList[position].categoryName

            if (homeEventsChildModelList[position].free == "false"){
                tvEventsPrice.text = homeEventsChildModelList[position].price
            }

            EventsConstraint.setOnClickListener {
                listener.onEventsItemClicked(homeEventsChildModelList[position])
            }
           // tvEventsPrice.text = homeEventsChildModelList[position]
        }
    }

    override fun getItemCount(): Int {
        return homeEventsChildModelList.size
    }

    fun updateData(newData:MutableList<HomeEventsChildModel>){
        homeEventsChildModelList = newData
        notifyDataSetChanged()
    }


    class EventsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val EventsConstraint = itemView.findViewById<ConstraintLayout>(R.id.EventsConstraint)
        val imageEvents = itemView.findViewById<ImageView>(R.id.imageEvents)
        val tvEventsTitle = itemView.findViewById<TextView>(R.id.tvEventsTitle)
        val tvEventsCategory = itemView.findViewById<TextView>(R.id.tvEventsCategory)
        val tvEventsPrice = itemView.findViewById<TextView>(R.id.tvEventsPrice)
    }
}