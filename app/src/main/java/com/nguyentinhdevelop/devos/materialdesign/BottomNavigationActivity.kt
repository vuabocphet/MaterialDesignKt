package com.nguyentinhdevelop.devos.materialdesign

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_bottom_navigation.*

class BottomNavigationActivity : AppCompatActivity() {

    val text: TextView = findViewById(R.id.message) as TextView
    private  val mOnNavigationItemSelectedListener= BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->

        when (menuItem.itemId) {

            R.id.navigation_home -> {
                text.text = getText(R.string.title_home)

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_home -> {
                text.text = getText(R.string.title_dashboard)

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_home -> {
                text.text = getText(R.string.title_notifications)

                return@OnNavigationItemSelectedListener true
            }




        }
        false
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
