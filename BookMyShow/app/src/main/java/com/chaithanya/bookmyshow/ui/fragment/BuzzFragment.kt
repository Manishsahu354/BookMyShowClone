package com.chaithanya.bookmyshow.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chaithanya.bookmyshow.data.model.BuzzArticlesModel
import com.chaithanya.bookmyshow.databinding.FragmentBuzzBinding
import com.chaithanya.bookmyshow.databinding.FragmentHomeBinding
import com.chaithanya.bookmyshow.ui.adapter.itemclicklistener.BuzzArticleItemClickListener

class BuzzFragment : Fragment(),BuzzArticleItemClickListener {


    private var _binding: FragmentBuzzBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding =  FragmentBuzzBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onArticleItemClicked(buzzArticlesModel: BuzzArticlesModel) {

    }

}