package com.capstone.alzheimercare.ui.caretaker.task

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.capstone.alzheimercare.R
import com.capstone.alzheimercare.core.network.Resource
import com.capstone.alzheimercare.databinding.FragmentCaretakerAddTaskBinding
import com.capstone.alzheimercare.ui.MyPreference
import com.capstone.alzheimercare.ui.caretaker.scanner.ScannerViewModel
import com.ibotta.android.support.pickerdialogs.SupportedDatePickerDialog
import org.koin.android.viewmodel.ext.android.viewModel
import java.util.*


class AddTaskFragment : Fragment() {

    private var _binding: FragmentCaretakerAddTaskBinding? = null
    private val binding get() = _binding as FragmentCaretakerAddTaskBinding

    private val viewModel: ScannerViewModel by viewModel()
    private lateinit var preference: MyPreference
    private lateinit var from: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentCaretakerAddTaskBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        preference = MyPreference(requireContext())
        val arg = this.arguments
        val idPatient = arg?.getString("idPatient").toString()

        viewModel.getCaretaker(preference.getId()).observe(viewLifecycleOwner, { caretaker ->
            if (caretaker != null) {
                when (caretaker) {
                    is Resource.Loading -> {
                    }
                    is Resource.Success -> {
                        from = caretaker.data?.name.toString()
                    }
                    is Resource.Error -> {
                    }
                }
            }
        })
    }




}