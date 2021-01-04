package com.quarterlife.diceroller

class Dice {
    var sides = 6 // 邊長

    fun roll():Int{
        /*  (1..sides) 這樣的語法代表我們創造了一個 1~sides 的集合物件，
        而集合物件都擁有一個叫 random 隨機取數的函式，
        可以隨機獲取集合物件裡的任一個元素   */
        return (1..sides).random()
    }
}