package com.chaithanya.bookmyshow.ui.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.databinding.FragmentEventDetailsBinding
import com.chaithanya.bookmyshow.ui.adapter.ArtistAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView


class EventDetailsFragmentFromHome : Fragment() {

    private val args by navArgs<EventDetailsFragmentFromHomeArgs>()
    private var _binding: FragmentEventDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding =  FragmentEventDetailsBinding.inflate(inflater, container, false)

        binding.imageBack.setOnClickListener {
            findNavController().popBackStack()
        }


        val eventModel = args.events

        Glide.with(requireContext()).load(eventModel.fullImage).into(binding.imageStream)
        binding.headerStreamTitle.text = eventModel.title
        binding.eventsTitle.text = eventModel.title
        binding.eventsCategory.text = eventModel.categoryName
        binding.eventsDate.text = eventModel.date
        binding.eventsVenue.text = eventModel.venue
        binding.tvTime.text = eventModel.time
        binding.tvLanguage.text = eventModel.language
        binding.tvAboutContent.text = eventModel.about

        if (eventModel.free.equals("false")){
            binding.eventPrice.text = "₹ ${eventModel.price}"
            binding.eventPrice.visibility = View.VISIBLE
        }else{
            binding.eventPrice.text = "Free"
        }

        val artistList = eventModel.Artist

        if ( artistList!= null && artistList.size != 0 ){


            binding.tvArtist.visibility = View.VISIBLE
            binding.recyclerviewArtist.visibility = View.VISIBLE

            val artistAdapter = ArtistAdapter(artistList)
            binding.recyclerviewArtist.adapter = artistAdapter

        }else{

            binding.tvArtist.visibility = View.GONE
            binding.recyclerviewArtist.visibility = View.GONE

        }

        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}