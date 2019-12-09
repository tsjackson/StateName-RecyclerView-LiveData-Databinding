package com.example.recyclerviewwithdatabinding.util

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

class MyBaseAdapter(val dataSet: List<String>, val context: Context):  RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MyViewHolder(DataBindingUtil.inflate<ViewDataBinding>(LayoutInflater.from(parent.context),viewType,parent,false))
//        return  MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false))

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        holder.stateName.text = dataSet[position]
    }
}