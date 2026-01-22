package com.example.kotlin_test.ch4.section3.aa

class Outer1 {
    var no: Int = 0

    val innerObj = object {
        val innerData = 0
        fun innerFun(){
           no++
        }
    }

    fun outerFun(){
//        innerObj.innerData//error
//        innerObj.innerFun()//error
    }
}

class Outer2 {
    var no: Int = 0

    //object { } 는 내부적으로 Any 타입으로 이용이 되어 .. outer 에서 object {} 의 멤버 이용이 불가능..
    //단 private 을 추가해서.. outer에서만 사용하겠다고 보장하면.. 컴파일러 기법으로 가능하게.. 코드 양산..
    private val innerObj = object {
        val innerData = 0
        fun innerFun(){
            no++
        }
    }

    fun outerFun(){
        innerObj.innerData//error
        innerObj.innerFun()//error
    }
}

fun main() {
    val obj1 = Outer1()
//    obj1.innerObj.innerData//error
//    obj1.innerObj.innerFun()//error

    val obj2 = Outer2()
//    obj2.innerObj.innerData//error
//    obj2.innerObj.innerFun()//error
}