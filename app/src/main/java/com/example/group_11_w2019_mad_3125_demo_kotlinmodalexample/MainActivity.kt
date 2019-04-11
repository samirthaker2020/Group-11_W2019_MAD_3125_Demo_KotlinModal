package com.example.group_11_w2019_mad_3125_demo_kotlinmodalexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import com.example.group_11_w2019_mad_3125_demo_kotlinmodalexample.Adapter.Product_Adapter
import com.example.group_11_w2019_mad_3125_demo_kotlinmodalexample.Modal.Product
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // Initializing an empty ArrayList to be filled with animals
    val ProductList: ArrayList<Product> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getdata()
        // Creates a vertical Layout Manager
        rv_productlist.layoutManager = LinearLayoutManager(this)

        // You can use GridLayoutManager if you want multiple columns. Enter the number of columns as a parameter.
      //  rv_productlist.layoutManager = GridLayoutManager(this, 3)

        // Access the RecyclerView Adapter and load the data into it
        rv_productlist.adapter = Product_Adapter(ProductList,this)
    }





    fun getdata()
    {
        ProductList.add(Product("1","Monitor","21-inch HD",150.0f) )
        ProductList.add(Product("2","Pendrive","32-GB SCANDISK",20.0f))
        ProductList.add(Product("3","HardDisk","WD_1TB_5400@RPM",120.0f))
    }
}
