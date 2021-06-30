package com.chaithanya.bookmyshow.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.data.model.StreamMoviesParentModel

class StreamMoviesParentAdapter(private val streamMoviesParentList:MutableList<StreamMoviesParentModel>):RecyclerView.Adapter<StreamMoviesParentAdapter.StreamMoviesParentViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StreamMoviesParentViewHolder {
        val view:View= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout_stream_movies_parent,parent,false)

       return StreamMoviesParentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StreamMoviesParentViewHolder, position: Int) {
        holder.tvMovieType.text = streamMoviesParentList[position].movieType
        val childList = streamMoviesParentList[position].streamMoviesChildList

        val childRecyclerAdapter = StreamMovieChildAdapter(childList)
        holder.streamMoviesChildRecycleView.adapter =  childRecyclerAdapter
    }

    override fun getItemCount(): Int {
        return streamMoviesParentList.size
    }

    class StreamMoviesParentViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val tvMovieType: TextView = itemView.findViewById(R.id.tvMovieType)
        val tvSeeAllStream: TextView = itemView.findViewById(R.id.tvSeeAllStream)
        val streamMoviesChildRecycleView: RecyclerView = itemView.findViewById(R.id.streamMoviesChildRecycleView)
    }
}