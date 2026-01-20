package com.example.kotlin_test.ch3.section4

//접근 제한자를 이용해서 singleton 패턴을 구현해 보자..
//singleton : 클래스의 객체..단 하나만 생성하게.. 강제..
//생성자를 private 으로 선언해서..외부에서 마음대로 생성 못하게..
class Singleton private constructor() {
    var data = 0

    //클래스내에.. 멤버를 마치 자바의 static 효과가 나게 하고자 할때..
    //이곳에 선언된 멤버는.. 객체 생성 없이 클래스명으로 접근 가능..
    companion object {
        val instance: Singleton by lazy { Singleton() }
    }
}

//Builder 패턴을 적용한 클래스 선언하는 경우..
//어떤 클래스를 직접 생성하지 못하게 하고.. 그 클래스를 생성하는 역할을 따로 두겠다..
class BuilderTest private constructor(){
    var data = 0

    companion object Builder {
        fun getInstance(): BuilderTest {
            return BuilderTest()
        }
    }
}

fun main() {
    //생성자가.. public 이다.. 외부에서 마음대로.. 생성자 접근이 된다..
    //원하는 만큼 객체 생성이 된다..
//    val obj1 = Singleton()
//    val obj2 = Singleton()

    val obj1 = Singleton.instance
    val obj2 = Singleton.instance
    obj1.data = 10
    obj2.data = 20
    println("${obj1.data}, ${obj2.data}")//20, 20

    val builder = BuilderTest.Builder
    val obj3 = builder.getInstance()
    val obj4 = builder.getInstance()
    obj3.data = 10
    obj4.data = 20
    println("${obj3.data}, ${obj4.data}")//10, 20
}