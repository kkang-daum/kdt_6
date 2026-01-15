package com.example.kotlin_test.ch2.section5

fun main() {
    for(i in 1..10){
        print("$i ")
    }//1 2 3 4 5 6 7 8 9 10

    println()

    for(i in 1 until 10){
        print("$i ")
    }//1 2 3 4 5 6 7 8 9

    println()

    for(i in 1..10 step 2){
        print("$i ")
    }//1 3 5 7 9

    println()

    for(i in 10 downTo 1 step 3){
        print("$i ")
    }//10 7 4 1

    println()

    val array = arrayOf("hello", "world")
    //데이터...
    for(v in array){
       print("$v ")
    }//hello world

    println()

    //index....
    for(i in array.indices){
        print("$i - ${array[i]} ")
    }//0 - hello 1 - world

    println()

    //값, index....
    for((i, v) in array.withIndex()){
        print("$i - $v ")
    }//0 - hello 1 - world

    println()


    //loop 가 반복되면서.. Entry 객체가 대입..
    val map = mapOf<String, String>("one" to "hello", "two" to "world")
    for(item in map){
        println("key : ${item.key}, value : ${item.value}")
    }
    //key : one, value : hello
    //key : two, value : world
}