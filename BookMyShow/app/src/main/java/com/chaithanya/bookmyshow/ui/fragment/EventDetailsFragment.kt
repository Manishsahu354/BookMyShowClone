package com.chaithanya.bookmyshow.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.chaithanya.bookmyshow.databinding.FragmentEventDetailsBinding


class EventDetailsFragment : Fragment() {

    private val args by navArgs<EventDetailsFragmentArgs>()
    private var _binding: FragmentEventDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding =  FragmentEventDetailsBinding.inflate(inflater, container, false)


        val eventModel = args.eventmodel

        Glide.with(requireContext()).load(eventModel.fullImage).into(binding.imageStream)
        binding.headerStreamTitle.text = eventModel.title
        binding.eventsTitle.text = eventModel.title
        binding.eventsCategory.text = eventModel.categoryName
        binding.eventsDate.text = eventModel.date
        binding.eventsVenue.text = eventModel.venue

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}