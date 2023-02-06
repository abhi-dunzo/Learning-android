package com.example.learningandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivityRecycler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_recycler)
        val flowerList = Datasource(this).getFlowerList()
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = FlowerAdapter(flowerList)
    }
}