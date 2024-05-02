package com.example.mathgame

import kotlin.random.Random

fun generateQuestion(selectedCategory: String){

    var randomNumberOne = Random.nextInt(0, 100);
    var randomNumberTwo = Random.nextInt(0, 100);

    val textQuestion : String
    val correctAnswer : Int

    when(selectedCategory){
        "add" -> {
            textQuestion = "$randomNumberOne + $randomNumberTwo"
            correctAnswer = randomNumberOne+randomNumberTwo
        }
        "sub" -> {
            if(randomNumberOne >= randomNumberTwo){
                textQuestion = "$randomNumberOne - $randomNumberTwo"
                correctAnswer = randomNumberOne - randomNumberTwo
            } else {
                textQuestion = "$randomNumberTwo - $randomNumberOne"
                correctAnswer = randomNumberTwo - randomNumberOne
            }
        }
        "multi" -> {

//            Generating small numbers for multiplication
            randomNumberOne = Random.nextInt(0, 16)
            randomNumberTwo = Random.nextInt(0, 16)

            textQuestion = "$randomNumberOne * $randomNumberTwo"
            correctAnswer = randomNumberOne * randomNumberTwo
        }
        else -> {
            if (randomNumberOne == 0 || randomNumberTwo == 0){
                textQuestion = "0 / 1"
                correctAnswer = 0
            } else if (randomNumberOne >= randomNumberTwo){
                   val newBigNumber = randomNumberOne - (randomNumberOne % randomNumberTwo)
                    textQuestion = "$newBigNumber / $randomNumberTwo"
                    correctAnswer = newBigNumber / randomNumberTwo
            } else {
                val newBigNumber = randomNumberTwo - (randomNumberTwo % randomNumberOne)
                textQuestion = "$newBigNumber / $randomNumberOne"
                correctAnswer = newBigNumber / randomNumberOne
            }
        }
    }

}