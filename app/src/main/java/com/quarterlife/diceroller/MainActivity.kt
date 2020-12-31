package com.quarterlife.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

        // print the score
        println("=== rollNumber1 = $rollNumber1")
        println("=== rollNumber2 = $rollNumber2")
        println("=== rollNumber3 = $rollNumber3")
        println("=== score = $score")
    }

    class Dice {
        var sides = 6 // 邊長

        fun roll() : Int{
            /*  (1..sides) 這樣的語法代表我們創造了一個 1~sides 的集合物件，
            而集合物件都擁有一個叫 random 隨機取數的函式，
            可以隨機獲取集合物件裡的任一個元素   */
            return (1..sides).random()
        }
    }
}