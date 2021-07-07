package com.chaithanya.bookmyshow.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.SnapHelper
import com.bumptech.glide.Glide
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.constant.CirclePagerIndicatorDecoration
import com.chaithanya.bookmyshow.constant.Constants.HOME_BEST_OF_IMAGE_EIGHT
import com.chaithanya.bookmyshow.constant.Constants.HOME_BEST_OF_IMAGE_ELEVEN
import com.chaithanya.bookmyshow.constant.Constants.HOME_BEST_OF_IMAGE_FIVE
import com.chaithanya.bookmyshow.constant.Constants.HOME_BEST_OF_IMAGE_FOUR
import com.chaithanya.bookmyshow.constant.Constants.HOME_BEST_OF_IMAGE_NINE
import com.chaithanya.bookmyshow.constant.Constants.HOME_BEST_OF_IMAGE_ONE
import com.chaithanya.bookmyshow.constant.Constants.HOME_BEST_OF_IMAGE_SEVEN
import com.chaithanya.bookmyshow.constant.Constants.HOME_BEST_OF_IMAGE_SIX
import com.chaithanya.bookmyshow.constant.Constants.HOME_BEST_OF_IMAGE_TEN
import com.chaithanya.bookmyshow.constant.Constants.HOME_BEST_OF_IMAGE_THREE
import com.chaithanya.bookmyshow.constant.Constants.HOME_BEST_OF_IMAGE_TWELVE
import com.chaithanya.bookmyshow.constant.Constants.HOME_BEST_OF_IMAGE_TWO
import com.chaithanya.bookmyshow.constant.Constants.HOME_FEATURE_IMAGE_FIVE
import com.chaithanya.bookmyshow.constant.Constants.HOME_FEATURE_IMAGE_FOUR
import com.chaithanya.bookmyshow.constant.Constants.HOME_FEATURE_IMAGE_ONE
import com.chaithanya.bookmyshow.constant.Constants.HOME_FEATURE_IMAGE_SIX
import com.chaithanya.bookmyshow.constant.Constants.HOME_FEATURE_IMAGE_THREE
import com.chaithanya.bookmyshow.constant.Constants.HOME_FEATURE_IMAGE_TWO
import com.chaithanya.bookmyshow.constant.Constants.HOME_HEADER_IMAGE_FIVE
import com.chaithanya.bookmyshow.constant.Constants.HOME_HEADER_IMAGE_FOUR
import com.chaithanya.bookmyshow.constant.Constants.HOME_HEADER_IMAGE_ONE
import com.chaithanya.bookmyshow.constant.Constants.HOME_HEADER_IMAGE_THREE
import com.chaithanya.bookmyshow.constant.Constants.HOME_HEADER_IMAGE_TWO
import com.chaithanya.bookmyshow.constant.Constants.HOME_ONLINE_STREAMING_EVENTS_IMAGE1
import com.chaithanya.bookmyshow.constant.Constants.HOME_ONLINE_STREAMING_EVENTS_IMAGE10
import com.chaithanya.bookmyshow.constant.Constants.HOME_ONLINE_STREAMING_EVENTS_IMAGE2
import com.chaithanya.bookmyshow.constant.Constants.HOME_ONLINE_STREAMING_EVENTS_IMAGE3
import com.chaithanya.bookmyshow.constant.Constants.HOME_ONLINE_STREAMING_EVENTS_IMAGE4
import com.chaithanya.bookmyshow.constant.Constants.HOME_ONLINE_STREAMING_EVENTS_IMAGE5
import com.chaithanya.bookmyshow.constant.Constants.HOME_ONLINE_STREAMING_EVENTS_IMAGE6
import com.chaithanya.bookmyshow.constant.Constants.HOME_ONLINE_STREAMING_EVENTS_IMAGE7
import com.chaithanya.bookmyshow.constant.Constants.HOME_ONLINE_STREAMING_EVENTS_IMAGE8
import com.chaithanya.bookmyshow.constant.Constants.HOME_ONLINE_STREAMING_EVENTS_IMAGE9
import com.chaithanya.bookmyshow.constant.Constants.HOME_STREAM_IMAGE_FIVE
import com.chaithanya.bookmyshow.constant.Constants.HOME_STREAM_IMAGE_FOUR
import com.chaithanya.bookmyshow.constant.Constants.HOME_STREAM_IMAGE_ONE
import com.chaithanya.bookmyshow.constant.Constants.HOME_STREAM_IMAGE_SEVEN
import com.chaithanya.bookmyshow.constant.Constants.HOME_STREAM_IMAGE_SIX
import com.chaithanya.bookmyshow.constant.Constants.HOME_STREAM_IMAGE_THREE
import com.chaithanya.bookmyshow.constant.Constants.HOME_STREAM_IMAGE_TWO
import com.chaithanya.bookmyshow.constant.Constants.PREMIUM_STREAM_IMAGE
import com.chaithanya.bookmyshow.data.model.*
import com.chaithanya.bookmyshow.databinding.FragmentHomeBinding
import com.chaithanya.bookmyshow.ui.adapter.*
import com.chaithanya.bookmyshow.ui.adapter.itemclicklistener.HomeFeaturesItemClickListener
import com.chaithanya.bookmyshow.viewmodel.HomeViewModel
import com.google.firebase.database.*
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(),HomeFeaturesItemClickListener {

    private val viewModel by viewModels<HomeViewModel>()
    private val database = FirebaseDatabase.getInstance().getReference("homeNested")
    private lateinit var homeEventsParentAdapter:HomeEventsParentAdapter

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val homeEventsParentList:MutableList<HomeEventsParentModel> = mutableListOf()
    private val homeHeaderList:MutableList<HomeHeaderModel> = mutableListOf()
    private val homeFeaturesList:MutableList<HomeHeaderModel> = mutableListOf()
    private val homeStreamList:MutableList<HomeStreamModel> = mutableListOf()
    private val homeBestOfList:MutableList<HomeHeaderModel> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        homeEventsParentAdapter = HomeEventsParentAdapter(homeEventsParentList)

       // initData()
        setRecyclerView()
        readDataFromFirebase()

        Glide.with(binding.ivStreamPremium).load(PREMIUM_STREAM_IMAGE).into(binding.ivStreamPremium)

        return binding.root
    }

    private fun readDataFromFirebase() {

        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists()){
                    for (userSnapshot in snapshot.children){

                        //  val nestedValue  = userSnapshot.getValue(HomeEventsParentModel::class.java)

                        val eventName = userSnapshot.child("eventsName").value.toString()

                        val homeEventsChildList:MutableList<HomeEventsChildModel> = ArrayList<HomeEventsChildModel>()

                        for (childSnapshot in userSnapshot.child("childList").children) {

                            val about =    childSnapshot.child("about").value.toString()
                            val categoryName =  childSnapshot.child("categoryName").value.toString()
                            val date =   childSnapshot.child("date").value.toString()
                            val free =   childSnapshot.child("free").value.toString()
                            val imageUrl = childSnapshot.child("imageUrl").value.toString()
                            val interested =  childSnapshot.child("interested").value.toString()
                            val language =  childSnapshot.child("language").value.toString()
                            val price =  childSnapshot.child("price").value.toString()
                            val time =   childSnapshot.child("time").value.toString()
                            val title =  childSnapshot.child("title").value.toString()
                            val venue =  childSnapshot.child("venue").value.toString()
                            val fullImage =  childSnapshot.child("fullImage").value.toString()


                            val artistList:MutableList<ArtistModel> = ArrayList<ArtistModel>()

                            for (artistSnapshot in userSnapshot.child("Artist").children) {
                                artistList.add(artistSnapshot.getValue(ArtistModel::class.java)!!)
                            }

                            val eventsValues = HomeEventsChildModel(imageUrl,title,time,about,date,free,interested,language,price,venue,categoryName,fullImage,artistList)
                            homeEventsChildList.add(eventsValues)
                        }
                        val homeEventsParentModelTemp = HomeEventsParentModel(eventName,homeEventsChildList)
                        homeEventsParentList.add(homeEventsParentModelTemp)

                    }

                    homeEventsParentAdapter.updateData(homeEventsParentList)
                    //homeEventsParentList.clear()
                }
            }

            override fun onCancelled(error: DatabaseError) {

            }

        })
        homeEventsParentAdapter.updateData(homeEventsParentList)

//        viewModel.getEventList().observe(viewLifecycleOwner, Observer {streamList->
//            homeEventsParentAdapter.updateData(streamList)
//        })

    }

    private fun setRecyclerView() {

        // Nested Event Recyclerview
        binding.nestedRecycleView.adapter = homeEventsParentAdapter

        // Header Recyclerview

        val homeHeaderModel = HomeHeaderModel(HOME_HEADER_IMAGE_ONE)
        val homeHeaderModel2 = HomeHeaderModel(HOME_HEADER_IMAGE_TWO)
        val homeHeaderModel3 = HomeHeaderModel(HOME_HEADER_IMAGE_THREE)
        val homeHeaderModel4 = HomeHeaderModel(HOME_HEADER_IMAGE_FOUR)
        val homeHeaderModel5 = HomeHeaderModel(HOME_HEADER_IMAGE_FIVE)
        homeHeaderList.add(homeHeaderModel)
        homeHeaderList.add(homeHeaderModel2)
        homeHeaderList.add(homeHeaderModel3)
        homeHeaderList.add(homeHeaderModel4)
        homeHeaderList.add(homeHeaderModel5)
        val homeHeaderAdapter = HomeHeaderAdapter(homeHeaderList)

        val circlePagerIndicatorDecoration = CirclePagerIndicatorDecoration()
       binding.recyclerviewHeader.addItemDecoration(circlePagerIndicatorDecoration)
        binding.recyclerviewHeader.adapter = homeHeaderAdapter
        val snapHelperForHeaderRecyclerview: SnapHelper = PagerSnapHelper()
        snapHelperForHeaderRecyclerview.attachToRecyclerView(binding.recyclerviewHeader)

        // Features Recyclerview

        val homeFeaturesModel1 = HomeHeaderModel(HOME_FEATURE_IMAGE_ONE)
        val homeFeaturesModel2 = HomeHeaderModel(HOME_FEATURE_IMAGE_TWO)
        val homeFeaturesModel3 = HomeHeaderModel(HOME_FEATURE_IMAGE_THREE)
        val homeFeaturesModel4 = HomeHeaderModel(HOME_FEATURE_IMAGE_FOUR)
        val homeFeaturesModel5 = HomeHeaderModel(HOME_FEATURE_IMAGE_FIVE)
        val homeFeaturesModel6 = HomeHeaderModel(HOME_FEATURE_IMAGE_SIX)

        homeFeaturesList.add(homeFeaturesModel1)
        homeFeaturesList.add(homeFeaturesModel2)
        homeFeaturesList.add(homeFeaturesModel3)
        homeFeaturesList.add(homeFeaturesModel4)
        homeFeaturesList.add(homeFeaturesModel5)
        homeFeaturesList.add(homeFeaturesModel6)
        val homeFeaturesAdapter = HomeFeaturesAdapter(homeFeaturesList,this)
        binding.featuresRecyclerView.adapter = homeFeaturesAdapter


        // Streams Recyclerview


        val homeStreamModel1 = HomeStreamModel(
            thumbImage = HOME_STREAM_IMAGE_ONE,price = "100",categoryName = "Thriller",
            language = "English",time = "1h 52m",
            about = "The true story of the cold war spy",
            title = "The Courier (2021)",date = "25 Jun 2019")
        val homeStreamModel2 = HomeStreamModel(
            thumbImage = HOME_STREAM_IMAGE_ONE,price = "100",categoryName = "Thriller",
            language = "English",time = "1h 52m",
            about = "The true story of the cold war spy",
            title = "The Courier (2021)",date = "25 Jun 2019")
        val homeStreamModel3 = HomeStreamModel(
            thumbImage = HOME_STREAM_IMAGE_TWO,price = "100",categoryName = "Thriller",
            language = "English",time = "1h 52m",
            about = "The true story of the cold war spy",
            title = "The Courier (2021)",date = "25 Jun 2019")
        val homeStreamModel4 = HomeStreamModel(
            thumbImage = HOME_STREAM_IMAGE_THREE,price = "100",categoryName = "Thriller",
            language = "English",time = "1h 52m",
            about = "The true story of the cold war spy",
            title = "The Courier (2021)",date = "25 Jun 2019")
        val homeStreamModel5 = HomeStreamModel(
            thumbImage = HOME_STREAM_IMAGE_FOUR,price = "100",categoryName = "Thriller",
            language = "English",time = "1h 52m",
            about = "The true story of the cold war spy",
            title = "The Courier (2021)",date = "25 Jun 2019")
        val homeStreamModel6 = HomeStreamModel(
            thumbImage = HOME_STREAM_IMAGE_FIVE,price = "100",categoryName = "Thriller",
            language = "English",time = "1h 52m",
            about = "The true story of the cold war spy",
            title = "The Courier (2021)",date = "25 Jun 2019")
        val homeStreamModel7 = HomeStreamModel(
            thumbImage = HOME_STREAM_IMAGE_SIX,price = "100",categoryName = "Thriller",
            language = "English",time = "1h 52m",
            about = "The true story of the cold war spy",
            title = "The Courier (2021)",date = "25 Jun 2019")



        homeStreamList.add(homeStreamModel1)
        homeStreamList.add(homeStreamModel2)
        homeStreamList.add(homeStreamModel3)
        homeStreamList.add(homeStreamModel4)
        homeStreamList.add(homeStreamModel5)
        homeStreamList.add(homeStreamModel6)
        homeStreamList.add(homeStreamModel7)

        val homeStreamAdapter = HomeStreamAdapter(homeStreamList)
        binding.recyclerviewStream.adapter = homeStreamAdapter
        val snapHelperForStreamRecycler: SnapHelper = PagerSnapHelper()
        val circlePagerIndicatorDecoration2 = CirclePagerIndicatorDecoration()
        binding.recyclerviewStream.addItemDecoration(circlePagerIndicatorDecoration2)
        snapHelperForStreamRecycler.attachToRecyclerView(binding.recyclerviewStream)


        // Home BestOfEntertainment Recyclerview

        val homeBestOfModel1 = HomeHeaderModel(HOME_BEST_OF_IMAGE_ONE)
        val homeBestOfModel2 = HomeHeaderModel(HOME_BEST_OF_IMAGE_TWO)
        val homeBestOfModel3 = HomeHeaderModel(HOME_BEST_OF_IMAGE_THREE)
        val homeBestOfModel4 = HomeHeaderModel(HOME_BEST_OF_IMAGE_FOUR)
        val homeBestOfModel5 = HomeHeaderModel(HOME_BEST_OF_IMAGE_FIVE)
        val homeBestOfModel6 = HomeHeaderModel(HOME_BEST_OF_IMAGE_SIX)
        val homeBestOfModel7 = HomeHeaderModel(HOME_BEST_OF_IMAGE_SEVEN)
        val homeBestOfModel8 = HomeHeaderModel(HOME_BEST_OF_IMAGE_EIGHT)
        val homeBestOfModel9 = HomeHeaderModel(HOME_BEST_OF_IMAGE_NINE)
        val homeBestOfModel10 = HomeHeaderModel(HOME_BEST_OF_IMAGE_TEN)
        val homeBestOfModel11 = HomeHeaderModel(HOME_BEST_OF_IMAGE_ELEVEN)
        val homeBestOfModel12 = HomeHeaderModel(HOME_BEST_OF_IMAGE_TWELVE)

        homeBestOfList.add(homeBestOfModel1)
        homeBestOfList.add(homeBestOfModel2)
        homeBestOfList.add(homeBestOfModel3)
        homeBestOfList.add(homeBestOfModel4)
        homeBestOfList.add(homeBestOfModel5)
        homeBestOfList.add(homeBestOfModel6)
        homeBestOfList.add(homeBestOfModel7)
        homeBestOfList.add(homeBestOfModel8)
        homeBestOfList.add(homeBestOfModel9)
        homeBestOfList.add(homeBestOfModel10)
        homeBestOfList.add(homeBestOfModel11)
        homeBestOfList.add(homeBestOfModel12)

        val homeBestOfAdapter = HomeBestOfAdapter(homeBestOfList)
        binding.recyclerviewBestOfEntertainment.layoutManager = GridLayoutManager(requireContext(),2,GridLayoutManager.HORIZONTAL,false)
        binding.recyclerviewBestOfEntertainment.adapter = homeBestOfAdapter


    }

    private fun initData() {

        val homeEventsChildModel1 = HomeEventsChildModel(
            HOME_ONLINE_STREAMING_EVENTS_IMAGE1,"Dear Ishq-A Festival of Kissey,Kahaniyaan & Poetry"
            ,"Sat, 17 Jul","Poetry")
        val homeEventsChildModel2 = HomeEventsChildModel(
            HOME_ONLINE_STREAMING_EVENTS_IMAGE2,"Dear Ishq-A Festival of Kissey,Kahaniyaan & Poetry"
            ,"Sat, 17 Jul","Poetry")
        val homeEventsChildModel3 = HomeEventsChildModel(
            HOME_ONLINE_STREAMING_EVENTS_IMAGE3,"Dear Ishq-A Festival of Kissey,Kahaniyaan & Poetry"
            ,"Sat, 17 Jul","Poetry")

        val homeEventsChildModel4 = HomeEventsChildModel(
            HOME_ONLINE_STREAMING_EVENTS_IMAGE4,"Dear Ishq-A Festival of Kissey,Kahaniyaan & Poetry"
            ,"Sat, 17 Jul","Poetry")

        val homeEventsChildModel5 = HomeEventsChildModel(
            HOME_ONLINE_STREAMING_EVENTS_IMAGE5,"Dear Ishq-A Festival of Kissey,Kahaniyaan & Poetry"
            ,"Sat, 17 Jul","Poetry")

        val homeEventsChildModel6 = HomeEventsChildModel(
            HOME_ONLINE_STREAMING_EVENTS_IMAGE6,"Dear Ishq-A Festival of Kissey,Kahaniyaan & Poetry"
            ,"Sat, 17 Jul","Poetry")

        val homeEventsChildModel7 = HomeEventsChildModel(
            HOME_ONLINE_STREAMING_EVENTS_IMAGE7,"Dear Ishq-A Festival of Kissey,Kahaniyaan & Poetry"
            ,"Sat, 17 Jul","Poetry")

        val homeEventsChildModel8 = HomeEventsChildModel(
            HOME_ONLINE_STREAMING_EVENTS_IMAGE8,"Dear Ishq-A Festival of Kissey,Kahaniyaan & Poetry"
            ,"Sat, 17 Jul","Poetry")

        val homeEventsChildModel9 = HomeEventsChildModel(
            HOME_ONLINE_STREAMING_EVENTS_IMAGE9,"Dear Ishq-A Festival of Kissey,Kahaniyaan & Poetry"
            ,"Sat, 17 Jul","Poetry")

        val homeEventsChildModel10 = HomeEventsChildModel(
            HOME_ONLINE_STREAMING_EVENTS_IMAGE10,"Dear Ishq-A Festival of Kissey,Kahaniyaan & Poetry"
            ,"Sat, 17 Jul","Poetry")

        val homeEventsChildModel11 = HomeEventsChildModel(
            HOME_ONLINE_STREAMING_EVENTS_IMAGE1,"Dear Ishq-A Festival of Kissey,Kahaniyaan & Poetry"
            ,"Sat, 17 Jul","Poetry")

        val homeEventsChildModelList1:MutableList<HomeEventsChildModel> = mutableListOf()
        val homeEventsChildModelList2:MutableList<HomeEventsChildModel> = mutableListOf()
        val homeEventsChildModelList3:MutableList<HomeEventsChildModel> = mutableListOf()
        val homeEventsChildModelList4:MutableList<HomeEventsChildModel> = mutableListOf()
        val homeEventsChildModelList5:MutableList<HomeEventsChildModel> = mutableListOf()
        val homeEventsChildModelList6:MutableList<HomeEventsChildModel> = mutableListOf()
        val homeEventsChildModelList7:MutableList<HomeEventsChildModel> = mutableListOf()

        homeEventsChildModelList1.add(homeEventsChildModel1)
        homeEventsChildModelList1.add(homeEventsChildModel2)
        homeEventsChildModelList1.add(homeEventsChildModel3)
        homeEventsChildModelList1.add(homeEventsChildModel1)
        homeEventsChildModelList1.add(homeEventsChildModel2)
        homeEventsChildModelList1.add(homeEventsChildModel3)

        homeEventsChildModelList2.add(homeEventsChildModel4)
        homeEventsChildModelList2.add(homeEventsChildModel5)
        homeEventsChildModelList2.add(homeEventsChildModel6)
        homeEventsChildModelList2.add(homeEventsChildModel4)
        homeEventsChildModelList2.add(homeEventsChildModel5)
        homeEventsChildModelList2.add(homeEventsChildModel6)

        homeEventsChildModelList3.add(homeEventsChildModel7)
        homeEventsChildModelList3.add(homeEventsChildModel8)
        homeEventsChildModelList3.add(homeEventsChildModel9)
        homeEventsChildModelList3.add(homeEventsChildModel7)
        homeEventsChildModelList3.add(homeEventsChildModel8)
        homeEventsChildModelList3.add(homeEventsChildModel9)

        homeEventsChildModelList4.add(homeEventsChildModel10)
        homeEventsChildModelList4.add(homeEventsChildModel2)
        homeEventsChildModelList4.add(homeEventsChildModel3)
        homeEventsChildModelList4.add(homeEventsChildModel10)
        homeEventsChildModelList4.add(homeEventsChildModel2)
        homeEventsChildModelList4.add(homeEventsChildModel3)

        homeEventsChildModelList5.add(homeEventsChildModel4)
        homeEventsChildModelList5.add(homeEventsChildModel5)
        homeEventsChildModelList5.add(homeEventsChildModel6)
        homeEventsChildModelList5.add(homeEventsChildModel4)
        homeEventsChildModelList5.add(homeEventsChildModel5)
        homeEventsChildModelList5.add(homeEventsChildModel6)

        homeEventsChildModelList6.add(homeEventsChildModel7)
        homeEventsChildModelList6.add(homeEventsChildModel8)
        homeEventsChildModelList6.add(homeEventsChildModel9)
        homeEventsChildModelList6.add(homeEventsChildModel7)
        homeEventsChildModelList6.add(homeEventsChildModel8)
        homeEventsChildModelList6.add(homeEventsChildModel9)



        val homeEventsParentModel1 = HomeEventsParentModel(
            "Online Streaming Events",homeEventsChildModelList1)

        val homeEventsParentModel2 = HomeEventsParentModel(
            "Outdoor Events",homeEventsChildModelList2)

        val homeEventsParentModel3 = HomeEventsParentModel(
            "Laughter Therapy",homeEventsChildModelList3)

        val homeEventsParentModel4 = HomeEventsParentModel(
            "The Latest Plays",homeEventsChildModelList4)

        val homeEventsParentModel5 = HomeEventsParentModel(
            "Popular Events",homeEventsChildModelList5)

        val homeEventsParentModel6 = HomeEventsParentModel(
            "The Games & Sport Events",homeEventsChildModelList6)

        val homeEventsParentModel7 = HomeEventsParentModel(
            "Explore Fun Activities ",homeEventsChildModelList7)

        homeEventsParentList.apply {
            add(homeEventsParentModel1)
            add(homeEventsParentModel2)
            add(homeEventsParentModel3)
            add(homeEventsParentModel4)
            add(homeEventsParentModel5)
            add(homeEventsParentModel6)
            add(homeEventsParentModel7)
        }

    }





    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        homeEventsParentList.clear()
        homeHeaderList.clear()
        homeFeaturesList.clear()
        homeStreamList.clear()
        homeBestOfList.clear()
    }

    override fun onFeaturesItemClicked(position: Int) {
        if (position==0){

        }else if (position==1){
            findNavController().navigate(R.id.action_homeFragment_to_streamActivity)
        }else if(position==2){
            findNavController().navigate(R.id.action_homeFragment_to_eventsActivity)
        }
    }

}