package com.chaithanya.bookmyshow.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.databinding.FragmentStreamBinding

class StreamFragment : Fragment() {

    private var _binding:FragmentStreamBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       _binding =  FragmentStreamBinding.inflate(inflater, container, false)

        binding.imageBack.setOnClickListener {
           requireActivity().finish()
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}