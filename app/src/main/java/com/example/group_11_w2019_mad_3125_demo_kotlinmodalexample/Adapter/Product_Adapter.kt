package com.example.group_11_w2019_mad_3125_demo_kotlinmodalexample.Adapter

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.group_11_w2019_mad_3125_demo_kotlinmodalexample.Modal.Product
import com.example.group_11_w2019_mad_3125_demo_kotlinmodalexample.R
import com.example.group_11_w2019_mad_3125_demo_kotlinmodalexample.productDetails

class Product_Adapter(private val ProductList: List<Product>, private var mcontext: Context?) :
    RecyclerView.Adapter<Product_Adapter.MyViewholder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): Product_Adapter.MyViewholder {
        val itemView = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.product_layout, viewGroup, false)
        mcontext = viewGroup.context
        return MyViewholder(itemView)
    }

    override fun onBindViewHolder(myViewholder: Product_Adapter.MyViewholder, i: Int) {
        val p = ProductList[i]

        myViewholder.pid.text = "ProductList::" + p.productname!!

        myViewholder.itemView.setOnClickListener()
        {
            val intent = Intent(mcontext,productDetails::class.java)
            intent.putExtra("pdetails",p)
            // start your next activity
          mcontext!!.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return ProductList.size
    }

    inner class MyViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var pid: TextView

        init {

            pid = itemView.findViewById<View>(R.id.pid) as TextView


        }
    }
}
