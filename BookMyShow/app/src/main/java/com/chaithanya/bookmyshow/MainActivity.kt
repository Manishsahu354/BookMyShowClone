package com.chaithanya.bookmyshow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.chaithanya.bookmyshow.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navController = findNavController(R.id.navHostFragment)

        NavigationUI.setupWithNavController(binding.bottomNav, navController)

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id)
            {
                R.id.eventDetailsFragmentFromHome -> hideBottomNav()
                else -> showBottomNav()
            }
        }
    }


    private fun showBottomNav()
    {
        binding.bottomNav.visibility = View.VISIBLE
    }

    private fun hideBottomNav()
    {
        binding.bottomNav.visibility = View.GONE
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.bottomNav.visibility = View.GONE
    }

}