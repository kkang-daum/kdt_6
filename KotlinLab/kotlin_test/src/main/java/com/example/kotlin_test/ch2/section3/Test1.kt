package com.example.kotlin_test.ch2.section3

fun myFun(){}//top level...

class MyClass {
    //class member(method)....
    fun fun1(){
        //local function... 어떤 함수 내부에 선언된 함수..
        fun fun2(){}

        fun2()//ok...
    }
}

fun main() {
    myFun()//top level... ok...
    //객체 생성후.. 객체를 이용해서 호출..
    MyClass().fun1()
    //어떤 함수 내에 선언된 변수(local variable), 함수(local function) 은 선언된 위치의 함수내에서만 사용가능
//    fun2()//error..
//    MyClass().fun2()//error..
//    MyClass().fun1().fun2()//error..

    //함수의 매개변수에는 val, var 추가 불가.. 기본으로 val 로 인지..
//    fun some(arg1: Int, arg2: Int): Int {
//        return arg1 + arg2
//    }

    //위의 함수를 축약형으로.. single expression function
//    fun some(arg1: Int, arg2: Int): Int = arg1 + arg2

    //single expression function 은 타입 유추가 가능해서.. 리턴 타입을 생략 가능...
    fun some(arg1: Int, arg2: Int) = arg1 + arg2

    val result : Int = some(10, 20)
    println(result)


    //overloading...
    //동일 위치에.. 동일 이름의 함수를 여러개 선언이 가능하기는 하지만..
    //매개변수는 다르게.. 갯수... 타입
    fun myFun(a: String){ }
    fun myFun(a: Int){ }
    fun myFun(a: String, b: Int){ }

    myFun("hello")
    myFun(10)
    myFun("hello", 10)
}