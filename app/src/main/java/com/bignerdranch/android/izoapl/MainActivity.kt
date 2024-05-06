package com.bignerdranch.android.izoapl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button;
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var leftButton: Button
    private lateinit var rightButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        leftButton = findViewById(R.id.left_button)
        rightButton = findViewById(R.id.right_button)

        leftButton.setOnClickListener{
            Toast.makeText(
                this,
                R.string.left_move,
                Toast.LENGTH_SHORT).show()
        }
        rightButton.setOnClickListener {
            Toast.makeText(
                this,
                R.string.right_move,
                Toast.LENGTH_SHORT).show()
        }
    }
}