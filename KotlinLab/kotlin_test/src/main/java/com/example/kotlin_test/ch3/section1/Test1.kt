package com.example.kotlin_test.ch3.section1

fun main() {
    //클래스 선언.. 주생성자로...
    class MyClass1 { }
    class MyClass2() { }
    class MyClass3 constructor() { }
    //모두 매개변수 없는 주 생성자를 가지는 클래스들이다..

    val obj1 = MyClass1()
    MyClass2()
    MyClass3()

    //원한다면.. 생성자 매개변수 선언.................
    class User1 constructor(name: String, age: Int) { }
    class User2(name: String, age: Int) { }
    class User3(name: String, age: Int = 0){ }//생성자 매개변수.. default argument 추가 가능.. 옵셔널이 된다.

    User1("kim", 20)
    User2("lee", 25)
    User3("park", 30)
    User3("hong")


    //init block...................................
    //주 생성자는 클래스 선언위치에 선언됨으로.. 주 생성자의 실행 영역을 { }로 추가할 수 없다..
//    class User4(){ }{ }//error
    class User4(){
        //init 예약어로 선언되는 영역... 생성되는 순간 호출..
        init {
            println("init.....")
        }
    }
    User4()//init.....


    //주 생성자의 매개변수의 활용 범위..
    //생성자도 함수의 일종이다..매개변수의 기본은 함수 내에서만 사용할 수 있는 local variable(지역변수)이다..
    class User5(name: String, age: Int){
        val myName = name//ok...

        init {
            println("$name, $age")//ok....
        }
        fun sayHello(){
            println("$myName")
//            println("$name, $age")//error...
        }
    }

    //주 생성자의 매개변수에 var, val 을 추가하는 순간.. 이 매개변수는 곧 클래스 멤버 변수가 된다..
    class User6(val name: String, val age: Int){
        val myName = name//ok...

        init {
            println("$name, $age")//ok....
        }
        fun sayHello(){
            println("$myName")
            println("$name, $age")//ok...
        }
    }

    class User7(var name: String, var age: Int)

    val obj = User7("kim", 20)
    println("${obj.name}, ${obj.age}")
    obj.name = "lee"
    obj.age = 30
    println("${obj.name}, ${obj.age}")


}