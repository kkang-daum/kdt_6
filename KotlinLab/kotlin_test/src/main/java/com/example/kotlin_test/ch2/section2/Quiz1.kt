package com.example.kotlin_test.ch2.section2

const val DEPARTMENT_SALE = 0
const val DEPARTMENT_DEV = 0
const val DEPARTMENT_MARKETING = 0

class Quiz1 {
    val department = DEPARTMENT_DEV

    fun calcBonus() {
        if(department == DEPARTMENT_SALE){
            println("연봉에 10을 곱합니다.")
        }else {
            println("연봉에 50을 곱합니다.")
        }
    }
}

fun main() {
    val data1: Int = 10
    val data2: Double = data1.toDouble()
    val data3: Int = data2.toInt()

    println("data1 : $data1, data2 : $data2, data3 : $data3")

    val str = "10"
    val intStr = str.toInt()
    val str2 = 20.toString()
    println("int str : $intStr, str2 : $str2")
    println("${str + 10}, ${intStr + 10}")
}