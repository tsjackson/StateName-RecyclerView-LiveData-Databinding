package com.example.recyclerviewwithdatabinding.util

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithdatabinding.R

class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val stateName : TextView

    init {
        stateName =
            itemView.findViewById(R.id.stateName)
    }
}