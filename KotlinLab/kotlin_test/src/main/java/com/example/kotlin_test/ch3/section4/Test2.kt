package com.example.kotlin_test.ch3.section4

//top level
//property, function, class
val topData1  = 10
private val topData2 = 10

open class Super {
    val publicData = 10
    protected val protectedData = 10
    private val privateData = 10

    fun some(){
        println("$publicData, $protectedData, $privateData")
    }
}

class Sub: Super(){
    fun test(){
        println("$publicData, $protectedData")
//        println($privateData)//error
    }
}

class MyClass {
    fun test(){
        val obj = Super()
        println(obj.publicData)
//        println(obj.protectedData)//error
//        println(obj.privateData)//error
    }
}

fun main() {
    println(topData1)
    println(topData2)//private... 동일 파일 내에서는 사용 가능..
}