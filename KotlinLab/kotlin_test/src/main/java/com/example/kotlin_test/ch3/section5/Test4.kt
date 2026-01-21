package com.example.kotlin_test.ch3.section5.bb

interface A1 {
    fun funA()
}
interface A2 {
    fun funA()
}
abstract class A3 {
    abstract fun funA()
}

//상속 클래스, 인터페이스에 이름이 동일한 함수가 선언되었지만.. 모두 추상형이라면..
//오버라이드 받기만 하면 된다..
class Sub: A3(), A1, A2 {
    override fun funA() {

    }
}

interface B1 {
    fun funB(){ }
}
interface B2 {
    fun funB(){ }
}
//구현하고 있는 인터페이스에 추상형이 없다..
//함수명이 동일해서 충돌..  추상함수가 아님에도 불구하고 오버라이드 해주어야 하는 상황..
class Sub2: B1, B2 {
    override fun funB() {
        //인터페이스의 정상함수를 호출할 수도 있다.. 어떻게 식별해서..? 제네릭으로 명시해서.. 호출..
        super<B2>.funB()
        super<B1>.funB()
    }
}