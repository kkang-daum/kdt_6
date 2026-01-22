package com.example.kotlin_test.ch4.section2

//vs enum...
//하위 타입이라는 의미는 동일하기는 하지만.. 하위 타입의 클래스를 class 예약어로 정식 선언함으로..
//모든 하위 타입의 멤버 변수, 함수를 통일 시키지 않아도 되는 이점이 있다..
sealed class Shape constructor(val x: Int, val y: Int){
    class Circle(x: Int, y: Int, val radius: Int): Shape(x, y)
}
class Rect(x: Int, y: Int, val width: Int, val height: Int): Shape(x, y)

//vs 추상 클래스..
//추상 클래스는.. 생성자 접근 제한자를 public 혹은 private
//sealed 는 private 으로 고정..
//외부 패키지에서.. sealed 클래스를 상속받아 서브클래스를 만들어 사용할 수 없다..
abstract class AClass public constructor() {
    class ASub1(val no: Int): AClass()
}
class ASub2(val no1: Int, val no2: Int): AClass()


fun main() {
    val obj: Shape = Shape.Circle(0, 0, 2)

    //vs... 일반 클래스랑......
    //sealed 예약어가 추가된 클래스의 객체 생성은 안된다..
    //타입으로만 활용 가능하다.. 서브 클래를 생성 대입..
//    Shape()//error..
}