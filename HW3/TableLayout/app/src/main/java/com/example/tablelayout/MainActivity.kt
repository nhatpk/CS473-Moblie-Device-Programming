package com.example.tablelayout

import android.graphics.Color
import android.os.Bundle
import android.widget.TableLayout
import android.widget.TableRow
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            // Create a new table row.
            val tableRow = TableRow(applicationContext)

            // Set new table row layout parameters.
            val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
            tableRow.layoutParams = layoutParams

            // add values into row by calling addView()
            tableRow.addView(strAndroidVersion, 1)
            tableRow.addView(strCodeName, 2)

            // Finally add the created row row into layout
            tlContent.addView(tableRow) // id from Layout_file
        }
    }
}