package com.example.kotlin_test.ch2.section8

fun some(array: Array<Any>){
    try {
        println("try top.....")

        val data1: Int = array[0] as Int

        val data2: String = array[2] as String

        val data3: Int = data2.toInt()
    }catch (e: ClassCastException){
        println("ClassCastException............")
    }catch (e: ArrayIndexOutOfBoundsException){
        println("ArrayIndexOutOfBoundsException..........")
    }catch (e: Exception){
        //나머지 기타 등등..
        println("Exception.... ${e.toString()}")
    }
}

fun some1(arg: String): Int {
    val result = try {
        println("try... ")
        arg.toInt()
    }catch (e: Exception){
        println(e.toString())
        0
    }finally {
        println("finally")
        100
    }
    return result
}

fun main() {
//    some(arrayOf("0", 1, "6"))//ClassCastException............

//    some(arrayOf(10, "5"))//ArrayIndexOutOfBoundsException..........

//    some(arrayOf(10, 0, "hello"))//Exception.... java.lang.NumberFormatException

    println(some1("10"))//10
    println(some1("hello"))//0
}