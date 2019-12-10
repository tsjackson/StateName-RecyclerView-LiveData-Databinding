package com.example.recyclerviewwithdatabinding.util

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithdatabinding.BR
import com.example.recyclerviewwithdatabinding.databinding.ItemLayoutBinding


class MyViewHolder(val binding: ViewDataBinding): RecyclerView.ViewHolder(binding.root)

fun MyViewHolder(binding: ItemLayoutBinding) {
    binding.root
}
    fun onBind(data:String){
        binding.setVariable(BR.stateName,data)
        binding.executePendingBindings()
    }
}