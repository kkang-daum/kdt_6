package com.example.kotlin_test.ch2.section6

fun main() {
    //전개 연산자........................
    fun some(arg1: Int, vararg arg2: String){

    }
    some(10, "hello", "world")
    val array = arrayOf("hello", "world")
    //vararg 가 추가된 매개변수가 그 함수내에서는 배열로 이용되지만..
    //함수 호출자 입장에서는 String 타입 데이터 여러개..
//    some(10, array)//error...
    //기본으로는 아래처럼 배열 데이터를 넘겨야 하는데..
    some(10, array[0], array[1])
    //배열의 모든 데이터를 넘기고 싶다면..
    some(10, *array)

    //List 데이터를 전개연산자로.. 나열.. 배열로 만들어서 나열시켜야...
    val list = listOf<String>("hello", "world")
//    some(10, *list)//전개연산자는 배열에..//error..
    some(10, *list.toTypedArray())

    //일치 연산자................................................
    //일반 객체, ==, === 모두.. 주소 비교..
    class User

    val user1 = User()
    val user2 = User()
    val user3 = user1
    println("${user1 == user2}, ${user1 === user2}, ${user1 == user3}, ${user1 === user3}")
    //false, false, true, true

    //기초 타입의 객체...
    //코틀린에서 객체는 맞지만.. 기초 타입의 객체가 컴파일 될때.. 자바의 int 타입으로 변형되어..
    //모두 값 비교..
    val data1: Int = 10
    val data2 = 10
    val data3 = data1
    println("${data1 == data2}, ${data1 === data2}, ${data1 == data3}, ${data1 === data3}")
    //true, true, true, true


    //연산자 재정의.............
    //어떤 클래스내에 함수로 연산자를 재정의하고..
    //그 객체에 연산자를 사용했을 때.. 개발자가 원하는대로 동작하게..
    class MyClass(val no: Int){
        operator fun plus(arg: Int): Int {
            return no - arg
        }
    }

    val obj = MyClass(10)
    val result = obj + 5
    println(result)//5

    class MyList {
        val list1 = mutableListOf<String>()
        val a = 10

        operator fun plus(str: String){
            list1.add(str)
        }
        operator fun minus(str: String){
            if(str in list1)
                list1.remove(str)
        }
        fun printList(){
            println(list1.joinToString())
        }
    }

    val myList = MyList()
    myList + "seoul"
    myList + "busan"
    myList.printList()
    myList - "busan"
    myList.printList()

    fun a(){}
    val b: Unit = a()
}