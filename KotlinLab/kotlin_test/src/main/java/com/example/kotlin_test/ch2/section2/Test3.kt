package com.example.kotlin_test.ch2.section2

fun main() {
    //기초 타입이 아니라.. Int 클래스의 객체타입이다..
    val intData: Int = 10
    val result = intData.minus(5)

    val str1 = "Hello \n World"
    val str2 = """
        Hello
        World
    """.trimIndent()

    println(str1)
    println(str2)

    fun sum(no: Int): Int {
        var sum = 0
        for(i in 1..no){
            sum += i
        }
        return  sum
    }
    val name = "kim"

    println("result : " + name + ", sum : " + sum(10))
    println("result : ${name} , sum : ${sum(10)}")
    println("result : $name , sum : ${sum(10)}")

}