package com.chaithanya.bookmyshow.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.databinding.ActivityMainBinding
import com.chaithanya.bookmyshow.databinding.ActivityStreamBinding
import com.razorpay.PaymentResultListener

class StreamActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStreamBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStreamBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}