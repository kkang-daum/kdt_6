package com.example.kotlin_test.ch4.section5

fun main() {

    //람다함수...
    val fun1: (Int) -> Int  = {
        println("hello")
//        return it * 10//error.. 람다함수에 return 구문 사용 불가가 기본..
        it * 10
    }

    //익명함수...
    val fun2 = fun(x: Int) = x * 10//single expression function
    fun2(10)

    val fun3 = fun(x: Int): Int{
        println("hello")
        return x * 10//ok.. return 사용 가능..
    }

    //익명 함수를 hof 함수의 매개변수로.....................
    fun hofFun(argFun: (Int) -> Int){
        argFun(10)
    }
    hofFun { it * 10 }
    hofFun(fun(x: Int): Int { return x * 10 })


    //함수 참조 정보로 hof 이용하는 경우..............................
    //정상 함수가 선언되어 있다. 이 함수를 다른 함수의 매개변수에 지정하고 싶다..
    fun some(no: Int): Int { return no - 10 }
//    hofFun(some(10))//error...
//    hofFun(some)//error....
    hofFun(::some)//ok... 참조정보로 전달..


    class User {
        fun myFun(no: Int): Int { return no - 10 }
    }
//    hofFun(User().myFun())//error..
//    hofFun(User::myFun)//error
    hofFun(User()::myFun)
}