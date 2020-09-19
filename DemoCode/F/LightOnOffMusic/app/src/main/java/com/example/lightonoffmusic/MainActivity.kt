package com.example.lightonoffmusic

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.media.MediaPlayer
import android.media.MediaPlayer.OnCompletionListener
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(),SensorEventListener {
    // Declare Sensor object to select particular sensor
    private var sensor:Sensor? = null
    // To manage Sensor components declare SensorManager Object
    private var sm:SensorManager? = null
    // Declare MediaPlayer object to play music
    lateinit  var mp:MediaPlayer
    var cuttentLux = 0
    // Declare the boolean flag to know the player is running or not
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Initialize object for Sensor service using getSystemService()
        sm = getSystemService(Context.SENSOR_SERVICE) as SensorManager?
        // Initialize Sensor object for the Type light using getDefaultSensor() from SensorManager object
        sensor = sm!!.getDefaultSensor(Sensor.TYPE_LIGHT)
       // Check device has the requested Sensor or not
        if(sensor==null){
            Toast.makeText(this, "Your device has no Sensor.TYPE_LIGHT", Toast.LENGTH_LONG).show()
        }

    }
    // Register your Sensor Manager
    override fun onResume() {
        super.onResume()
        sm.also {   sm!!.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL)}
   //     sm!!.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL)
    }
    // Unregister your Sensor Manager
    override fun onPause() {
        super.onPause()
        sm!!.unregisterListener(this)
    }

    override fun onSensorChanged(event: SensorEvent?) {
        mp = MediaPlayer.create(applicationContext, R.raw.iphone)
        if (event!!.values!![0] < 20 )
        { // < 20 use for dark
            try
            {

                // mp.setDataSource("http://www.tamilmp3plus.com/837/vijay-prakash-hits/");
                // mp.prepare();
              //  mp = MediaPlayer.create(applicationContext, R.raw.iphone)
                mp.setOnCompletionListener(OnCompletionListener { mp.release() })
                mp.start()
            }
            catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
}
}
