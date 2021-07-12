package com.chaithanya.bookmyshow.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.constant.Constants.TAILGATE_IMAGE
import com.chaithanya.bookmyshow.data.model.*
import com.chaithanya.bookmyshow.databinding.FragmentStreamBinding
import com.chaithanya.bookmyshow.ui.adapter.HomeEventsParentAdapter
import com.chaithanya.bookmyshow.ui.adapter.StreamHandpickedAdapter
import com.chaithanya.bookmyshow.ui.adapter.StreamMoviesParentAdapter
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class StreamFragment : Fragment() {


    private val database = FirebaseDatabase.getInstance().getReference("streamNested")
    private val databaseForHandPicked = FirebaseDatabase.getInstance().getReference("bookmyshow").child("movieList")
    private lateinit var streamMoviesParentAdapter: StreamMoviesParentAdapter
    private val streamMoviesParentList:MutableList<StreamMoviesParentModel> = mutableListOf()
    private lateinit var streamHandpickedAdapter: StreamHandpickedAdapter
    private val streamListForHandpicked:MutableList<HomeStreamModel> = mutableListOf()

    private var _binding:FragmentStreamBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       _binding =  FragmentStreamBinding.inflate(inflater, container, false)

        binding.imageBack.setOnClickListener {
           findNavController().popBackStack()
        }
        Glide.with(requireContext()).load(TAILGATE_IMAGE).into(binding.tailgateImage)
        binding.tailgateImage

        setRecyclerview()
        readDataFromFirebase()

        return binding.root
    }

    private fun setRecyclerview() {
        streamMoviesParentAdapter = StreamMoviesParentAdapter(streamMoviesParentList)
        binding.nestedRecycleViewStreamMovies.adapter = streamMoviesParentAdapter

        //HandPickedAdapter
        streamHandpickedAdapter = StreamHandpickedAdapter(streamListForHandpicked)
        binding.recyclerviewStreamHandpicked.adapter = streamHandpickedAdapter
    }

    private fun readDataFromFirebase() {

        //handPickedRecyclerview
        databaseForHandPicked.addValueEventListener(object :ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {

                if(snapshot.exists()){
                    for (handPickedSnapshot in snapshot.children){

                        val about =    handPickedSnapshot.child("about").value.toString()
                        val age =    handPickedSnapshot.child("age").value.toString()
                        val categoryName =  handPickedSnapshot.child("categoryName").value.toString()
                        val date =   handPickedSnapshot.child("date").value.toString()
                        val language =  handPickedSnapshot.child("language").value.toString()
                        val mainImage =  handPickedSnapshot.child("mainImage").value.toString()
                        val price =  handPickedSnapshot.child("price").value.toString()
                        val thumbImage =  handPickedSnapshot.child("thumbImage").value.toString()
                        val time =   handPickedSnapshot.child("time").value.toString()
                        val title =  handPickedSnapshot.child("title").value.toString()
                        val trailerUrl =  handPickedSnapshot.child("trailerUrl").value.toString()

                        val cast:MutableList<CastModel> = ArrayList<CastModel>()

                        for (castSnapshot in handPickedSnapshot.child("cast").children) {
                            cast.add(castSnapshot.getValue(CastModel::class.java)!!)
                        }

                        val crew:MutableList<CrewModel> = ArrayList<CrewModel>()

                        for (crewSnapshot in handPickedSnapshot.child("crew").children) {
                            crew.add(crewSnapshot.getValue(CrewModel::class.java)!!)
                        }

                        val streamValues = HomeStreamModel(
                            about,age,cast,categoryName,crew,date,language,mainImage,price,
                            thumbImage,time,title,trailerUrl
                        )
                        streamListForHandpicked.add(streamValues)
                    }
                    streamHandpickedAdapter.updateData(streamListForHandpicked)
                }
            }

            override fun onCancelled(error: DatabaseError) {

            }


        })


        //nestedRecyclerview

        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists()){
                    for (userSnapshot in snapshot.children){

                        //  val nestedValue  = userSnapshot.getValue(HomeEventsParentModel::class.java)

                        val streamName = userSnapshot.child("streamName").value.toString()

                        val streamChildList:MutableList<HomeStreamModel> = ArrayList<HomeStreamModel>()

                        for (childSnapshot in userSnapshot.child("childStreamList").children) {

                            val about =    childSnapshot.child("about").value.toString()
                            val age =    childSnapshot.child("age").value.toString()
                            val categoryName =  childSnapshot.child("categoryName").value.toString()
                            val date =   childSnapshot.child("date").value.toString()
                            val language =  childSnapshot.child("language").value.toString()
                            val mainImage =  childSnapshot.child("mainImage").value.toString()
                            val price =  childSnapshot.child("price").value.toString()
                            val thumbImage =  childSnapshot.child("thumbImage").value.toString()
                            val time =   childSnapshot.child("time").value.toString()
                            val title =  childSnapshot.child("title").value.toString()
                            val trailerUrl =  childSnapshot.child("trailerUrl").value.toString()

                            val cast:MutableList<CastModel> = ArrayList<CastModel>()

                            for (castSnapshot in userSnapshot.child("cast").children) {
                                cast.add(castSnapshot.getValue(CastModel::class.java)!!)
                            }

                            val crew:MutableList<CrewModel> = ArrayList<CrewModel>()

                            for (crewSnapshot in userSnapshot.child("crew").children) {
                                crew.add(crewSnapshot.getValue(CrewModel::class.java)!!)
                            }

                            val streamValues = HomeStreamModel(
                                about,age,cast,categoryName,crew,date,language,mainImage,price,
                                thumbImage,time,title,trailerUrl
                            )
                                     streamChildList.add(streamValues)
                        }
                        val streamMovieParentModel = StreamMoviesParentModel(streamName,streamChildList)
                        streamMoviesParentList.add(streamMovieParentModel)

                    }

                    streamMoviesParentAdapter.updateData(streamMoviesParentList)
                    //homeEventsParentList.clear()
                }
            }

            override fun onCancelled(error: DatabaseError) {

            }

        })
        streamMoviesParentAdapter.updateData(streamMoviesParentList)


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        streamMoviesParentList.clear()
        streamListForHandpicked.clear()
    }

}