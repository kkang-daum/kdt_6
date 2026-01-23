package com.example.kotlin_test.ch4.section4

class FuncionTest {
    val method1 = { text: String -> println(text) }
    val method2 = { "Hello method2" }
    val method3: (Int) -> Int = { x ->
        var result = 0
        for (i in 1..x) {
            result += i
        }
        result }
    val method4: (Int, Int) -> Int = { x, y -> x + y }
    val method5: (Int, Int) -> Int? = { x, y -> if (y == 0) null else x / y }
}

fun main() {
    val funTest = FuncionTest()
    funTest.method1("method1 call")
    println(funTest.method2())
    println(funTest.method3(3))
    println(funTest.method4(10, 20))
    println(funTest.method5(4 , 2))
    println(funTest.method5(4 , 0))
}