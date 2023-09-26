package com.example.foodorderapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

var total : Int = 0

class FoodAdapter (private val foodList:ArrayList<Food>)
    : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.imageView)
        val textView : TextView = itemView.findViewById(R.id.textView)
        var quantityView : TextView = itemView.findViewById(R.id.quantityView)
        val priceView : TextView = itemView.findViewById(R.id.priceView)
        val buttonPlus : Button = itemView.findViewById(R.id.buttonPlus)
        val buttonMinus : Button = itemView.findViewById(R.id.buttonMinus)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_template , parent , false)
        return FoodViewHolder(view)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        var num = 0
        val food = foodList[position]
        holder.imageView.setImageResource(food.image)
        holder.textView.text = food.foodname
        holder.priceView.text = food.foodprice
        holder.quantityView.text = food.quantity
        holder.buttonPlus.setOnClickListener {
            num++
            holder.quantityView.text = num.toString()
        }
        holder.buttonMinus.setOnClickListener {
            num--
            if(num == -1)
                num =0
            holder.quantityView.text = num.toString()
            total = holder.priceView.text.length * num
        }
    }
}