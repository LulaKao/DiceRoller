package com.quarterlife.diceroller

class Dice (private val numSides : Int) {
//    var sides = numSides // 邊長
//    private var diceRange = 1..sides
//    var diceRange : IntRange = 1..sides

    fun roll():Int{
        /*  (1..sides) 這樣的語法代表我們創造了一個 1~sides 的集合物件，
        而集合物件都擁有一個叫 random 隨機取數的函式，
        可以隨機獲取集合物件裡的任一個元素   */
        return (1..numSides).random()
//        return diceRange.random()
    }
}