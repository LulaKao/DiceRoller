package com.quarterlife.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initial view
        val rollButton : Button = findViewById(R.id.button)

        // set onClickListener
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        // create first dice
        var dice = Dice()
        var rollNumber = dice.roll()

        // initial view
        val imgDice :ImageView = findViewById(R.id.img_dice)

        // set img result
        var img = when(rollNumber){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // set img to ImageView
        imgDice.setImageResource(img)
    }
}