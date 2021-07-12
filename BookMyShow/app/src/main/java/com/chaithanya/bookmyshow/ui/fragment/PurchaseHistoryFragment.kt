package com.chaithanya.bookmyshow.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.data.local.BookedEventEntity
import com.chaithanya.bookmyshow.data.model.HomeEventsChildModel
import com.chaithanya.bookmyshow.databinding.FragmentHomeBinding
import com.chaithanya.bookmyshow.databinding.FragmentPurchaseHistoryBinding
import com.chaithanya.bookmyshow.ui.adapter.PurchaseHistoryAdapter
import com.chaithanya.bookmyshow.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PurchaseHistoryFragment : Fragment() {

    private var _binding: FragmentPurchaseHistoryBinding? = null
    private val binding get() = _binding!!

    private val bookedEventList:MutableList<BookedEventEntity> = mutableListOf()

    private val viewModel by viewModels<HomeViewModel>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding =  FragmentPurchaseHistoryBinding.inflate(inflater, container, false)

        binding.imageBack.setOnClickListener {
            findNavController().popBackStack()
        }

        val adapter = PurchaseHistoryAdapter(bookedEventList)
        binding.bookedEventsRecyclerview.layoutManager = LinearLayoutManager(requireContext())
        binding.bookedEventsRecyclerview.adapter = adapter

        viewModel.getAllBookedEvent().observe(viewLifecycleOwner, Observer {

            adapter.updateData(it)

        })

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}