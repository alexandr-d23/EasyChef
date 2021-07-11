package com.example.easychef

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.easychef.databinding.FragmentRegistrationBinding

class RegistrationFragment : Fragment() {
    private var _binding: FragmentRegistrationBinding? = null
    private val binding get() = _binding!!
    private var emailExist = false
    private var passwordExist = false
    private var nameExist = false
    private var repeatPassCorrect = false

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.registerBtn.isEnabled=false
        binding.regMail.addTextChangedListener { text ->
            emailExist=text.toString().isNotBlank()
            enableRegisterButton()
        }
        binding.regPassword.addTextChangedListener { text ->
            passwordExist=text.toString().isNotBlank()
            enableRegisterButton()
        }
        binding.regUserName.addTextChangedListener { text ->
            nameExist=text.toString().isNotBlank()
            enableRegisterButton()
        }
        binding.regPasswordAgain.addTextChangedListener { text ->
            checkPassRepeat()
            enableRegisterButton()
        }
        binding.registerBtn.setOnClickListener {
            rememberUser()
            findNavController().navigate(R.id.action_registrationFragment_to_recipeFragment)
        }
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentRegistrationBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    private fun enableRegisterButton() {
        binding.registerBtn.isEnabled = emailExist && passwordExist &&nameExist&&repeatPassCorrect
    }

    private fun checkPassRepeat(){
        repeatPassCorrect = binding.regPassword.text.toString()==binding.regPasswordAgain.text.toString()
    }

    private fun rememberUser(){
        val sharedPref:UserInfoSharedPref=UserInfoSharedPref(requireContext())
        val nameAndPass = hashSetOf(binding.regUserName.toString(),binding.regPassword.toString())
        sharedPref.save(binding.regMail.toString(), nameAndPass)
    }
}