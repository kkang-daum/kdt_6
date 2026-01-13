package com.example.kotlin_test.ch2.section2

import kotlin.random.Random
import kotlin.random.nextInt

//val... 값 변경이 불가능하기는 하지만.. 상수변수는 아니다.. 상수변수를 만들려면 const 이용해야 한다..
//자바에서는 변수를 field, 코틀린에서는 변수를 property 로 이용한다..
//field - 값만을 표현하는 변수..
//property - 값과 값을 획득하고, 변경할 수 있는 setter/getter 함수를 내장한 변수..
//val 로 선언된 변수를 이후에 값을 변경할 수는 없지만..
//개발자가 val 변수를 선언하면서 내장된 getter 함수를 customizing 해버리면 동일 값이 참조된다고 보장할 수 없어서..
//val valData = 10


//top level...
const val myConst: Int = 10
//const var myConst2: Int = 10//error.. var 불가...

class MyClass {
    //class member 변수는 상수변수로 선언할 수가 없다..
    //클래스의 멤버는 객체가 생성될 때마다.. 매번 메모리 할당이 되는데..
    //상수변수가 가능하다면.. 동일한 값을 가지고.. 변경도 안되는 값이 메모리에 여러번 할당? 옳은가?
//    const val myConst3 = 30//error...

    //object 블록 내에서 선언되는 상수변수.. 가능..
    //익명 클래스 선언 기법.. 객체가 단일 객체로 생성이 된다.. 객체가 하나만 생성되는 기법이다..
    //그래서 object 내에서만은 가능하게 허용한다.
    object A {
        const val myConst5 = 10
    }

    fun some() {
        //상수 변수는 컴파일러 기법이다..
        //함수 내부에 선언된 변수는 그 함수가 실행되어야 판단할 수 있다..
        //runtime 시에 결정된다..
//        const val myConst6 = 40//error...
    }
}


val valData: Int
    get() {
        return Random.nextInt(0, 100)
    }

fun main() {
    println(valData)
    println(valData)
}