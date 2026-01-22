package com.example.kotlin_test.ch4.section2

enum class Direction {
    NORTH, SOUTH
}

//임의 데이터 추가해서 사용하고 싶다면................................
enum class Direction2(val no: Int, val email: String){
    NORTH(10, "aaa@a.com"), SOUTH(20, "bbb@.com")
}

//함수...추가.....
//상수가 이용되는 타입이.. enum 클래스 타입이다.
enum class Direction3 {
    NORTH {
        //멤버 변수, 멤버 함수 추가 가능한가? ==> 가능..
        //상수 클래스에서 로직상 필요해서 마음껏 추가하고 이용할 수 있기는 하지만..
        //상수는 항상 enum class 타입으로만 이용이 되어.. 외부에서는 접근할 수 없다..
        val northData = 10
        fun northFun(){}

        override fun someFun() {
            northData
            northFun()
            println("north.. someFun()")
        }
    }, SOUTH{
        override fun someFun() {
            println("south.. someFun()")
        }
    }
    ;
    //상위(enum class)에 함수 선언.. 하위(상수) 함수 오버라이드
    abstract fun someFun()
    //추상형이 아닌.. 일반 함수 추가 가능한가?
    //클래스 body 에 멤버 변수 선언 가능한가?
    //모두 가능하고.. 상수가 대입된 객체에서 사용가능하다..
    val superData = 10
    fun superFun(){}
}

fun main() {
    val data: Direction = Direction.NORTH
    println("${data.name}, ${data.ordinal}")//NORTH, 0

    val data2: Direction2 = Direction2.SOUTH
    println("${data2.name}, ${data2.ordinal}, ${data2.no}, ${data2.email}")//SOUTH, 1, 20, bbb@.com

    val data3: Direction3 = Direction3.NORTH
    data3.someFun()//north.. someFun()
    data3.superData
    data3.superFun()
//    data3.northData//error
}