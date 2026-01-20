package com.example.kotlin_test.ch3.section3.a1

open class Super {
    fun superFun(){
        println("superFun()....")
    }
}

class Sub1: Super(){
    fun subFun1(){
        println("subFun1()..")
    }
}
class Sub2: Super(){
    fun subFun2(){
        println("subFun2()..")
    }
}

fun main() {
    //하위 -> 상위 : 스마트 캐스팅.. 자동으로 캐스팅 된다..
    //실제 생성된 것은 하위 객체이지만..타입은 상위 타입이다.. 이 객체를 이용할 때는 타입만 보고 이용한다..
    val obj1: Super = Sub1()

    obj1.superFun()
//    obj1.subFun1()//error... Super 에는 subFun 이라는 멤버가 선언되어 있지 않다..

    val obj2: Sub1 = obj1 as Sub1//하위 -> 상위 -> 하위.. 명시적 캐스팅..
    obj2.superFun()
    obj2.subFun1()

//    val obj3: Sub1 = Super() as Sub1//상위 -> 하위.. runtime error..

    val obj4: Sub1 = Sub2() as Sub1//runtime error...
}
