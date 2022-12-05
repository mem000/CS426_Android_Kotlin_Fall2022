package com.example.userinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast

class popupMenu_test : AppCompatActivity() {
    lateinit var my_button: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup_menu_test)
        //setSupportActionBar(toolbar)

        my_button = findViewById(R.id.my_button)
        my_button.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this, my_button)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)

            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item: MenuItem? ->

                when (item!!.itemId) {
                    R.id.header1 -> {
                        Toast.makeText(this, "You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
                    }
                    R.id.header2 -> {
                        Toast.makeText(this, "You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
                    }
                    R.id.header3 -> {
                        Toast.makeText(this, "You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
                    }
                }

                true
            })

            popupMenu.show()
        }
    }
}