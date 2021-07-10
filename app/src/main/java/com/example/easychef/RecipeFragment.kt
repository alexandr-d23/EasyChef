package com.example.easychef

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton


class RecipeFragment : Fragment() {
    private var fabBtn: FloatingActionButton? = null
    private var recipeButton: Button? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fabBtn = view.findViewById(R.id.floatingActionButton)
        fabBtn?.setOnClickListener {
            findNavController().navigate(R.id.action_recipeFragment_to_addRecipeFragment)
        }

        recipeButton = view.findViewById(R.id.button2)
        recipeButton?.setOnClickListener {
            findNavController().navigate(R.id.action_recipeFragment_to_recipePageFragment)
        }
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recipe, container, false)
    }
}