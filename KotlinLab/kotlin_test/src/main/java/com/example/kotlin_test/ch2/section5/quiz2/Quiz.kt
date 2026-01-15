package com.example.kotlin_test.ch2.section5.quiz2


fun testFun(array: Array<Int>){
    var maxScore = 0
    var minScore = 100
    var sumScore = 0
    var avgScore = 0

    for(value in array){

        if(minScore > value) minScore = value

        if(maxScore < value) maxScore = value

        sumScore += value
    }

    avgScore = sumScore / array.size

    println("max : $maxScore")
    println("min : $minScore")
    println("sum : $sumScore")
    println("avg : $avgScore")

}

fun main() {
    testFun(arrayOf(10, 5, 20, 4))
    testFun(arrayOf(3, 5, 1, 10, 20))
}