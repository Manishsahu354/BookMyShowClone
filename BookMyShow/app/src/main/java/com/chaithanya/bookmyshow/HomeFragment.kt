package com.chaithanya.bookmyshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.SnapHelper
import com.bumptech.glide.Glide
import com.chaithanya.bookmyshow.Constants.HOME_FEATURE_IMAGE_FIVE
import com.chaithanya.bookmyshow.Constants.HOME_FEATURE_IMAGE_FOUR
import com.chaithanya.bookmyshow.Constants.HOME_FEATURE_IMAGE_ONE
import com.chaithanya.bookmyshow.Constants.HOME_FEATURE_IMAGE_SIX
import com.chaithanya.bookmyshow.Constants.HOME_FEATURE_IMAGE_THREE
import com.chaithanya.bookmyshow.Constants.HOME_FEATURE_IMAGE_TWO
import com.chaithanya.bookmyshow.Constants.HOME_HEADER_IMAGE_FIVE
import com.chaithanya.bookmyshow.Constants.HOME_HEADER_IMAGE_FOUR
import com.chaithanya.bookmyshow.Constants.HOME_HEADER_IMAGE_ONE
import com.chaithanya.bookmyshow.Constants.HOME_HEADER_IMAGE_THREE
import com.chaithanya.bookmyshow.Constants.HOME_HEADER_IMAGE_TWO
import com.chaithanya.bookmyshow.Constants.PREMIUM_STREAM_IMAGE
import com.chaithanya.bookmyshow.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {


    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val homeEventsParentList:MutableList<HomeEventsParentModel> = mutableListOf()
    private val homeHeaderList:MutableList<HomeHeaderModel> = mutableListOf()
    private val homeFeaturesList:MutableList<HomeHeaderModel> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        initData()
        setRecyclerView()

        Glide.with(binding.ivStreamPremium).load(PREMIUM_STREAM_IMAGE).into(binding.ivStreamPremium)

        return binding.root
    }

    private fun setRecyclerView() {

        // Nested Event Recyclerview
        val homeEventsParentAdapter = HomeEventsParentAdapter(homeEventsParentList)
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

        binding.recyclerviewHeader.addItemDecoration(CirclePagerIndicatorDecoration())
        binding.recyclerviewHeader.adapter = homeHeaderAdapter
        val snapHelper: SnapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(binding.recyclerviewHeader)

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
        val homeFeaturesAdapter = HomeFeaturesAdapter(homeFeaturesList)
        binding.featuresRecyclerView.adapter = homeFeaturesAdapter
    }

    private fun initData() {

        val homeEventsChildModel = HomeEventsChildModel(
            "https://images.unsplash.com/photo-1541963463532-d68292c34b19?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8Mnx8fGVufDB8fHx8&w=1000&q=80","Dear Ishq-A Festival of Kissey,Kahaniyaan & Poetry"
            ,"Sat, 17 Jul","Poetry")
        val homeEventsChildModel2 = HomeEventsChildModel(
            "https://images.unsplash.com/photo-1541963463532-d68292c34b19?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8Mnx8fGVufDB8fHx8&w=1000&q=80","Dear Ishq-A Festival of Kissey,Kahaniyaan & Poetry"
            ,"Sat, 17 Jul","Poetry")
        val homeEventsChildModel3 = HomeEventsChildModel(
            "https://images.unsplash.com/photo-1541963463532-d68292c34b19?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8Mnx8fGVufDB8fHx8&w=1000&q=80","Dear Ishq-A Festival of Kissey,Kahaniyaan & Poetry"
            ,"Sat, 17 Jul","Poetry")
        val homeEventsChildModelList:MutableList<HomeEventsChildModel> = mutableListOf()
        homeEventsChildModelList.add(homeEventsChildModel)
        homeEventsChildModelList.add(homeEventsChildModel2)
        homeEventsChildModelList.add(homeEventsChildModel3)

        val homeEventsParentModel = HomeEventsParentModel(
            "Online Streaming Events",homeEventsChildModelList)

        homeEventsParentList.add(homeEventsParentModel)
        homeEventsParentList.add(homeEventsParentModel)
        homeEventsParentList.add(homeEventsParentModel)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}