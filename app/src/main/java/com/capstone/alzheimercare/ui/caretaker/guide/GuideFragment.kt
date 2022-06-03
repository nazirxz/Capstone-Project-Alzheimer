package com.capstone.alzheimercare.ui.caretaker.guide

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.capstone.alzheimercare.databinding.FragmentCaretakerGuideBinding

class GuideFragment : Fragment() {
    private var list: ArrayList<DataClassGuide> = arrayListOf()
    private var listDetail: ArrayList<DataClassGuide> = arrayListOf()

    private var _binding: FragmentCaretakerGuideBinding? = null
    private val binding get() = _binding as FragmentCaretakerGuideBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        _binding = FragmentCaretakerGuideBinding.inflate(inflater, container, false)
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rcList.visibility = View.VISIBLE
        binding.rcList.setHasFixedSize(true)

        list.addAll(dummyGuide.listData)
        showRecyclerList()
    }
    private fun showSelectedGuide(guideSelected: DataClassGuide) {
        when (guideSelected.guideName) {
            "Panduan Tepat Merawat Orang dengan Penyakit Alzheimer" -> {
                showDetailRecyclerList()
                listDetail.add(dummyGuide.listData[0])
            }
            "10 gejala awal Demensia Alzheimer" -> {
                showDetailRecyclerList()
                listDetail.add(dummyGuide.listData[1])
            }
        }
    }

    private fun showRecyclerList() {
        binding.rcList.layoutManager = LinearLayoutManager(requireContext())
        val listGuideAdapter = ListGuideAdapter(list)
        binding.rcList.adapter = listGuideAdapter

        listGuideAdapter.setOnItemClickCallback(object : ListGuideAdapter.OnItemClickCallback {
            override fun onItemClicked(data: DataClassGuide) {
                showSelectedGuide(data)
            }
        })

    }

    private fun showDetailRecyclerList() {
       binding.rcList.layoutManager = LinearLayoutManager(requireContext())
        val listGuideDetail = ListGuideDetail(listDetail)
        binding.rcList.adapter = listGuideDetail
    }
}