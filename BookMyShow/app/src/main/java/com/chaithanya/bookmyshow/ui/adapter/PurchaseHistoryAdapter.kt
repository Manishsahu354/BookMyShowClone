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
import com.chaithanya.bookmyshow.data.local.BookedEventEntity
import com.chaithanya.bookmyshow.ui.adapter.itemclicklistener.EventsItemClickListener

class PurchaseHistoryAdapter(var bookedEventList:MutableList<BookedEventEntity>):RecyclerView.Adapter<PurchaseHistoryAdapter.PurchaseHistoryViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PurchaseHistoryViewHolder {
        val view:View= LayoutInflater.from(parent.context)
            .inflate(R.layout.booked_events_item_layout,parent,false)

        return PurchaseHistoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: PurchaseHistoryViewHolder, position: Int) {

        holder.apply {
            Glide.with(imageEvents).load(bookedEventList[position].imageUrl).into(imageEvents)

            tvDate.text = bookedEventList[position].date
            title.text = bookedEventList[position].title
            tvVenue.text = bookedEventList[position].venue
            tvPrice.text = "Price: ${bookedEventList[position].price}.00"

        }
    }

    override fun getItemCount(): Int {
        return bookedEventList.size
    }

    fun updateData(newData:MutableList<BookedEventEntity>){
        bookedEventList = newData
        notifyDataSetChanged()
    }


    class PurchaseHistoryViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val imageEvents = itemView.findViewById<ImageView>(R.id.imageEventsBooked)
        val tvDate = itemView.findViewById<TextView>(R.id.tvDateBooked)
        val title = itemView.findViewById<TextView>(R.id.titleBooked)
        val tvVenue = itemView.findViewById<TextView>(R.id.tvVenueBooked)
        val tvPrice = itemView.findViewById<TextView>(R.id.tvPriceBooked)

    }
}