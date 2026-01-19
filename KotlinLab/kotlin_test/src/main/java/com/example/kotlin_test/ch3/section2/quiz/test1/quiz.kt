package com.example.kotlin_lib.section9

class User {
    var age:Int = 0
        set(value) {
            if (value < 0) {
                println("runtime error(invalid age)")
            } else {
                field = value
            }
        }
    var password:String = ""
        set(value) {
            if (value.length < 8) {
                println("runtime error (Passwords must be at least 9 characters long")
            } else {
                field = value
            }
        }
    var firstName:String = ""
    var lastName:String = ""

    fun isAdult():Boolean {
        return this.age >= 19
    }


    fun fullName():String {
        return "${this.lastName} ${this.firstName}"
    }
}

fun main() {
    try {
        val user = User()
        user.age = -1 // error 농후
        user.password = "aa" // error 농후
        user.firstName = "park"
        user.lastName = "jaemin"
        user.age = 10
        println(user.isAdult())
        println(user.fullName())
    } catch(e: Exception) {
        e.printStackTrace()
    }
}