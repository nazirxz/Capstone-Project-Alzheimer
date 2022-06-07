package com.capstone.alzheimercare.ui.caretaker.task

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.capstone.alzheimercare.core.domain.model.Tasks
import com.capstone.alzheimercare.core.network.Resource
import com.capstone.alzheimercare.databinding.FragmentCaretakerAddTaskBinding
import com.capstone.alzheimercare.ui.MyPreference
import com.capstone.alzheimercare.ui.caretaker.scanner.ScannerViewModel
import com.capstone.alzheimercare.utils.Utility.hideKeyboard
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.viewmodel.ext.android.viewModel
import java.text.DateFormatSymbols
import java.text.SimpleDateFormat
import java.util.*
import java.util.Locale
import android.util.Log

import android.widget.DatePicker




class AddTaskFragment : Fragment() {

    private var _binding: FragmentCaretakerAddTaskBinding? = null
    private val binding get() = _binding as FragmentCaretakerAddTaskBinding
    private var calendar = Calendar.getInstance()

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

        setUpDatePicker()
        binding.btnTime.setOnClickListener {
            setUpTimePicker()
        }


        binding.btnDone.setOnClickListener {
            lifecycleScope.launch(Dispatchers.IO) {
                viewModel.insert(
                    Tasks(
                        taskName = binding.inputTask.text.toString(),
                        timeStamp = binding.btnDate.text.toString().plus(binding.btnTime.text.toString()),
                        idCaretaker = from,
                        idPatient = idPatient
                    )
                )
            }
            it.hideKeyboard()
            activity?.supportFragmentManager?.popBackStack()
            Toast.makeText(requireContext(), "Tasks has been added to patient", Toast.LENGTH_SHORT)
                .show()
        }
    }

    private fun setUpDatePicker() {
        binding.btnDate.setOnClickListener {
            val dialog = DatePickerDialog(requireActivity(),
                { view, year, month, dayOfMonth ->
                    val _year = year.toString()
                    val _month = if (month + 1 < 10) "0" + (month + 1) else (month + 1).toString()
                    val _date = if (dayOfMonth < 10) "0$dayOfMonth" else dayOfMonth.toString()
                    val _pickedDate = "$year-$_month-$_date"
                    val formatter = SimpleDateFormat("yy-MM-dd", Locale.US)
                    Log.e("PickedDate: ", "Date: $_pickedDate") //2019-02-12
                    updateLabel()
                }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.MONTH))
            dialog.datePicker.minDate = System.currentTimeMillis() - 1000
            dialog.show()
        }
    }
    private fun setUpTimePicker() {
        var hour: Int = 0
        var minute: Int = 0
        var mseconds = 0
        val onTimeSetListener =
            TimePickerDialog.OnTimeSetListener { timePicker, selectedHour, selectedMinute ->
                hour = selectedHour
                minute = selectedMinute
                binding.btnTime.setText(String.format(Locale.getDefault(), " %02d:%02d:%02d", hour, minute, mseconds))
            }

        val timePickerDialog =
            TimePickerDialog(requireActivity(),  /*style,*/onTimeSetListener, hour, minute, true)

        timePickerDialog.setTitle("Select Time")
        timePickerDialog.show()

    }
    private fun updateLabel() {
        val formatter = SimpleDateFormat("yy-MM-dd", Locale.US)
        binding.btnDate.setText(formatter.format(calendar.time))
    }


}