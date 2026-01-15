package com.example.kotlin_test.ch2.section5

fun main() {
    //if 문을 조건문으로 활용...
    val a = 5

    if(a < 10) println("$a < 10")

    if(a > 0 && a <= 10){
        println("a > 0 && a <= 10")
    }else if(a > 10 && a <= 20){
        println("a > 10 && a <= 20")
    }else {
        println(" a > 20 ")
    }

    //expression.................
    if(a > 10) "hello"

    //expression 으로 활용이 되면 else 를 생략할 수 없다..
//    val result = if(a > 10) "hello"//error...
    val result = if(a > 10) "hello" else "world"
    println(result)//world

    //expression 으로의 값을 명시적으로 return 구문으로 지정할 수는 없다..
    //마지막 라인의 실행 결과값...
    val result2 = if(a < 10){
        println("hello....")
        10 + 20
    }else {
        println("world....")
        20 + 20
    }
    println(result2)//30

    //else if 로 반복 조건을 명시할 수 있지만.. expression 으로 활용이 된다면 else 생략 불가..
    val result3 = if(a > 10) 20
    else if(a > 20) 30
    else 10
    println(result3)//10
}