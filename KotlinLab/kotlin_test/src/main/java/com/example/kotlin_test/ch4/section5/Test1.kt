package com.example.kotlin_test.ch4.section5

fun main() {
    //hof 선언...............
    fun myHofFun(arg1: Int, arg2: (Int) -> Int, arg3: (Int) -> Boolean){
        arg1 * 10
        arg2(10) * 19
        if(arg3(10)){ }
    }

    myHofFun(10, { it * it }, { it > 10 })
    myHofFun(10, { it * it}){
        println("hello")
        it > 5
    }
//    myHofFun(10){it * it}{ it > 5}//error.. 마지막 매개변수 하나만..그 매개변수가 함수타입인 경우..

    fun someFun(arg: (Int) -> Unit){ }
    someFun({ println(it)})
    someFun { println(it) }
    someFun {
        println("hello")
        println("world")
    }

    val array = arrayOf(10, 20, 30)
    array.filter({ it > 15 })
        .forEach({ println(it)})

    array.filter { it > 15 }
        .forEach { println(it) }
}