package com.quarterlife.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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
        var dice1 = Dice()
        var rollNumber1 = dice1.roll()

        // create second dice
        var dice2 = Dice()
        var rollNumber2 = dice2.roll()

        // create third dice
        var dice3 = Dice()
        var rollNumber3 = dice3.roll()

        // add the score
        var score = rollNumber1 + rollNumber2 + rollNumber3

        // initial view
        val resultTextView : TextView = findViewById(R.id.textView)

        // set text
        resultTextView.text = "dice1: $rollNumber1\n" +
                "dice2: $rollNumber2\n" +
                "dice3: $rollNumber3\n" +
                "--------------\n" +
                "score: $score"
    }
}