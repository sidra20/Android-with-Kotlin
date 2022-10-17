package com.sidrakotlin.kotlinapppractice.activities

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sidrakotlin.kotlinapppractice.R
import com.sidrakotlin.kotlinapppractice.adapter.FoodAdapter
import com.sidrakotlin.kotlinapppractice.model.Food

class FoodActivity:AppCompatActivity() {
    lateinit var recycle:RecyclerView;
    lateinit var arrayList:ArrayList<Food>
    lateinit var adapter: FoodAdapter;
    lateinit var back:ImageView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_food_list);

        init();
    }
    fun init()
    {
        back = findViewById(R.id.back);
        back.setOnClickListener{
            //finish();
           showAlert()
        }
        recycle = findViewById(R.id.foodRecycle);
        recycle.layoutManager = LinearLayoutManager(this);
        arrayList=ArrayList()


        arrayList.add(Food(R.drawable.biryani,"Chicken Biryani", 200));
        arrayList.add(Food(R.drawable.pizza,"Tikka Pizza", 500));
        arrayList.add(Food(R.drawable.pasta,"Creamy Pasta", 300));
        arrayList.add(Food(R.drawable.burger,"Zinger Burger", 300));

        adapter = FoodAdapter(arrayList,this)
        recycle.adapter=adapter
    }

    private fun showAlert() {
        val alert = AlertDialog.Builder(this);
        alert.setCancelable(true)
        alert.setTitle("Exit")
        alert.setMessage("Are you sure you want to exit?")
        alert.setPositiveButton("Yes") {dialogInterface,it->
            finish();
        }
        alert.setNegativeButton("No") {dialogInterface , it->
            dialogInterface.cancel()
        }
        alert.show();
    }
}