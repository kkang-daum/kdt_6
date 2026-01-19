package com.example.kotlin_test.ch3.section2.quiz.aaa

class User {
    var firstName: String? = null
    var lastName: String? = null

    var age: Int = 0
        set(value) {
            if(value >= 0)
                field = value
            else
                throw Exception("invalid age")
        }

    var password: String? = null
        set(value) {
            if(value?.length ?: 0 < 8){
                throw Exception("Passwords must be at least 8 characters long")
            }else {
                field = value
            }
        }

    val isAdult: Boolean
        get() = age >= 18

    val fullName: String
        get() = "$firstName $lastName"
}

fun main() {
    try {
        val user = User()

//        user.age = -1//runtime error(invalid age)
//        user.password = "aa"//runtime error (Passwords must be at least 8 characters long.)
        user.age = 10
        user.firstName = "gildong"
        user.lastName = "hong"

        println(user.isAdult)//false
        println(user.fullName)//gildong hong
    } catch (e: Exception) {
        e.printStackTrace()
    }

}