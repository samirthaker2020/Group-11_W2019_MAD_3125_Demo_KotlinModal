package com.example.group_11_w2019_mad_3125_demo_kotlinmodalexample.Modal

import java.io.Serializable

class Product(var productid: String?, var productname: String?, var description: String?,var price:Float?): Serializable {

    override fun toString(): String {
        return "Product{" +
                "productid='" + productid + '\''.toString() +
                ", productname='" + productname + '\''.toString() +
                ", description='" + description + '\''.toString() +

                ",price='" + price + '\''.toString() +'}'.toString()
    }
}
