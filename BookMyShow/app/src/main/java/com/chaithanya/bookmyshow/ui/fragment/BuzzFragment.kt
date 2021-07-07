package com.chaithanya.bookmyshow.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.chaithanya.bookmyshow.data.model.BuzzArticlesModel
import com.chaithanya.bookmyshow.data.model.HomeEventsChildModel
import com.chaithanya.bookmyshow.databinding.FragmentBuzzBinding
import com.chaithanya.bookmyshow.databinding.FragmentHomeBinding
import com.chaithanya.bookmyshow.ui.adapter.BuzzArticleAdapter
import com.chaithanya.bookmyshow.ui.adapter.itemclicklistener.BuzzArticleItemClickListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class BuzzFragment : Fragment(),BuzzArticleItemClickListener {

    private lateinit var buzzArticleAdapter: BuzzArticleAdapter
    private val buzzArticleList:MutableList<BuzzArticlesModel> = mutableListOf()
    private val database = FirebaseDatabase.getInstance().getReference("bookmyshow")
        .child("buzzList")

    private var _binding: FragmentBuzzBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding =  FragmentBuzzBinding.inflate(inflater, container, false)


        setUpRecyclerview()
        readDataFromFirebase()

        return binding.root
    }

    private fun setUpRecyclerview() {

        buzzArticleAdapter = BuzzArticleAdapter(buzzArticleList,this)
        binding.buzzRecyclerview.adapter = buzzArticleAdapter
    }

    private fun readDataFromFirebase() {

        database.addValueEventListener(object :ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {

                if(snapshot.exists()){

                    for(buzzSnapshot in snapshot.children){

                        val articleTitle = buzzSnapshot.child("articleTitle").value.toString()
                        val category = buzzSnapshot.child("category").value.toString()
                        val imageUrl = buzzSnapshot.child("imageUrl").value.toString()
                        val likeCount = buzzSnapshot.child("likeCount").value.toString()
                        val liked = buzzSnapshot.child("liked").value.toString()
                        val profileImageUrl = buzzSnapshot.child("profileImageUrl").value.toString()
                        val time = buzzSnapshot.child("time").value.toString()
                        val webUrl = buzzSnapshot.child("webUrl").value.toString()

                        val buzzArticlesModel = BuzzArticlesModel(
                            articleTitle,category,imageUrl,likeCount,liked,profileImageUrl
                             ,time,webUrl
                        )
                        buzzArticleList.add(buzzArticlesModel)
                    }
                    buzzArticleAdapter.updateData(buzzArticleList)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }


        })


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        buzzArticleList.clear()
    }

    override fun onArticleItemClicked(buzzArticlesModel: BuzzArticlesModel) {

        findNavController().navigate(BuzzFragmentDirections.actionBuzzFragmentToBuzzDetailsFragment(
            buzzArticlesModel.webUrl.toString()))
    }

}