package com.chaithanya.bookmyshow.views.viewHolders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.model.ResponseItem
import com.chaithanya.bookmyshow.views.interfaces.OnCityClickListener

class CityViewHolder(itemView: View, private val onCityClickListener: OnCityClickListener) :
    RecyclerView.ViewHolder(itemView) {
    fun setData(responseItem: ResponseItem) {
        itemView.apply {
            val mTvCity = findViewById<TextView>(R.id.tvCity)

            mTvCity.text = responseItem.name.toString()

            mTvCity.setOnClickListener {
                onCityClickListener.onItemClicked(responseItem)
            }

        }
    }
}