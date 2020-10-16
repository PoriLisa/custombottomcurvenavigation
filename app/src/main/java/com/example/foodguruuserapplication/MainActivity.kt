package com.example.foodguruuserapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_curve_navigation_actvity_design)

        val customBottomNavigationView1: CustomBottomNavigationView1 =
            findViewById(R.id.customBottomBar)
        customBottomNavigationView1.inflateMenu(R.menu.bottom_menu)


        /* val mView: CurvedBottomNavigationView = findViewById(R.id.customBottomBar)
         mView.inflateMenu(R.menu.bottom_menu)
         mView.selectedItemId = R.id.action_schedules


         //getting bottom navigation view and attaching the listener
         //getting bottom navigation view and attaching the listener
         mView.setOnNavigationItemSelectedListener(this@MainActivity)*/
    }

    /* override fun onNavigationItemSelected(item: MenuItem): Boolean {
       *//*  when (item.itemId) {
            R.id.action_favorites -> {
            }
            R.id.action_schedules -> {
            }
            R.id.action_music -> {
            }
        }
        return true*//*
    }*/
}