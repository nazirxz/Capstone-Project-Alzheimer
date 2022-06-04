package com.capstone.alzheimercare.ui.patient.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.capstone.alzheimercare.R
import com.capstone.alzheimercare.databinding.FragmentPatientHomeBinding
import com.capstone.alzheimercare.ui.MyPreference
import com.capstone.alzheimercare.utils.Utility.dateNow
import com.capstone.alzheimercare.utils.Utility.setImage
import com.capstone.alzheimercare.utils.Utility.simpleText
import org.koin.android.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {
    private lateinit var preference: MyPreference
    private val homeViewModel: HomeViewModel by viewModel()

    private var _binding: FragmentPatientHomeBinding? = null
    private val binding get() = _binding as FragmentPatientHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentPatientHomeBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        preference = MyPreference(requireActivity())

        Log.d("preference", preference.getId())
        binding.tvDate.dateNow()

        homeViewModel.getPatient(preference.getId()).observe(viewLifecycleOwner, {
            if (it.data != null) {
                Log.d("homeFragment", it.data.toString())
                val patient = it.data
                val arr = patient.name.split(" ").toMutableList()
                val text = arr.simpleText()
                binding.tvTitle.text = resources.getString(R.string.home_greeting, text)
                binding.ivProfil.setImage(patient.picture)
            }
        })
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}