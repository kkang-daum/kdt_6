package com.example.kotlin_test.ch3.section5

abstract class Super {
    val data1: Int = 0
    abstract val data2: Int

    fun myFun1() { }
    abstract fun myFun2()
}

class Sub: Super(){
    //상위에 선언된 추상형을 오버라이드 해서.. 자신의 클래스내에 추상 멤버가 존재하지 않게 해주어야 한다..
    override val data2: Int = 10

    override fun myFun2() {

    }
}

fun main() {
//    val obj1 = Super()//error.. 추상 클래스는 객체 생성해서 직접 이용할 수 없다..

    val obj1 = Sub()
}