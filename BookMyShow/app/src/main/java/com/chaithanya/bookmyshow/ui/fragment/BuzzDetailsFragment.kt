package com.chaithanya.bookmyshow.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.databinding.FragmentBuzzDetailsBinding
import kotlinx.coroutines.*
import kotlin.concurrent.thread


class BuzzDetailsFragment : Fragment() {

    private var _binding:FragmentBuzzDetailsBinding? = null
    private val binding get() = _binding!!
    private val args by navArgs<BuzzDetailsFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding =  FragmentBuzzDetailsBinding.inflate(inflater, container, false)

        binding.imageBack.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.buzzWebView.loadUrl(args.buzzWebUrl)
        val webSettings = binding.buzzWebView.settings
        webSettings.javaScriptEnabled = true
        binding.buzzWebView.webViewClient = WebViewClient()
        CoroutineScope(Dispatchers.Main).launch {
            delay(2000)
            binding.imageBack.visibility = View.VISIBLE
        }


        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}