package com.example.tablelayout

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.TableRow
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        btnAdd.setOnClickListener {
            // Create a new table row.
            val tableRow = TableRow(applicationContext)

            // Set new table row layout parameters.
            val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
            tableRow.layoutParams = layoutParams

            // add values into row by calling addView()
            tableRow.addView(strAndroidVersion,1)
            tableRow.addView(strCodeName,2)

            // Finally add the created row row into layout
            tbContent.addView(tableRow) // id from Layout_file
        }
    }
}