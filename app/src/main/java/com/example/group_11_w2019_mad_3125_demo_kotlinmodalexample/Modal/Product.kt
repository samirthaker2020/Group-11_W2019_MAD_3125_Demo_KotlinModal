package com.example.group_11_w2019_mad_3125_demo_kotlinmodalexample.Modal

class Product(var productid: String?, var productname: String?, var description: String?, var pimage: String?) {

    override fun toString(): String {
        return "Product{" +
                "productid='" + productid + '\''.toString() +
                ", productname='" + productname + '\''.toString() +
                ", description='" + description + '\''.toString() +
                ", pimage='" + pimage + '\''.toString() +
                '}'.toString()
    }
}
