package com.example.kotlin_test.ch2.section1

import java.util.Date


//변수, 함수를 top level 에 선언 가능..
//클래스, 객체의 멤버가 아닌 변수, 함수라면(자바에서 static 으로 선언하던..) 굳이 class 로 묶지 않아도 된다.
var sum = 0

fun calSum(){
    for(i in 1..10){
        sum += i
    }
}

//코틀린.. 객체지향을 지원한다..
class User {
    //클래스 멤버..
    val name = "kim"
    fun sayHello(){
        //객체 생성구문이다.. new 예약어는 없다.. 생성자 바로 호출이다..
        val date = Date()
        println("date : " + date)
        println("Hello " + name)
    }
}

fun main() {
    //top level 에 선언된 변수, 함수는 바로 이용..
    calSum()
    println(sum)
    //클래스 멤버는 꼭 객체를 생성하고.. 객체명으로 이용..
    User().sayHello()
}