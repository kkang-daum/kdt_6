package com.example.kotlin_test.ch4.section4

//타입 재정의 기법...
//어떤 타입도.. 별칭으로 새로운 이름으로 사용할 수 있다..
typealias MyInt = Int
val a1: MyInt = 10
val a2: Int = 10

typealias MyFunctionType = (Int) -> Boolean

fun main() {
    //함수를 선언하고.. 변수에 대입한 것이다.. 함수 호출구문이 아니다..
    var some = {no: Int -> println("some $no")}
    some(10)

    //some 이 위의 코드에 의해 (Int) -> Unit 타입으로 고정된다.. 타입이 맞지 않다..
//    some = {arg: String -> println("hello")}
    some = {no -> println("some2...$no")}


    //리턴값.......................................
    val some2 = { arg1: Int, arg2: Int ->
        println("some2... $arg1, $arg2")
//        return arg1 + arg2//error... 람다함수에서 return 구문을 명시적으로 사용할 수 없다(기본)
        arg1 + arg2//람다함수의 마지막 라인의 실행 결과값이 리턴 값..
    }
    println("result : ${some2(10, 20)}")//result : 30


    //매개변수가 없다면 -> 생략.........................
    val some3 = {
        println("some3.......")
        10 * 10
    }

    //타입 유추가 된다면.. 타입 생략 가능...
    val f1 = {x: Int -> true}
    val f2: (Int) -> Boolean = {x -> true}
    val f3: MyFunctionType = {x -> true}

    //it.....................................
    val f4:(Int) -> Int = {x -> x * 10}
    println(f4(10))
    val f5:(Int) -> Int = { it * 20 }
    println(f5(10))

    class User(val name: String, val email: String)
    val f6: (User) -> Unit = { println("${it.name}, ${it.email}")}
    f6(User("kim", "a@a.com"))//kim, a@a.com
}


