package com.example.easychef

import android.content.res.Configuration
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.fragment.findNavController

class SettingsFragment : Fragment() {

    private var logOutBtn: Button? = null
    private lateinit var switchThemeButton: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        logOutBtn = view.findViewById(R.id.LogOutButton)
        logOutBtn?.setOnClickListener {
            findNavController().navigate(R.id.action_settingsFragment_to_authorizationFragment)
        }
        super.onViewCreated(view, savedInstanceState)

        switchThemeButton = view.findViewById(R.id.switch_theme_button)
        switchThemeButton.setOnClickListener {
            when(resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK){
                Configuration.UI_MODE_NIGHT_YES->
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                Configuration.UI_MODE_NIGHT_NO->
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
        }

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }
}

