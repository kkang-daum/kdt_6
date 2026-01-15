package com.example.kotlin_test.ch2.section5.quiz1

//case 1 - java
//fun calcBonus(salary: Int, bonusRate: Double): String {
//    var result = ""
//    if(salary < 0 || bonusRate < 0){
//        result = "wrong value"
//    }else {
//       result = "bonux ${salary * bonusRate}"
//    }
//    return result
//}

//case 2 -

//fun calcBonus(salary: Int, bonusRate: Double): String {
//    var result = if(salary < 0 || bonusRate < 0){
//        "wrong value"
//    }else {
//        "bonux ${salary * bonusRate}"
//    }
//    return result
//}

//case 3
//fun calcBonus(salary: Int, bonusRate: Double): String {
//    return if(salary < 0 || bonusRate < 0){
//        "wrong value"
//    }else {
//        "bonux ${salary * bonusRate}"
//    }
//}

//case 4
fun calcBonus(salary: Int, bonusRate: Double) = if(salary < 0 || bonusRate < 0){
        "wrong value"
    }else {
        "bonux ${salary * bonusRate}"
    }


fun main() {
    println(calcBonus(1000, -0.25))
    println(calcBonus(1000, 0.25))
    println(calcBonus(1000, 0.5))
}