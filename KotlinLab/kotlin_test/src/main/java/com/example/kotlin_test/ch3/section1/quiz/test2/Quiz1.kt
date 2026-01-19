package com.example.kotlin_test.ch3.section1


//class User(){
//
//    var userName: String? = null
//    var userAge = 0
//
//    constructor (name: String?): this(){
//        userName = name
//    }
//
//    constructor (name: String?, age: Int): this(){
//        userName = name
//        userAge = age
//    }
//
//    fun printUserInfo(){
//        println("name : $userName, age : $userAge")
//    }
//
//}



class User(var name: String? = null, var age: Int = 0){

    fun printUserInfo(){
        println("name : $name, age : $age")
    }
}


fun main() {
    val user1 = User()
    user1.printUserInfo() // name : null, age : 0

    val user2 = User("kim")
    user2.printUserInfo() // name : kim, age : 0

    val user3 = User("kim", 30)
    user3.printUserInfo() // name : kim, age : 30
}