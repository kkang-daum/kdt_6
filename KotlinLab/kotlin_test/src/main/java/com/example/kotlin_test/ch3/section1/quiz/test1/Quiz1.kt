package com.example.kotlin_test.ch3.setction1

class User() {
    private var name: String? = null
    private var age: Int = 0

    constructor(name: String?) : this() {
        this.name = name
    }

    constructor(name: String?, age: Int) : this(name) {
        this.age = age
    }

    fun printUserInfo() {
        println("name : ${this.name}, age : ${this.age}")
    }
}

// 위의 코드로 먼저 작성한 다음에 축약..
// 이렇게 사용할 수도 있지 않을까..
class User1(private var name : String? = null, private var age : Int = 0) {
    fun printUserInfo() {
        println("name : ${this.name}, age : ${this.age}")
    }
}

fun main() {
    val user1 = User()
    user1.printUserInfo()   // name:null, age:0

    val user2 = User("kim")
    user2.printUserInfo()   // name:kim, age:0

    val user3 = User("kim", 30)
    user3.printUserInfo()   // name:kim, age:30

    // User1 클래스 ==========================================
    val user4 = User1()
    user4.printUserInfo()   // name:null, age:0

    val user5 = User1("kim")
    user5.printUserInfo()   // name:kim, age:0

    val user6 = User1("kim", 30)
    user6.printUserInfo()   // name:kim, age:30
}