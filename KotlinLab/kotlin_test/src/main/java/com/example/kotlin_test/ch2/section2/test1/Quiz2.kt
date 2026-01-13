package com.example.kotlin_lib.ch2_section2

fun main() {
    val data1 = 10
    val data2: Double = data1.toDouble()
    val data3: Int = data2.toInt()

    println("data1: $data1, data2: $data2, data3: $data3")

    val str = "10"
    val intStr: Int = str.toInt() // Casting String to Int
    val str2: String = 20.toString() // Casting Int to String
    println("int Str: $intStr, str2: $str2")
    println("${str + 10}, ${intStr + 10}") // String + 10이라서 -> String으로 10이 암시적 캐스팅이 진행되어서 1010 일케 나옴
}