package com.example.kotlin_test.Ch2.Section5

fun calcBouns(salary: Int, bonusRate: Double){

    if (bonusRate < 0){
        print("잘못된 데이터를 입력했습니다")
    } else {
        val bonus = salary * bonusRate
        println("지급받을 보너스는 ${bonus.toInt()} 원 입니다")
    }
}
fun main() {
    calcBouns(1000,-0.25)
    println()
    calcBouns(1000,0.25)
    println()
    calcBouns(1000,0.5)
}