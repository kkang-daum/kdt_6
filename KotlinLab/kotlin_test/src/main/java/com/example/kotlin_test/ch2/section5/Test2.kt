package com.example.kotlin_test.ch2.section5

fun some(): Int {
    return 50
}

fun main() {
    val a1 = 1

    when(a1){
        1 -> println("a1 is 1")
        2 -> println("a2 is 2")
        else -> {
            println("else...")
        }
    }

    //or...
    when(a1){
        10, 20, 30 -> println("10, 20, 30")//or..
        40, 50 -> println("40, 50")
        some() -> println("some()")
        30 + 30 -> println("60")
    }

    //범위 조건...
    when(a1){
        in 1..10 -> println("aaa")
        in 11..20 -> println("bbb")
        in arrayOf(10, 20, 30) -> println("array")
        in listOf<Int>(40, 50, 60) -> println("list")
    }

    //expression..else 생략 불가능.. 마지막 라인 실행값이 결과 값...
    val result = when(a1){
        1 -> "1"
        2 -> "2"
        else -> {
            println(".....")
            "hello"
        }
    }
    println(result)//1
}