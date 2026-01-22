package com.example.kotlin_test.ch4.section3.cc

//객체명이자 클래스명(자바)
object ObjectClass {
    fun myFun(){}
}

class Outer {
    object InnerObjectClass {
        val no = 0
        fun myFun(){}
    }
}



fun main() {
//    ObjectClass()//error.. 생성 안된다..
    ObjectClass.myFun()

    //outer 클래스 안에 선언된 경우...
    //outer 객체로 접근 불가능하다..
    //object A { } 형태는 내부적으로 static 으로 만들어진다..
    val obj = Outer()
//    obj.InnerObjectClass.no//errorr...

    Outer.InnerObjectClass.no
    Outer.InnerObjectClass.myFun()
}