package com.chaithanya.bookmyshow.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.chaithanya.bookmyshow.data.model.HomeEventsChildModel
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.data.model.HomeStreamModel
import com.chaithanya.bookmyshow.ui.adapter.itemclicklistener.StreamChildItemClickListener
import com.chaithanya.bookmyshow.ui.fragment.StreamFragment
import com.chaithanya.bookmyshow.ui.fragment.StreamFragmentDirections

class StreamMovieChildAdapter(
    private val homeStreamList:MutableList<HomeStreamModel>):RecyclerView.Adapter<StreamMovieChildAdapter.StreamMovieChildViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StreamMovieChildViewHolder {
        val view:View= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout_stream_movies_child,parent,false)

        return StreamMovieChildViewHolder(view)
    }

    override fun onBindViewHolder(holder: StreamMovieChildViewHolder, position: Int) {

        holder.apply {
            Glide.with(imageMoviesItem).load(homeStreamList[position].thumbImage).into(imageMoviesItem)
            tvMovieLanguage.text = homeStreamList[position].language
            tvMovieAgeRestriction.text = homeStreamList[position].age
            tvMovieCategory.text = homeStreamList[position].categoryName

            streamMoviesChildConstraint.setOnClickListener {
                it.findNavController().navigate(StreamFragmentDirections
                    .actionStreamFragment2ToStreamMovieFragment(homeStreamList[position]))
            }
        }
    }

    override fun getItemCount(): Int {
        return homeStreamList.size
    }


    class StreamMovieChildViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val streamMoviesChildConstraint = itemView.findViewById<ConstraintLayout>(R.id.streamMoviesChildConstraint)
        val imageMoviesItem = itemView.findViewById<ImageView>(R.id.imageMoviesItem)
        val tvMovieLanguage = itemView.findViewById<TextView>(R.id.tvMovieLanguage)
        val tvMovieAgeRestriction = itemView.findViewById<TextView>(R.id.tvMovieAgeRestriction)
        val tvMovieCategory = itemView.findViewById<TextView>(R.id.tvMovieCategory)
    }
}