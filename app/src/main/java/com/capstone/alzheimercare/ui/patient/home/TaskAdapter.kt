package com.capstone.alzheimercare.ui.patient.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.capstone.alzheimercare.R
import com.capstone.alzheimercare.core.domain.model.Tasks
import com.capstone.alzheimercare.databinding.ItemTaskBinding

class TaskAdapter(private val callback: TaskCallback) :
    RecyclerView.Adapter<TaskAdapter.ListViewHolder>() {

    private var listData = ArrayList<Tasks>()

    fun setData(newListData: List<Tasks>?) {
        if (newListData == null) return
        listData.clear()
        listData.addAll(newListData)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): ListViewHolder {
        val binding = ItemTaskBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    inner class ListViewHolder(private val binding: ItemTaskBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(task: Tasks) {
            with(binding) {
                tvDate.text = task.timeStamp
                tvTask.text = task.taskName

                itemContainer.setBackgroundColor(ContextCompat.getColor(itemContainer.context,
                        R.color.blue))
                itemView.setOnClickListener {
                    callback.onItemClick(task)
                }
            }
        }
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val record = listData[position]
        holder.bind(record)
    }

    override fun getItemCount(): Int = listData.size
}