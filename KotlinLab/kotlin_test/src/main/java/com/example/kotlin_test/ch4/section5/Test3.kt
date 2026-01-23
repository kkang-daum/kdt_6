package com.example.kotlin_test.ch4.section5

data class User(var name: String, var email: String, var phone: String, var address: String){
    fun sayHello(){
        println("Hello $name")
    }
    fun sayInfo(){
        println("my info : $name, $email")
    }
}

fun main() {
    val user = User("kim","kim@a.com","1111", "seoul")

    //어느 순간.. 특정 객체의 멤버를 반복적으로 접근해야 한다면..
    user.name = "lee"
    user.email = "lee@a.com"
    user.sayInfo()
    user.sayInfo()

    //객체 반복 접근..
    val result = user.run {
        name = "park"
        email = "park@a.com"
        sayInfo()
        sayHello()
        10 + 10
    }
    println(result)//20

    //객체 반복 접근..
    val result1 = user.apply {
        name = "park1"
        email = "park1@a.com"
        sayInfo()
        sayHello()
        10 + 10
    }
    //apply 함수를 이용하던 객체가 리턴..
    println(result1)//User(name=park1, email=park1@a.com, phone=1111, address=seoul)

    //람다함수의 매개변수에 객체 대입해준다..
    user.let {
        it.name = "park"
        it.email = "park@a.com"
        it.sayInfo()
        it.sayHello()
        10 + 10
    }

    with(user) {
        name = "park"
        email = "park@a.com"
        sayInfo()
        sayHello()
        10 + 10
    }
}