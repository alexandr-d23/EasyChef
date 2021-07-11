package com.example.easychef
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.easychef.databinding.FragmentAuthorizationBinding
import com.google.android.material.textfield.TextInputLayout

class authorizationFragment : Fragment() {
    private var _binding: FragmentAuthorizationBinding? = null
    private val binding get() = _binding!!
    private var emailExist = false
    private var passwordExist = false


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.LoginButton.isEnabled=false
        binding.logEmail.addTextChangedListener { text ->
            emailExist=text.toString().isNotBlank()
            enableLoginButton()
        }
        binding.logPassword.addTextChangedListener { text ->
            passwordExist=text.toString().isNotBlank()
            enableLoginButton()
        }

        binding.newAccountBtn.setOnClickListener {
            findNavController().navigate(R.id.action_authorizationFragment_to_registrationFragment)
        }
        binding.LoginButton.setOnClickListener {
            findNavController().navigate(R.id.action_authorizationFragment_to_recipeFragment)
        }
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAuthorizationBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

   private fun enableLoginButton() {
       binding.LoginButton.isEnabled = emailExist && passwordExist
    }
}