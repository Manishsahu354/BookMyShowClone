package com.chaithanya.bookmyshow.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.chaithanya.bookmyshow.MainActivity
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.data.local.BookedEventEntity
import com.chaithanya.bookmyshow.data.model.ArtistModel
import com.chaithanya.bookmyshow.data.model.HomeEventsChildModel
import com.chaithanya.bookmyshow.data.model.StreamMoviesParentModel
import com.chaithanya.bookmyshow.databinding.ActivityPaymentEventBinding
import com.chaithanya.bookmyshow.databinding.ActivityPaymentSuccessfulBinding
import com.chaithanya.bookmyshow.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PaymentSuccessfulActivity : AppCompatActivity() {

    private val viewModel by viewModels<HomeViewModel>()

    private lateinit var binding: ActivityPaymentSuccessfulBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPaymentSuccessfulBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val eventName = intent.getStringExtra("eventName")
        val date = intent.getStringExtra("date")
        val quantity = intent.getStringExtra("quantity")
        val amount = intent.getStringExtra("amount")
        val venue = intent.getStringExtra("venue")
        val imageUrl = intent.getStringExtra("image")


        val bookedEventEntity = BookedEventEntity(eventName!!,imageUrl!!,
            date!!,quantity!!,amount!!,venue!!)

        viewModel.insertBookedEvent(bookedEventEntity)

//        viewModel.getAllBookedEvent().observe(this, Observer {
//            it[0]
//        })


        binding.eventTitle.text = eventName
        binding.eventsVenue.text = venue
        binding.eventDate.text = date
        binding.quantity.text = "Quantity: $quantity"
        binding.tvAmount.text = "Rs. $amount.00"

        binding.btnGoHome.setOnClickListener {

            val intent = Intent(this,MainActivity::class.java)

            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }
}