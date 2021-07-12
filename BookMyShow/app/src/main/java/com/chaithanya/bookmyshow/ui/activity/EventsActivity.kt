package com.chaithanya.bookmyshow.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chaithanya.bookmyshow.databinding.ActivityEventsBinding

class EventsActivity : AppCompatActivity(){

    private lateinit var binding:ActivityEventsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEventsBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}