package com.example.kotlin_test.ch2.section5

fun main() {
    var x = 0
    var sum = 0
    while(true){
        sum += ++x
        if(x == 10) break
    }
    println(sum)//55

    aaa@ for(i in 1..3){
        for(j in 1..3){
            if(j > 1) break@aaa
            println("$i $j")
        }
    }
}