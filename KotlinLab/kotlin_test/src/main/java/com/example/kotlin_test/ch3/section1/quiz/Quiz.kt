package com.example.kotlin_test.ch3.section1.quiz

//case 1..............
//class User {
//    var name: String? = null
//    var age: Int = 0
//
//    constructor(){ }
//    constructor(name: String?){
//        this.name = name
//    }
//    constructor(name: String?, age: Int){
//        this.name = name
//        this.age = age
//    }
//
//    fun printUserInfo(){
//        println("name : $name, age: $age")
//    }
//}

//case 2........................
//class User {
//    var name: String? = null
//    var age: Int = 0
//
//    constructor(name: String?, age: Int){
//        this.name = name
//        this.age = age
//    }
//
//    constructor(): this(null, 0){ }
//    constructor(name: String?): this(name, 0){ }
//
//
//    fun printUserInfo(){
//        println("name : $name, age: $age")
//    }
//}

//case 3...................
//class User(var name: String?, var age: Int){
//    constructor(): this(null, 0)
//    constructor(name: String): this(name, 0)
//    fun printUserInfo(){
//        println("name : $name, age: $age")
//    }
//}

class User(var name: String? = null, var age: Int = 0){
//    constructor(): this(null, 0)
//    constructor(name: String): this(name, 0)
    fun printUserInfo(){
        println("name : $name, age: $age")
    }
}

fun main() {
    val user1 = User()
    user1.printUserInfo()

    val user2 = User("kim")
    user2.printUserInfo()

    val user3 = User("kim", 30)
    user3.printUserInfo()
}