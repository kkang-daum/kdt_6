package com.example.kotlin_test.ch4.section3


//Nested class (용어)
class Outer1 {
    var no: Int = 0
    fun outerFun(){

    }
    class Inner {
        var a = 10
        fun some(){
            a++
            //nested class 는 자바의 static inner class 이다..
            //static 구성요소에서 object 멤버 못 건드린다.
//            no++ //error
//            outerFun()//error
        }
    }
}

//inner(예약어) class
class Outer2 {
    var no: Int = 0
    fun outerFun(){

    }
    inner class Inner {
        var a = 10
        fun some(){
            a++
            //inner 예약어.. 자바의 object inner class
            //이 클래스가 이용되려면.. outer 클래스의 객체가 생성되어야 한다..
            no++
            outerFun()
        }
    }
}

fun main() {
    //nested 객체 생성
    val obj = Outer1.Inner()

    //inner 객체 생성..
//    val obj2 = Outer2.Inner()//error...
    val obj2 = Outer2().Inner()

}