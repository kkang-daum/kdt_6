package com.example.kotlin_test.ch4.section3.dd

class Outer1{
    companion object AA {
        var no = 0
        fun myFun(){}
    }

    fun someFun(){
        //companion object... static... object 멤버가 static 활용 가능..
        no++
        myFun()
    }
}

class Outer2{
    companion object {
        var no = 0
        fun myFun(){}
    }

    fun someFun(){
        //companion object... static... object 멤버가 static 활용 가능..
        no++
        myFun()
    }
}

fun main() {
    Outer1.AA.no ++
    Outer1.AA.myFun()
    Outer1.no++
    Outer1.myFun()

    //companion object { } 에 이름을 추가하지 않았다면 자동으로 Companion 이름이 추가된다.
    Outer2.Companion.no++
    Outer2.Companion.myFun()
    Outer2.no++
    Outer2.myFun()

}