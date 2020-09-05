package com.example.dinnerdecider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {
    var arrayFood = arrayListOf<String>("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        // Randomize the food for 1st time
        strFood.text = arrayFood.random()

        // btn Decide click
        btnDecide.setOnClickListener {
            strFood.text = arrayFood.random()
        }

        btnAddFood.setOnClickListener {
            arrayFood.add(strAddFood.text.toString())
            strFood.text = strAddFood.text
        }
    }
}