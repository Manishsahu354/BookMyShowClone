package com.chaithanya.bookmyshow.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.databinding.FragmentStreamMovieBinding
import com.chaithanya.bookmyshow.ui.adapter.ArtistAdapter
import com.chaithanya.bookmyshow.ui.adapter.CastAdapter
import com.chaithanya.bookmyshow.ui.adapter.CrewAdapter


class StreamMovieFragment : Fragment() {

    private val args by navArgs<StreamMovieFragmentArgs>()
    private var _binding:FragmentStreamMovieBinding? = null
    private val binding get() =  _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

       _binding =  FragmentStreamMovieBinding.inflate(inflater, container, false)


        val streamModel = args.stream
        Glide.with(requireContext()).load(streamModel.mainImage).into(binding.imageMovie)
        binding.headerMovieTitle.text = streamModel.title
        binding.buttonPay.text = "BUY ₹${streamModel.price}"
        binding.tvLanguage.text = streamModel.language
        binding.tvDate.text = streamModel.date
        binding.tvTime.text = streamModel.time
        binding.tvCategory.text = streamModel.categoryName
        binding.tvAge.text = streamModel.age
        binding.tvAbout.text = streamModel.about



        val castList = streamModel.cast
        val crewList = streamModel.crew

        if ( castList != null && castList.size != 0){


            binding.tvCast.visibility = View.VISIBLE
            binding.recyclerviewCast.visibility = View.VISIBLE

            val castAdapter = CastAdapter(castList)
            binding.recyclerviewCast.adapter = castAdapter

        }else{

            binding.tvCast.visibility = View.GONE
            binding.recyclerviewCast.visibility = View.GONE

        }

        if ( crewList != null && crewList.size != 0){


            binding.tvCrew.visibility = View.VISIBLE
            binding.recyclerviewCrew.visibility = View.VISIBLE

            val crewAdapter = CrewAdapter(crewList)
            binding.recyclerviewCrew.adapter = crewAdapter

        }else{

            binding.tvCrew.visibility = View.GONE
            binding.recyclerviewCrew.visibility = View.GONE

        }

        binding.imageBack.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.imageShare.setOnClickListener {

        }
        binding.llPlayTrailer.setOnClickListener {
            findNavController().navigate(StreamMovieFragmentDirections
                .actionStreamMovieFragment2ToYoutubePlayerActivity2(streamModel.trailerUrl!!))
        }
        binding.buttonPay.setOnClickListener {

        }


        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}