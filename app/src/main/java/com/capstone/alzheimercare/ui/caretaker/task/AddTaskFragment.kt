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
import com.capstone.alzheimercare.utils.Utility.hideKeyboard
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.viewmodel.ext.android.viewModel
import java.text.SimpleDateFormat
import java.util.*
import java.util.Locale
import android.util.Log
import com.capstone.alzheimercare.R
import com.capstone.alzheimercare.ml.Model
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import org.tensorflow.lite.DataType
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer
import java.nio.ByteBuffer
import kotlin.collections.ArrayList
import java.nio.CharBuffer
import java.nio.FloatBuffer
import java.nio.charset.StandardCharsets


class AddTaskFragment : Fragment() {
    private var _binding: FragmentCaretakerAddTaskBinding? = null
    private val binding get() = _binding as FragmentCaretakerAddTaskBinding
    private var calendar = Calendar.getInstance()

    private val viewModel: AddTaskViewModel by viewModel()
    private lateinit var preference: MyPreference
    private lateinit var from: String
    private var listDate: String = ""
    private var listTask: String = ""


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

        viewModel.getTask(idPatient).observe(viewLifecycleOwner, { task ->
            Log.d("getTasks", task.data.toString())
            if (task != null) {
                when (task) {
                    is Resource.Loading -> { showLoading(true)
                    }
                    is Resource.Success -> {
                        for (i in 0..task.data?.size!!) {
                            task.data?.forEach{
                                //showHour(it.timeStamp)
                                listDate = it.timeStamp
                                listTask = it.taskName
                            }
                        }
                        Log.d("list Date",listDate)
                        Log.d("List time",listTask)
                        showLoading(false)
                    }
                    is Resource.Error -> {
                        showLoading(false)
                        Snackbar.make(
                            binding.root,
                            "There's some mistake",
                            Snackbar.LENGTH_LONG
                        ).show()
                    }
                }
            }
        })

        setUpDatePicker()
        setUpTimePicker()
        showML()

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
            Toast.makeText(requireContext(), "Task has been added to patient", Toast.LENGTH_SHORT)
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
                    Log.e("PickedDate: ", "Date: $_pickedDate") //2019-02-12
                    updateLabel()
                }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.MONTH))
            dialog.datePicker.minDate = System.currentTimeMillis() - 1000
            dialog.show()
        }
    }


    private fun setUpTimePicker() {
        binding.btnTime.setOnClickListener {
            var hour: Int = 0
            var minute: Int = 0
            var mseconds = 0
            val onTimeSetListener =
                TimePickerDialog.OnTimeSetListener { timePicker, selectedHour, selectedMinute ->
                    hour = selectedHour
                    minute = selectedMinute
                    binding.btnTime.setText(String.format(Locale.getDefault(),
                        " %02d:%02d:%02d",
                        hour,
                        minute,
                        mseconds))
                }

            val timePickerDialog =
                TimePickerDialog(requireActivity(), onTimeSetListener, hour, minute, true)

            timePickerDialog.setTitle("Select Time")
            timePickerDialog.show()
        }
    }
    private fun updateLabel() {
        val formatter = SimpleDateFormat("yy-MM-dd", Locale.US)
        binding.btnDate.setText(formatter.format(calendar.time))
    }

    private fun loadModel(taskdate: ArrayList<Int>, listtask:ArrayList<String>) {

        val array = ArrayList<Float>()
        val model = Model.newInstance(requireContext())
        val inputFeature0 = TensorBuffer.createFixedSize(intArrayOf(1, 1), DataType.FLOAT32)
        val inputFeature1 = TensorBuffer.createFixedSize(intArrayOf(1, 1), DataType.FLOAT32)
        for (j in 0 until taskdate.size) {

            val byteBuffer1: ByteBuffer = ByteBuffer.allocateDirect(1 * 4)
            byteBuffer1.putInt(taskdate[j])
            val byteBuffer2: ByteBuffer = ByteBuffer.allocateDirect(1 * 4)

            inputFeature0.loadBuffer(byteBuffer1)
            inputFeature1.loadBuffer(byteBuffer2)

            val outputs = model.process(inputFeature0, inputFeature1)
            val outputFeature0 = outputs.outputFeature0AsTensorBuffer.floatArray

//            Log.d("output", outputFeature0[0].toString())
//            Log.d("output2", inputFeature1.shape.size.toString())

            array.add(outputFeature0[0])
        }
        Log.d("Input Fitur", inputFeature0.toString())
        Log.d("Input Fitur 2", inputFeature1.toString())
        Log.d("output", array.size.toString() + " " + array[0].toString())
        model.close()

    }
    //39 -122 24 64
    private fun showML() {
        binding.btnPatient.setOnClickListener {
            val result = loadModel(
                arrayListOf(
                    2, 5, 9, 2,2,2,2,9,9,9
                ),
                arrayListOf(
                    "Jogging",
                    "Jogging",
                    "Siang",
                    "Makan Malam"
                )
            )
            MaterialAlertDialogBuilder(requireActivity())
                .setMessage(""+result)
                .setNegativeButton(getString(R.string.OK),null)
                .show()
        }
    }
    fun showHour(list : String): String? {
        val formatter = SimpleDateFormat("H", Locale.US)
        return formatter.format(list)
    }


    private fun showLoading(isLoading: Boolean) {
        if (isLoading) {
            binding.progressBar.visibility = View.VISIBLE
            binding.layout.visibility = View.INVISIBLE
        } else {
            binding.progressBar.visibility = View.INVISIBLE
            binding.layout.visibility = View.VISIBLE
        }
    }
}
