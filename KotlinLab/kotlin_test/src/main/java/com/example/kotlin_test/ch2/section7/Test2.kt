package com.example.kotlin_test.ch2.section7

fun main() {
    //일반 객체....
    class User

    val user1: User = User()
    val user2: User? = User()
    val user3: User? = user1
    println("${user1 == user2}, ${user1 === user2}, ${user1 == user3}, ${user1 === user3}")
    //false, false, true, true
    //일반 객체는 non-null, nullable 모두 객체비교이다.. ==, === 모두 객체 비교이다..

    //기초 타입 - non-null
    val data1 = 1000
    val data2 = 1000
    println("${data1 == data2}, ${data1 === data2}")//true, true
    //기초 타입의 객체가 non-null 로 선언되면.. 자바로 변형시에 primitive type 으로 변형된다.. 객체가 아니다..
    //값을 비교할 수밖에 없다..

    //기초 타입 - nullable.....
    val data3: Int? = 1000
    val data4: Int? = 1000
    println("${data3 == data4}, ${data3 === data4}")//true, false
    //? 로 선언.. null 대입이 가능해 저야 한다.. 자바로 변형시에 객체로 변형할 수밖에 없다.. Integer...
    //Int 를 wrapper 클래스인 Integer 로 변형시켜서.. Boxing 효과...
    //값을 비교 하고 싶은 경우(==), 객체를 비교하고 싶은 경우(===)
}