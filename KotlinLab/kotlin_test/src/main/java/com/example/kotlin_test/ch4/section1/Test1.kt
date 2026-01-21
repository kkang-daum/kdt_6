package com.example.kotlin_test.ch4.section1

class User1()

//data class User2()//error. - 주생성자를 가져야 하고.. 하나 이상의 매개변수가 선언되어야 한다.

//data class User2(name: String)//error.. 매개변수는 멤버변수로 선언해야..

//data class User2(val name: String, age: Int)//모든 매개변수가 멤버 변수...

//data abstract class User2(val name: String, val age: Int)//abstract open 등의 예약어 같이 사용 불가..

data class User2(val name: String, val age: Int)//ok....

//data 클래스는 클래스의 바디를 못가지는 것일까? ==> 가능..
data class User3(val name: String) {
    //바디에.. 다른 멤버 변수선언. 멤버 함수 선언 가능한가?
    //==>바디에 다른 멤버 변수, 함수. 생성자 선언 가능하다..
    //바디에 선언된 것은 data 클래스에서 주는 이점과는 전혀 관련이 없다..
    var age = 0
    fun someFun(){}
    constructor(name: String, age: Int): this(name)
}