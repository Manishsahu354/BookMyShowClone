package com.chaithanya.bookmyshow.ui.fragment

import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.data.model.ArtistModel
import com.chaithanya.bookmyshow.data.model.HomeEventsChildModel
import com.chaithanya.bookmyshow.data.model.HomeEventsParentModel
import com.chaithanya.bookmyshow.databinding.FragmentBuzzBinding
import com.chaithanya.bookmyshow.databinding.FragmentEventsBinding
import com.chaithanya.bookmyshow.ui.adapter.EventsAdapter
import com.chaithanya.bookmyshow.ui.adapter.itemclicklistener.EventsItemClickListener
import com.google.firebase.database.*

class EventsFragment : Fragment(),EventsItemClickListener{

    private lateinit var database: DatabaseReference
    private var _binding: FragmentEventsBinding? = null
    private val binding get() = _binding!!

    lateinit var eventAdapter:EventsAdapter
    private val eventsList:MutableList<HomeEventsChildModel> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding =  FragmentEventsBinding.inflate(inflater, container, false)

        setUpRecyclerView()
        readDataFromFirebase()

        binding.imageBack.setOnClickListener {
            requireActivity().finish()
        }

        return binding.root
    }

    private fun setUpRecyclerView() {
        eventAdapter = EventsAdapter(eventsList,this)
        binding.eventsRecyclerview.layoutManager = GridLayoutManager(requireContext(),2)
        binding.eventsRecyclerview.adapter =  eventAdapter
    }

    private fun readDataFromFirebase() {
        database = FirebaseDatabase.getInstance().getReference("bookmyshow").child("eventList")

        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()) {
                    for (userSnapshot in snapshot.children) {

//                        val nestedValue = userSnapshot.getValue(HomeEventsChildModel::class.java)

                           val about =userSnapshot.child("about").value.toString()
                           val categoryName =userSnapshot.child("categoryName").value.toString()
                           val date =userSnapshot.child("date").value.toString()
                           val free =userSnapshot.child("free").value.toString()
                           val imageUrl =userSnapshot.child("imageUrl").value.toString()
                           val interested =userSnapshot.child("interested").value.toString()
                           val language =userSnapshot.child("language").value.toString()
                           val price =userSnapshot.child("price").value.toString()
                           val time =userSnapshot.child("time").value.toString()
                           val title =userSnapshot.child("title").value.toString()
                           val venue =userSnapshot.child("venue").value.toString()
                           val fullImage =userSnapshot.child("fullImage").value.toString()

                            val artistList:MutableList<ArtistModel>? =ArrayList<ArtistModel>()

                        for (artistSnapshot in userSnapshot.child("Artist").children) {
                            artistList?.add(artistSnapshot.getValue(ArtistModel::class.java)!!)
                        }

                        val eventsValues = HomeEventsChildModel(imageUrl,title,time,about,date,free,interested,language,price,venue,categoryName,fullImage,artistList)

                        eventsList.add(eventsValues)
//                      // homeEventsParentAdapter.notifyDataSetChanged()
                    }
                    eventAdapter.updateData(eventsList)


                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })

    }

            override fun onDestroyView() {
            super.onDestroyView()
             eventsList.clear()
            _binding = null
        }

    override fun onEventsItemClicked(childModel: HomeEventsChildModel) {
        findNavController().navigate(EventsFragmentDirections.actionEventsFragmentToEventDetailsFragment2(childModel))
    }

}