package com.example.kotlin_test.ch2.section3


fun main() {
    fun plus(a:Int = 0, b:Int = 0, c:Int = 0): Int {
        return a + b + c
    }

    println("${plus()}")
    println("${plus(10)}")
    println("${plus(10, 20)}")
    println("${plus(10, 20, 30)}")


}