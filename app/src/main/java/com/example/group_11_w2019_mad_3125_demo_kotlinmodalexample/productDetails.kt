package com.example.group_11_w2019_mad_3125_demo_kotlinmodalexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NotificationCompat.getExtras
import android.content.Intent
import com.example.group_11_w2019_mad_3125_demo_kotlinmodalexample.Modal.Product
import kotlinx.android.synthetic.main.activity_product_details.*


class productDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)
        val i = intent
        val studobj = i.extras!!.getSerializable("pdetails") as Product
        pd_pid.text=studobj.productid
        pd_pname.text=studobj.productname
    }
}
