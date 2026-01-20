package com.example.kotlin_test.ch3.section3

//기본이 클래스는 final.. 상속금지..
//상속에 의한 서브 클래스 선언을 가능하게 하려면 명시적으로 open
open class Shape {

    constructor(a: Int){}
    constructor(a: Int, b: Int){}

    var x = 0
    var y = 0
    var name = ""

    fun print(){
        println("name : $name, x - $x, y - $y")
    }
}

//하위 클래스에서 상위 생성자 호출 안할 수 없다..
class Rect: Shape(10, 20) {
    var width = 0
    var height = 0
}


fun main() {
    val obj = Rect()
    obj.name = "rect1"
    obj.x = 10
    obj.y = 20
    obj.print()
    println("${obj.name} ${obj.x} ${obj.y} ${obj.width}, ${obj.height}")
}


//생성자 연결 관계...............................
//1. 주 생성자가 선언되어 있다면.. 보조 생성자로 객체 생성시에 주 생성자 실행되게.. 연결해야..
//2. 하위 생성자 호출시에.. 상위 생성자 연결..
open class Super(name: String){
    constructor(name: String, no: Int): this(name)
}

class Sub1: Super {
    constructor(name: String): super(name)
    constructor(name: String, no: Int): super(name, no)
}

class Sub2(name: String): Super(name) {
    constructor(name: String, no: Int): this(name)
}
