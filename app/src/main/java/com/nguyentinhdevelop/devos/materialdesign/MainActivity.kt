package com.nguyentinhdevelop.devos.materialdesign

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowSnackBar.setOnClickListener(View.OnClickListener {


            tilUsername.error="Nhap sai username roi do!!!!!"

            val intent = Intent(this, FloatButtonActivity::class.java)
            startActivity(intent)


        })
    }
}
