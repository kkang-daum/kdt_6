package com.example.kotlin_test.ch2.section5

val salary = 1000
val bonusRate = 0.5

fun calcBonus(salary: Int, bonusRate: Double) {
    when {
        salary <= 0 || bonusRate <= 0 -> println("잘못된 입력입니다.")
//        salary <= 0 && bonusRate == 0.25 -> println("지급 받을 보너스는 ${salary / bonusRate}원 입니다.")
//        salary <= 0 && bonusRate == 0.5 -> println("지급 받을 보너스는 ${salary / bonusRate}원 입니다.")
        else -> println("지급 받을 보너스는 ${salary / bonusRate}원 입니다.")
    }
}

fun main() {
    calcBonus(0, 0.5)
    calcBonus(1000, -0.5)
    calcBonus(1000, 0.25)
    calcBonus(1000, 0.5)
}
