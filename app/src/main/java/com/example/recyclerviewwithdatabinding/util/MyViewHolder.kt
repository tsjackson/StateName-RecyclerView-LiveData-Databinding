package com.example.recyclerviewwithdatabinding.util

import android.widget.TextView
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithdatabinding.R

class MyViewHolder(itemView: ViewDataBinding): RecyclerView.ViewHolder(binding.root) {
    val stateName : TextView

    init {
        stateName =
            itemView.findViewById(R.id.stateName)
    }
}