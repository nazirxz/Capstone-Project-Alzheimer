package com.capstone.alzheimercare.ui.caretaker.guide

import android.view.*
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.*
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.capstone.alzheimercare.R

class ListGuideAdapter(private val resultGuides: List<DataClassGuide>) : Adapter<ListGuideAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_guide, parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return resultGuides.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val itemGuide = resultGuides[position]
        Glide.with(holder.itemView.context)
            .load(itemGuide.image)
            .apply(RequestOptions().override(60,60))
            .into(holder.ivPicture)
        holder.tvName.text = itemGuide.guideName
        holder.tvDescription.text = itemGuide.description

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(resultGuides[holder.adapterPosition]) }
    }

    inner class ListViewHolder(itemView: View) : ViewHolder(itemView){
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)
        var ivPicture: ImageView = itemView.findViewById(R.id.iv_item_picture)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: DataClassGuide)
    }
}
