package com.example.recyclerviewassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewassignment.adapter.ProductAdapter
import com.example.recyclerviewassignment.model.Product
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var productList = ArrayList<Product>()
        productList.add(Product("Fine Grain Sugar",20.00,"1Kg",R.drawable.sugar))
        productList.add(Product("Peanuts",20.00,"3Kg",R.drawable.peanut))
        productList.add(Product("Dawat Rice",80.00,"2Kg",R.drawable.rice))
        productList.add(Product("Fine Grain Sugar",20.00,"1Kg",R.drawable.sugar))
        productList.add(Product("Peanuts",20.00,"3Kg",R.drawable.peanut))
        productList.add(Product("Dawat Rice",80.00,"2Kg",R.drawable.rice))
        productList.add(Product("Fine Grain Sugar",20.00,"1Kg",R.drawable.sugar))
        productList.add(Product("Peanuts",20.00,"3Kg",R.drawable.peanut))
        productList.add(Product("Dawat Rice",80.00,"2Kg",R.drawable.rice))

        var productAdapter =ProductAdapter(productList)
        recyclerProduct.layoutManager = LinearLayoutManager(this)
        recyclerProduct.adapter = productAdapter
    }
}