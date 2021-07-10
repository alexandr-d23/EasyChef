package com.example.easychef

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var controller: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        controller = findNavController(R.id.nav_host_fragment)

        val bnvMain = findViewById<BottomNavigationView>(R.id.nav_view)
        bnvMain.setupWithNavController(controller)
        visibilityNavElements(controller)
    }
    private fun visibilityNavElements(navController: NavController) {
        val bnvMain = findViewById<BottomNavigationView>(R.id.nav_view)
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.authorizationFragment,
                R.id.registrationFragment -> bnvMain?.visibility = View.GONE
                else -> bnvMain?.visibility = View.VISIBLE
            }
        }
    }
}