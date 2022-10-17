package com.sidrakotlin.kotlinapppractice.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sidrakotlin.kotlinapppractice.R
import com.sidrakotlin.kotlinapppractice.model.Food

class FoodAdapter(private val foodlist:ArrayList<Food>, private val context: Context)
    : RecyclerView.Adapter<FoodAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.food_item, parent,false);
        val viewHold = MyViewHolder(view)
        return viewHold
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val food = foodlist[position]

        holder.name.text=food.name;
        holder.price.text="Rs. " + food.price;
        holder.img.setImageResource(food.image)
    }

    override fun getItemCount(): Int {
        return foodlist.size;
    }

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var name: TextView = itemView.findViewById(R.id.foodname);
        var price: TextView = itemView.findViewById(R.id.price);
        var img: ImageView = itemView.findViewById(R.id.foodimg);

    }
}