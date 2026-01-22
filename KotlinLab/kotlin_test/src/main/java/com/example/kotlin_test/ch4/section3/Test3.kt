package com.example.kotlin_test.ch4.section3.bb

interface SomeInterface {
    fun interfaceFun()
}

open class SomeClass {
    fun someFun(){ }
}

val obj1: SomeInterface = object : SomeInterface {
    override fun interfaceFun() {

    }
}

val obj2 = object : SomeClass(){

}

val obj3: SomeClass = object : SomeClass(), SomeInterface {
    override fun interfaceFun() {

    }
}

val obj4: SomeInterface = object : SomeClass(), SomeInterface {
    override fun interfaceFun() {

    }
}

fun main() {
    obj1.interfaceFun()
    obj2.someFun()

    obj3.someFun()
//    obj3.interfaceFun()//error

//    obj4.someFun()//error
    obj4.interfaceFun()
}