package com.example.startactivityreultapp

import android.app.Activity
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.LinearLayout
import android.widget.Button
import android.content.Intent
import android.view.View

class MainActivity : AppCompatActivity() {
    var t: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     //   setContentView(R.layout.activity_main)
        val l = LinearLayout(this)
        l.orientation = LinearLayout.VERTICAL
        val b = Button(this)
        b.text = "Open Activity"
     //   b.setOnClickListener(bListener)
        t = TextView(this)
        t?.text = ""
        t?.textSize = 20F
        t?.setTextColor(Color.GRAY)
        l.addView(b)
        l.addView(t)
        setContentView(l) // Here we have no layout xml file, hard coded layout
        b.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivityForResult(intent, 1) // Here 1 is the request code
        }
    }
  /*  var bListener: View.OnClickListener = View.OnClickListener {
        val intent = Intent(this@MainActivity, SecondActivity::class.java)
        startActivityForResult(intent, 1) // Here 1 is the request code
    }*/

    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                t?.setTextColor(Color.RED)
                val returnedResult = data!!.data!!.toString()
                t?.text = returnedResult
            }
        }
    }
}
