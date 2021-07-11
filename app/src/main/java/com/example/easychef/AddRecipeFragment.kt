package com.example.easychef

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.easychef.databinding.FragmentAddRecipeBinding
import com.example.easychef.databinding.FragmentRegistrationBinding

class AddRecipeFragment : Fragment() {
    private var _binding: FragmentAddRecipeBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonAddUrl.setOnClickListener {
            if(binding.imageUrl.text.isNotBlank()) {
                Glide.with(this).load(binding.imageUrl.text.toString()).into(binding.imageView)
                binding.imageUrl.text.clear()
            }
        }
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddRecipeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }
}