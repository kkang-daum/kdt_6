package com.example.kotlin_test.ch2.section3.quiz

//case 1..........overloading..................
//fun plus(): Int {
//    return 0
//}
//fun plus(no1: Int): Int {
//    return no1
//}
//fun plus(no1: Int, no2: Int): Int {
//    return no1 + no2
//}
//fun plus(no1: Int, no2: Int, no3: Int): Int {
//    return no1 + no2 + no3
//}

//case 2 --------------- optional.................
//fun plus(no1: Int = 0, no2: Int = 0, no3: Int = 0): Int {
//    return no1 + no2 + no3
//}

//case 3 ---- optional.... single expression function..
//fun plus(no1: Int = 0, no2: Int = 0, no3: Int = 0): Int = no1 + no2 + no3
//fun plus(no1: Int = 0, no2: Int = 0, no3: Int = 0) = no1 + no2 + no3


//case 4 - vararg..................
fun plus(vararg args: Int): Int {
    var sum = 0
    for(arg in args){
        sum += arg
    }
    return sum
}


fun main() {
    println("${plus()}")
    println("${plus(10)}")
    println("${plus(10, 20)}")
    println("${plus(10, 20, 30)}")
}