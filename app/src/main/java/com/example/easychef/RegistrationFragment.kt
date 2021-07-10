package com.example.easychef

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

class RegistrationFragment : Fragment() {
    private var registerBtn: Button? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        registerBtn = view.findViewById(R.id.registerBtn)
        registerBtn?.setOnClickListener {
            findNavController().navigate(R.id.action_registrationFragment_to_recipeFragment)
        }
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_registration, container, false)
    }
}