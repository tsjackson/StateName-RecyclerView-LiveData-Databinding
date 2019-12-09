package com.example.recyclerviewwithdatabinding.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithdatabinding.R
import com.example.recyclerviewwithdatabinding.data.MyViewModel
import com.example.recyclerviewwithdatabinding.util.MyBaseAdapter

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = GridLayoutManager(this,2)
//        val viewModel = ViewModelProvider(this, object: ViewModelProvider.Factory{
//            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//                return MyViewModel() as T
//            }
//
//        })
        val viewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        viewModel.nameString.observe(this, Observer {
            recyclerView.adapter = MyBaseAdapter(it,this)
        })
    }
}
