package com.capstone.alzheimercare.ui.patient.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.capstone.alzheimercare.databinding.FragmentPatientProfileBinding

class ProfileFragment : Fragment() {
    private var _binding: FragmentPatientProfileBinding? = null
    private val binding get() = _binding as FragmentPatientProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentPatientProfileBinding.inflate(inflater, container,false)
        return binding.root
    }
}