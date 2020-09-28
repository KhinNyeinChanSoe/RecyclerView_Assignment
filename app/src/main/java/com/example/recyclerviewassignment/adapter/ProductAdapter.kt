package com.example.recyclerviewassignment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewassignment.R
import com.example.recyclerviewassignment.model.Product
import kotlinx.android.synthetic.main.item_detail.view.*
import java.security.ProtectionDomain

class ProductAdapter(var prodictList:ArrayList<Product>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder(itemview : View): RecyclerView.ViewHolder(itemview) {
        fun bind(product:Product){
            itemView.tv_name.text = product.name
            itemView.tv_price.text = product.price.toString()
            itemView.tv_kg.text = product.kg
            itemView.img_product.setImageResource(product.image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_detail,parent,false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(prodictList[position])
    }

    override fun getItemCount(): Int = prodictList.size
}