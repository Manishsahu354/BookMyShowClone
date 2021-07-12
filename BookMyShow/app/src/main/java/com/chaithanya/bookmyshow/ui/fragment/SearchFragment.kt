package com.chaithanya.bookmyshow.ui.fragment

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.databinding.FragmentSearchBinding
import com.razorpay.Checkout
import org.json.JSONObject


class SearchFragment : Fragment() {

    private var _binding:FragmentSearchBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding =  FragmentSearchBinding.inflate(inflater, container, false)




        return  binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}