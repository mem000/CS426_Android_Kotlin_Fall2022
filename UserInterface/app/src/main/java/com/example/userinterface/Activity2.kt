package com.example.userinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast

class Activity2 : AppCompatActivity() {
    lateinit var seek_Bar: SeekBar
    lateinit var message: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        seek_Bar = findViewById(R.id.seekBar)
        message = findViewById(R.id.textView_1)
        seek_Bar.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                // When the progress value has changed
                message.textSize = (progress).toFloat();

            }

            override fun onStartTrackingTouch(seek: SeekBar) {
                // This method will automatically
                // called when the user touches the SeekBar
            }

            override fun onStopTrackingTouch(seek: SeekBar) {
                // This method will automatically called when the user stops touching the SeekBar
                // write custom code for progress is stopped
                Toast.makeText(this@Activity2,
                    "Progress is: " + seek.progress + "%",
                    Toast.LENGTH_SHORT).show()
            }
        })


    }
}