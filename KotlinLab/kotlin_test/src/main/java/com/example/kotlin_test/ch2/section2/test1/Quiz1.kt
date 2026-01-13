package com.example.kotlin_lib.ch2_section2
const val DEPARTMENT_SALE = 0
const val DEPARTMENT_DEV = 1
const val DEPARTMENT_MARKETING = 2

var department: Int = DEPARTMENT_DEV

fun calcBonus() {
    if (department == DEPARTMENT_SALE) {
        println("연봉에 1억을 곱한다.")
    } else if (department == DEPARTMENT_DEV) {
        println("연봉에 50억을 곱한다")
    }
}

fun main() {
    calcBonus()
}