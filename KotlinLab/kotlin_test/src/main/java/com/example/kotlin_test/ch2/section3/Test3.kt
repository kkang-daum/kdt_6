package com.example.kotlin_test.ch2.section3

//중위 표현식. 가변인수................

//중위 표현식으로 이용할 수 있는 함수는...
//객체의 멤버 함수, extension 기법으로 선언된 함수에 한해서만..
//매개변수가 하나인 경우..

//Int 라는 클래스가 있다고 가정하자.. 여기에.. 개발자가 임의로 Int 의 멤버함수를 추가한다는 가정이다.
//=>extension 기법..
infix fun Int.myIntFun(x: Int): Int {
    return  x + x
}

class FunClass {
    infix fun myFun(a: Int){
        println("data : $a")
    }
}

fun main() {
    //중위 표현식....................................
    val obj = FunClass()
    obj.myFun(10)//ok...
    obj myFun 10

    10.myIntFun(10)
    10 myIntFun 10

    fun testFun(a1: Int, vararg a2: String){
        //가변 인수는.. 함수 내부에서는 배열이다..
        for(a in a2){
            println(a)
        }
    }

    testFun(10, "hello","world")
    testFun(10, "hello","world", "kim")
}