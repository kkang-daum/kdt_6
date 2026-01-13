package com.example.kotlin_test.ch2.section2

//top - level 에 변수, default 초기화 지원하지 않는다. 선언과 동시에 초기값 지정되어야 한다.
val data1: Int = 10
var data2: Int = 10

class MyClass {
    //class member 변수, default 초기화 지원하지 않는다. 선언과 동시에 초기값 지정되어야 한다.
    val data3: Int = 10
    var data4: Int = 10

    fun someFun(){
        //local variable.. 선언과 동시에 초기값을 지정하지 않아도 상관없다..
        //그렇다고 default 초기화를 지원하는 것은 아니다.. 이용하기 전에는 무조건 초기화 되어 있어야 한다..
        val data5: Int
        var data6: Int

        data5 = 10
        data6 = 10

        val result = data5 + data6

//        data1 = 20//error
        data2 = 20//ok...
    }
}