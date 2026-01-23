package com.example.kotlin_lib.section12
class FunctionTest {
    val method1 = {println("method1 call")}
    val method2 = {"Hello method2"}
    val method3: (Int) -> Int = {
        var sum = 0
        for (i in 1..it) {
            sum += i
        }
        sum
    }
    val method4: (Int, Int) -> Int = {x, y -> x + y}
    val method5: (Int, Int) -> Int? = {x, y ->
        if (y == 0) null else x / y
    }
}

fun main() {
    FunctionTest().method1() // method1 call
    println(FunctionTest().method2()) // Hello method2
    println(FunctionTest().method3(10)) // 55
    println(FunctionTest().method4(1, 2)) // 3
    println(FunctionTest().method5(1,2)) // 0
    println(FunctionTest().method5(1,0)) // nul/

}