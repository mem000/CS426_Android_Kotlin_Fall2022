package com.example.userinterface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.PopupMenu

class MainActivity : AppCompatActivity() {
    lateinit var clickable_image: ImageView;
    lateinit var btn_spinner: Button;
    lateinit var btn_radioButton: Button;
    lateinit var btn_checkBox: Button;
    lateinit var btn_switch: Button;
    lateinit var btn_popup_menu: Button;
    lateinit var btn_recyclerView_menu: Button;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickable_image = findViewById(R.id.imageView_1)
        clickable_image.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }

        btn_spinner = findViewById(R.id.btn_spinner)
        btn_spinner.setOnClickListener {
            val intent = Intent(this, SpinnerActivity::class.java)
            startActivity(intent)
        }

        btn_radioButton = findViewById(R.id.btn_radioButton)
        btn_radioButton.setOnClickListener {
            val intent = Intent(this, RadioButton_test::class.java)
            startActivity(intent)
        }

        btn_checkBox = findViewById(R.id.btn_checkBox)
        btn_checkBox.setOnClickListener {
            val intent = Intent(this, CheckBox_test::class.java)
            startActivity(intent)
        }


        btn_switch = findViewById(R.id.btn_switch)
        btn_switch.setOnClickListener {
            val intent = Intent(this, Switch_test::class.java)
            startActivity(intent)
        }


        btn_popup_menu = findViewById(R.id.btn_popup_menu)
        btn_popup_menu.setOnClickListener {
            val intent = Intent(this, popupMenu_test::class.java)
            startActivity(intent)
        }

        btn_recyclerView_menu = findViewById(R.id.btn_recyclerView_menu)
        btn_recyclerView_menu.setOnClickListener {
            val intent = Intent(this, R_view::class.java)
            startActivity(intent)
        }
    }
}