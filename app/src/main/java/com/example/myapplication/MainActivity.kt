 package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Random

 class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    private fun rollDice() {
        TODO("Not yet implemented")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById<>(R.id.roll_button)
        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener {
            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }

        diceImage = findViewById(R.id.dice_image)

        private fun rollDice() {

            val randomInt = Random().nextInt(6) + 1
            val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
            }
            diceImage.setImageResource(drawableResource)

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.roll_button)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}