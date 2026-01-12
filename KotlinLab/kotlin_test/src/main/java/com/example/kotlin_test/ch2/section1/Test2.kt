package com.example.kotlin_test.ch2.section1

//다른 패키지에 선언된 변수, 함수, 클래스는 import 해서..
import com.example.kotlin_test.ch2.section1.two.twoData
import com.example.kotlin_test.ch2.section1.two.twoFun

import java.util.Date
//별칭으로 import.. 이 이름으로 사용되는 범위는 이 파일내에서만..
import java.sql.Date as SqlDate

fun main() {
    //동일 패키지의 코틀린 파일에 선언된.. 멤버는 import 없이..
    println(oneData)
    oneFun()
    
    println(twoData)
    twoFun()

    val data1 = Date()//java.util.Date
    val date2 = SqlDate(System.currentTimeMillis())//java.sql.Date
}