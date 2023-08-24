package com.simiyu.fetcheddisplay.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.simiyu.fetcheddisplay.databinding.RecyclerBinding
import com.simiyu.fetcheddisplay.model.products
import com.squareup.picasso.Picasso

class ProductsAdapter(var productlist: List<products>) : RecyclerView.Adapter<ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding = RecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val currentProduct = productlist.get(position)
        val binding = holder.binding
        binding.tvID.text = currentProduct.id.toString()
        binding.tvTitle.text = currentProduct.title
        binding.tvBody.text=currentProduct.body

           }

    override fun getItemCount(): Int {
        return productlist.size
    }
}

class ProductViewHolder(var binding: RecyclerBinding) : RecyclerView.ViewHolder(binding.root)

