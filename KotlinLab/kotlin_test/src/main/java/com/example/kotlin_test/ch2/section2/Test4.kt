package com.example.kotlin_test.ch2.section2

fun main() {
    //코틀린에서는 최상위 타입으로 Any 가 선언되어 있어서 코틀린 코드에서 직접 Object 사용 비율은 낮다..
    val data1: Object = Object()
    val data2: Any = data1//Object -> Any : Any 가 Object 의 상위, 하 -> 상 : 암시적 캐스팅
    val data3: Object = data2 as Object //Any -> Object: 상 -> 하 : 명시적 캐스팅..


    //Unit............................
    fun a(): Int {
        return  0
    }
    //Unit.. 주로 함수의 리턴타입으로 사용되어 자바의 void 와 같은 역할..
    fun b(): Unit {

    }
    //함수의 리턴 타입을 명시적으로 선언하지 않으면 자동으로 Unit
    fun c() {

    }

    //Nothing....
    //이 함수에서 에러를 던지거나.. 이 함수가 절대 끝나지 않거나..
    fun d(): Nothing {
        throw Exception()
    }
    fun e(): Nothing {
        while (true){
            println(".")
        }
    }

    //캐스팅.... 코틀린의 모든 변수는 객체이다...
    val a1 = 10//Int
//    val a2: Double = a1//Int -> Double, 암시적 캐스팅.. //error...
//    val a2: Double = a1 as Double//error.. java.lang.ClassCastException
    //Int <-> Double 이 객체임으로.. 두 클래스간에 상하위 관계가 있어야 하는데.. Int 와 Double 은 상하위 관계의
    //클래스들이 아니다..
    //==>캐스팅 자체를 논할 수 없다..
    //함수를 이용해서..
    val a2: Double = a1.toDouble()
    val a3: Int = a2.toInt()

    //String <-> Int
    val b1: String = a1.toString()
    val b2: Int = b1.toInt()


}