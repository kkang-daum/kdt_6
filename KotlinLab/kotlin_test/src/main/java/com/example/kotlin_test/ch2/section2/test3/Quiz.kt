package com.example.kotlin_test.ch2.section02

const val DEPARTMENT_SALE: Int = 0
const val DEPARTMENT_DEV: Int = 1
const val DEPARTMENT_MARKETING: Int = 2

fun main() {
    val data1 = 10
    val data2: Double = data1.toDouble()
    val data3: Int = data2.toInt()

    println("data1 : $data1, data2 : $data2, data3 : $data3")

    val str = "10"
    val intStr: Int = str.toInt()
    val str2: String = 20.toString()

    println("int Str : $intStr, str2 : $str2")
    println("${(str + 10)} , ${intStr + 10}")

    val quiz01 = Quiz01()
    quiz01.calcBonus()
}

class Quiz01 {
    var department: Int = DEPARTMENT_DEV

    fun calcBonus(): Unit {
        if (department == DEPARTMENT_SALE) {
            println("연봉에 10을 곱한다.")
        } else if (department == DEPARTMENT_DEV) {
            println("연봉에 50을 곱한다.")
        }
    }
}