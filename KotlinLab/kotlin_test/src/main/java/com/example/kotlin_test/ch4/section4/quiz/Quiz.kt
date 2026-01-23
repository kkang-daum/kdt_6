package com.example.kotlin_test.ch4.section4.quiz

class FunctionTest {
    val method1 = { println("method1 call")}

    val method2 = { "method2 call" }

    val method3: (Int) -> Int = {
        var sum = 0
        for(i in 1..it){
            sum += i
        }
        sum
    }

    val method4: (Int, Int) -> Int = { x, y -> x + y}

    val method5: (Int, Int) -> Int? = { x, y ->
        if(y == 0)
            null
        else
            x / y
    }
}