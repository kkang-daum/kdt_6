package com.example.kotlin_test.ch2.section3

//tailrec test..........................

fun loopPrint(no: Int = 1){
    var count = 1
    while(true){
        println("loop print...")
        if(no == count) break
        else count++
    }
}

//위 함수의 알고리즘을 재귀 알고리즘으로 작성한다고 가정..
fun loopPrint2(no: Int = 1, count: Int = 1){
    println("loop print...")
    return if(no == count) return else loopPrint2(no - 1, count)
}

tailrec fun loopPrint3(no: Int = 1, count: Int = 1){
    println("loop print...")
    return if(no == count) return else loopPrint3(no - 1, count)
}

fun main() {
//    loopPrint(2)

//    loopPrint2(2)

    loopPrint3(2)
}