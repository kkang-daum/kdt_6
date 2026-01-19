package com.example.kotlin_test.ch3.setction2

class User {
    var age: Int = 0
        set(value) {
            // 0 이상인 수만 field 저장
            if (value > 0) {
                field = value
            } else {
                // 0 미만 수는 예외 던지기
                throw Exception("invalid age")
            }
        }

    var password: String = ""
        set(value) {
            // password가 8자리 이상만 field 저장
            if (value.length >= 8) {
                field = value
            } else {
                // 8자리 미만인 경우 예외 던지기
                throw Exception("Passwords must be at least 8 characters long.")
            }
        }

    lateinit var firstName: String
    lateinit var lastName: String

    // 나이 20이상(성인) true, 20살 미만 false
    val isAdult: Boolean
        get() = age >= 20

    // firstName와 lastName에 대해 초기화 값이 적용 되었는지 확인
    val fullName: String
        get() = if (::firstName.isInitialized && ::lastName.isInitialized) {
            "$firstName $lastName"
        } else {
            // 둘중 하나가 초기화 전이라면 예외 던지기
            throw Exception("firstName or lastName is initialized")
        }
}

fun main() {
    try {
        val user = User()

//        user.age = -1 // runtime error (invalid age)
//        user.password = "aa" // runtime error (Passwords must be at least 8 characters long.)

        user.age = 10
        user.firstName = "gildong"
        user.lastName = "hong"

        println(user.isAdult)       // false
        println(user.fullName)      // gildong hong
    } catch (e: Exception) {
        e.printStackTrace()
    }
}