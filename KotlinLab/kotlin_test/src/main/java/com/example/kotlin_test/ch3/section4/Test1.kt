package com.example.kotlin_test.ch3.section4

open class Shape {
    var x: Int = 0
    var y: Int = 0
    lateinit var name: String
    open fun print(){
        println("$name : $x, $y")
    }
}

fun draw(shape: Shape){
    shape.print()
}
//rect 1 : 0, 0, 0, 0
//circle 1 : 0, 0, 0

//위에까지는 상위 클래스 작성자가 작성한 코드...
//이 코드를 작성하는 동안은.. Shape 라는 클래스만 인지하고.. Shape 의 print() 라는 함수만 인지한다..
//이 코드까지 보면.. draw() 에 의해 Shape 의 print() 가 호출되게 작성한 코드이다..

//다른 개발자들이 아래의 클래스를 선언....
class Rect: Shape(){
    var width: Int = 0
    var height: Int = 0

    //함수 명을 새롭게 지정하면.. 상위 함수 상속된다.. 전혀 다른 행위가 두개가 된다..
//    fun printRect(){
//
//    }

    //상위 함수명과 동일하게 작성했지만.. 매개변수를 다르게 주었다.. 상위 함수 상속된다..
    //print() 함수 두개 선언이다.. 즉.. 오버로딩 기법으로 함수 추가이다..
//    fun print(arg: Int){ }

    //상위에 함수가 선언되어 있지만.. 동일 이름으로.. 내 알고리즘으로 대체하고 싶다면.. ==> 오버라이드..
    override fun print(){
        println("$name : $x, $y, $width, $height")
    }
}

class Circle: Shape(){
    var r: Int = 0

    override fun print() {
        println("$name : $x, $y, $r")
    }
}

fun main() {
    val rect = Rect()
    rect.name = "rect 1"
    draw(rect)

    val circle = Circle()
    circle.name = "circle 1"
    draw(circle)
}