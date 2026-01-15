package com.example.kotlin_test.ch2.section5.t1

fun calcBonus(salary: Int = 0, bonusRate: Double = 0.0){
    if (salary<0 || bonusRate<0) {
        println("잘못된 데이터를 입력했습니다")
    }
    else{
        println("지급받을 보너스는 ${salary*bonusRate} 입니다.")
    }

}

fun main() {
    calcBonus(1000, -0.25)
    calcBonus(1000,0.25)
    calcBonus(1000,0.5)
}