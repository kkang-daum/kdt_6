package com.example.kotlin_test.ch3.section5.aa

interface MyInterface1 {
    fun myFun1()
}
interface MyInterface2 {
    fun myFun2()
}
open class Super {
    fun superFun(){}
}

//상위 클래스는 하나. 단일 상속, 인터페이스는 여러개..
//나열하는 순서가 있지는 않다..
class Sub: Super(), MyInterface1, MyInterface2 {
    override fun myFun1() {

    }

    override fun myFun2() {

    }
}
//class Sub2: MyInterface1, Super(), MyInterface2{}

fun main() {
    val obj1: Sub = Sub()
    obj1.myFun1()
    obj1.myFun2()
    obj1.superFun()

    val obj2: Super = Sub()
//    obj2.myFun1()//error
//    obj2.myFun2()//error
    obj2.superFun()

    //interface.. 타입으로 이용가능..
    val obj3: MyInterface1 = Sub()
    obj3.myFun1()
//    obj3.myFun2()//error...
//    obj3.superFun()//error...
}