package com.capstone.alzheimercare.ui.patient.home

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.capstone.alzheimercare.R
import com.capstone.alzheimercare.core.network.Resource
import com.capstone.alzheimercare.databinding.FragmentPatientHomeBinding
import com.capstone.alzheimercare.ui.MyPreference
import com.capstone.alzheimercare.utils.Utility.dateNow
import com.capstone.alzheimercare.utils.Utility.setImage
import com.capstone.alzheimercare.utils.Utility.simpleText
import com.google.android.material.snackbar.Snackbar
import org.koin.android.viewmodel.ext.android.viewModel
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


class HomeFragment : Fragment() {
    private lateinit var preference: MyPreference
    private lateinit var taskAdapter: TaskAdapter
    private val homeViewModel: HomeViewModel by viewModel()
    var date = Date()

    private val taskViewModel: TaskViewModel by viewModel()

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
        if (activity != null) {
            taskAdapter = TaskAdapter()
            val id = preference.getId()

            taskViewModel.getTasks(id).observe(viewLifecycleOwner, { tasks ->
                Log.d("tasks", tasks.data.toString())

                if (tasks != null) {
                    when (tasks) {
                        is Resource.Loading -> showLoading(true)
                        is Resource.Success -> {
                           val list = tasks.data?.filter {
                               val timestamp = SimpleDateFormat("yy-MM-dd HH:mm:ss").parse(it.timeStamp)
                               //it.timeStamp <= currentTime
                               timestamp >= date
                            }
                            showLoading(false)
                            Log.d("RecyclerView Tasks", list.toString())
                            taskAdapter.setData(list)
                            showEmpty(list?.isEmpty() as Boolean)
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
            with(binding.rcTask) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = taskAdapter
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun showEmpty(isEmpty: Boolean) {
        if (isEmpty) {
            binding.emptyLayout.visibility = View.VISIBLE
        } else {
            binding.emptyLayout.visibility = View.INVISIBLE
        }
    }
    private fun showLoading(isLoading: Boolean) {
        if (isLoading) {
            binding.progressBar.visibility = View.VISIBLE
            binding.rcTask.visibility = View.INVISIBLE
        } else {
            binding.progressBar.visibility = View.INVISIBLE
            binding.rcTask.visibility = View.VISIBLE
        }
    }

}