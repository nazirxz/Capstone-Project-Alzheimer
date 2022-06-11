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


class AddTaskFragment : Fragment() {
    private var _binding: FragmentCaretakerAddTaskBinding? = null
    private val binding get() = _binding as FragmentCaretakerAddTaskBinding
    private var calendar = Calendar.getInstance()

    private val viewModel: AddTaskViewModel by viewModel()
    private lateinit var preference: MyPreference
    private lateinit var from: String
    private var listDate: String = ""
    private var listTask: String = ""
    private var input: String = ""
    private var result: String = ""
    private var hour: String = ""
    val getHour = ArrayList<Int>()
    val hourarray = ArrayList<Int>()
    val taskarray = ArrayList<Int>()
    val getTask = ArrayList<Int>()

    val arg = this.arguments
    val idPatient = arg?.getString("idPatient").toString()

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

    private fun loadModel(intArray: IntArray,intArray2: IntArray): String {
        val labels = activity?.application?.assets?.open("taskonly.txt")?.bufferedReader().use{it?.readText()}?.split("\n")
        val array = ArrayList<Float>()
        val model = Model.newInstance(requireContext())
        val inputFeature0 = TensorBuffer.createFixedSize(intArrayOf(1, 1), DataType.FLOAT32)
        val inputFeature1 = TensorBuffer.createFixedSize(intArrayOf(1, 1), DataType.FLOAT32)
        for (j in 0..intArray.size-1) {

            val byteBuffer1: ByteBuffer = ByteBuffer.allocateDirect(1*4)
            byteBuffer1.putFloat(intArray[j].toFloat())
            Log.d("byte buffer input1",byteBuffer1.toString())

            val byteBuffer2: ByteBuffer = ByteBuffer.allocateDirect(1*4)
            byteBuffer2.putFloat(intArray2[j].toFloat())
            Log.d("byte buffer input2",byteBuffer1.toString())

            inputFeature0.loadBuffer(byteBuffer1)
            inputFeature1.loadBuffer(byteBuffer2)

            val outputs = model.process(inputFeature0, inputFeature1)
            Log.d("Outputs model process",outputs.toString())
            val outputFeature0 = outputs.outputFeature0AsTensorBuffer.floatArray
            Log.d("Output feature ",outputFeature0.toString())

            array.add(outputFeature0[0])
            Log.d("Array add",array.toString())
        }
        Log.d("Input Fitur", inputFeature0.toString())
        Log.d("Input Fitur 2", inputFeature1.toString())
        Log.d("output", array.size.toString() + " " + array.toString())
        val max = getMax(array.toFloatArray(), intArray.size-1)
        result = labels!![max]
        Log.d("labels max", labels[max])
        Log.d("result", result)
        model.close()
        return result
    }


    private fun showML() {
        viewModel.getTask(idPatient).observe(viewLifecycleOwner, { task ->
            Log.d("getTasks", task.data.toString())
            if (task != null) {
                when (task) {
                    is Resource.Loading -> { showLoading(true)
                    }
                    is Resource.Success -> {
                        for (i in 0 until task.data?.size!!) {
                            task.data.forEach{
                                //showHour(it.timeStamp)
                                listDate = it.timeStamp
                                listTask = it.taskName

                                //convert time to only get hour
                                val inputFormat = SimpleDateFormat("yy-mm-dd HH:mm:ss", Locale.US)
                                val parse = inputFormat.parse(listDate)
                                val formatter = SimpleDateFormat("H", Locale.US)
                                hour = formatter.format(parse)

                                //convert task to int
                                when (listTask) {
                                    "jemur" -> {
                                        listTask = 1.toString()
                                    }
                                    "jogging" -> {
                                        listTask = 2.toString()
                                    }
                                    "olahraga" -> {
                                        input = 3.toString()
                                    }
                                    "senam taichi" -> {
                                        listTask = 4.toString()
                                    }
                                    "bejemur" -> {
                                        listTask = 5.toString()
                                    }
                                    "senam poco poco" -> {
                                        listTask = 6.toString()
                                    }
                                    "gosok gigi" -> {
                                        listTask = 7.toString()
                                    }
                                    "main teka teki silang" -> {
                                        listTask = 8.toString()
                                    }
                                    "jalan pagi" -> {
                                        listTask = 9.toString()
                                    }
                                    "siram tanam" -> {
                                        listTask = 10.toString()
                                    }
                                    "senam vital otak" -> {
                                        listTask = 11.toString()
                                    }
                                    "senam pagi" -> {
                                        listTask = 12.toString()
                                    }
                                    "mandi" -> {
                                        listTask = 13.toString()
                                    }
                                    "senam pocopoco" -> {
                                        listTask = 14.toString()
                                    }
                                    "sarap" -> {
                                        listTask = 15.toString()
                                    }
                                    "meditasi" -> {
                                        listTask = 16.toString()
                                    }
                                    "baca koran" -> {
                                        listTask = 17.toString()
                                    }
                                    "sapu halaman" -> {
                                        listTask = 18.toString()
                                    }
                                    "poco poco" -> {
                                        listTask = 19.toString()
                                    }
                                    "sepeda" -> {
                                        listTask = 20.toString()
                                    }
                                    "sapu teras" -> {
                                        listTask = 21.toString()
                                    }
                                    "tari" -> {
                                        listTask = 22.toString()
                                    }
                                    "minum obat" -> {
                                        listTask = 23.toString()
                                    }
                                    "minum teh hangat" -> {
                                        listTask = 24.toString()
                                    }
                                    "baca buku" -> {
                                        listTask = 25.toString()
                                    }
                                    "dengar lagu klasik" -> {
                                        listTask = 26.toString()
                                    }
                                    "minum vitamin" -> {
                                        listTask = 27.toString()
                                    }
                                    "mandi pagi" -> {
                                        listTask = 28.toString()
                                    }
                                    "nonton tv" -> {
                                        listTask = 29.toString()
                                    }
                                    "karoke" -> {
                                        listTask = 30.toString()
                                    }
                                    "makan buah" -> {
                                        listTask = 31.toString()
                                    }
                                    "rajut" -> {
                                        listTask = 32.toString()
                                    }
                                    "main catur" -> {
                                        listTask = 33.toString()
                                    }
                                    "main tebak gambar" -> {
                                        listTask = 34.toString()
                                    }
                                    "lihat foto keluarga" -> {
                                        listTask = 35.toString()
                                    }
                                    "dengar lagu" -> {
                                        listTask = 36.toString()
                                    }
                                    "nyanyi" -> {
                                        listTask = 37.toString()
                                    }
                                    "main puzzle" -> {
                                        listTask = 38.toString()
                                    }
                                    "makan siang" -> {
                                        listTask = 39.toString()
                                    }
                                    "tonton tv" -> {
                                        listTask = 40.toString()
                                    }
                                    "tidur siang" -> {
                                        listTask = 41.toString()
                                    }
                                    "istirahat" -> {
                                        listTask = 42.toString()
                                    }
                                    "kasih makan kucing" -> {
                                        listTask = 43.toString()
                                    }
                                    "jalan sore" -> {
                                        listTask = 44.toString()
                                    }
                                    "beri makan burung" -> {
                                        listTask = 45.toString()
                                    }
                                    "mandi sore" -> {
                                        listTask = 46.toString()
                                    }
                                    "tonton film" -> {
                                        listTask = 47.toString()
                                    }
                                    "video call keluarga" -> {
                                        listTask = 48.toString()
                                    }
                                    "bersih telinga" -> {
                                        listTask = 49.toString()
                                    }
                                    "makan malam" -> {
                                        listTask = 50.toString()
                                    }
                                    "makan" -> {
                                        listTask = 51.toString()
                                    }
                                    "membersihkan telinga" -> {
                                        listTask = 52.toString()
                                    }
                                    "tidur" -> {
                                        listTask = 53.toString()
                                    }
                                    "tidur malam" -> {
                                        listTask = 54.toString()
                                    }
                                    else -> listTask = 99.toString()
                                }

                                taskarray.add(listTask.toInt())
                                hourarray.add(hour.toInt())
                            }
                            getTask.add(taskarray[i])
                            getHour.add(hourarray[i])
                        }
                        Log.d("list Date",listDate)
                        Log.d("size data",task.data.size.toString())
                        Log.d("get hour array", getHour.toString())
                        Log.d("get task array",getTask.toString())

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
        binding.btnPatient.setOnClickListener {
            val predict = loadModel(getHour.toIntArray(),getTask.toIntArray())

            Log.d("predict",result)
            MaterialAlertDialogBuilder(requireActivity())
                .setMessage("Task patient yang sering dilakukan ialah "+predict)//+predict)
                .setNegativeButton(getString(R.string.OK),null)
                .show()
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
                    binding.btnTime.text = String.format(Locale.getDefault(),
                        " %02d:%02d:%02d",
                        hour,
                        minute,
                        mseconds)
                }

            val timePickerDialog =
                TimePickerDialog(requireActivity(), onTimeSetListener, hour, minute, true)

            timePickerDialog.setTitle("Select Time")
            timePickerDialog.show()
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
                    binding.btnDate.text = _pickedDate

                }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.MONTH))
            dialog.datePicker.minDate = System.currentTimeMillis() - 1000
            dialog.show()
        }
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
    private fun getMax(arr: FloatArray, j: Int): Int{
        var ind = 0
        var min = 0.0F

        for (i in 0..j)
        {
            if(arr[i] > min){
                ind = i
                min = arr[i]
            }
        }
        return ind
    }
}
