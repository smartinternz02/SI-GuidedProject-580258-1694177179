package com.example.foodorderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList : ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        foodList = ArrayList()

        foodList.add(Food(R.drawable.a, "Veg noodles", "180", "0"))
        foodList.add(Food(R.drawable.b, "Veg biryani", "200", "0"))
        foodList.add(Food(R.drawable.c, "Veg sandwich", "140", "0"))
        foodList.add(Food(R.drawable.d, "Veg pizza", "220", "0"))
        foodList.add(Food(R.drawable.e, "Pan cake", "120", "0"))
        foodList.add(Food(R.drawable.f, "Ice cream", "140", "0"))
        foodList.add(Food(R.drawable.g, "Veg burger", "200", "0"))
        foodList.add(Food(R.drawable.h, "Chicken pizza", "240", "0"))
        foodList.add(Food(R.drawable.i, "Chicken burger", "220", "0"))
        foodList.add(Food(R.drawable.drinks, "Drinks", "110", "0"))

        foodAdapter = FoodAdapter(foodList)
        recyclerView.adapter = foodAdapter

    }
}