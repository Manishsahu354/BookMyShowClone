package com.chaithanya.bookmyshow.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.data.model.BuzzArticlesModel
import com.chaithanya.bookmyshow.ui.adapter.itemclicklistener.BuzzArticleItemClickListener
import de.hdodenhof.circleimageview.CircleImageView

class BuzzArticleAdapter(private val buzzArticleList:MutableList<BuzzArticlesModel>,private val listener:BuzzArticleItemClickListener):RecyclerView.Adapter<BuzzArticleAdapter.BuzzArticleViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuzzArticleViewHolder {
        val view:View= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout_buzz_article,parent,false)

        return BuzzArticleViewHolder(view)
    }

    override fun onBindViewHolder(holder: BuzzArticleViewHolder, position: Int) {

        holder.apply {

            Glide.with(imageBuzz)
                .load(buzzArticleList[position].imageUrl)
                .into(imageBuzz)

            Glide.with(imageBuzzProfile)
                .load(buzzArticleList[position].profileImageUrl)
                .into(imageBuzzProfile)

            tvBuzzTopic.text = buzzArticleList[position].category
            tvBuzzTitle.text = buzzArticleList[position].articleTitle
            tvBuzzTime.text = buzzArticleList[position].time
            likeCountBuzz.text = buzzArticleList[position].likeCount

            imageBuzz.setOnClickListener {

                listener.onArticleItemClicked(buzzArticleList[position])
            }
            tvBuzzTitle.setOnClickListener {

                listener.onArticleItemClicked(buzzArticleList[position])
            }

        }


    }

    override fun getItemCount(): Int {
        return buzzArticleList.size
    }

    class BuzzArticleViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val buzzArticlesConstraint: ConstraintLayout = itemView.findViewById(R.id.buzzArticlesConstraint)
        val imageBuzz: ImageView = itemView.findViewById(R.id.imageBuzz)
        val tvBuzzTopic: TextView = itemView.findViewById(R.id.tvBuzzTopic)
        val tvBuzzTitle: TextView = itemView.findViewById(R.id.tvBuzzTitle)
        val imageBuzzProfile: CircleImageView = itemView.findViewById(R.id.imageBuzzProfile)
        val tvBuzzTime: TextView = itemView.findViewById(R.id.tvBuzzTime)
        val imageBuzzShare: ImageView = itemView.findViewById(R.id.imageBuzzShare)
        val likeCountBuzz: TextView = itemView.findViewById(R.id.likeCountBuzz)
        val imageBuzzLike: ImageView = itemView.findViewById(R.id.imageBuzzLike)
    }
}