package com.chaithanya.bookmyshow.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.model.ResponseItem
import com.chaithanya.bookmyshow.views.interfaces.OnCityClickListener
import com.chaithanya.bookmyshow.views.viewHolders.CityViewHolder

class CityAdapter(
    private var list: List<ResponseItem>,
    private val onCityClickListener: OnCityClickListener
) : RecyclerView.Adapter<CityViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.city_item_layout, parent, false)
        return CityViewHolder(view, onCityClickListener)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        val city = list[position]
        holder.setData(city)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}