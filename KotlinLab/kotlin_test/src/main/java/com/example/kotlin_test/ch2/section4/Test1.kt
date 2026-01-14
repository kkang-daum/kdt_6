package com.example.kotlin_test.ch2.section4

fun main() {
    //arrayOf() 로 배열 객체 만드는 방법... 배열 변수 선언과 동시에 값 지정이 가능한 경우..
    val array1 = arrayOf(1, "hello", false)//Array<Any>
    array1[0] = 10
    array1[2] = true
    println("${array1[0]}, ${array1.get(1)}, ${array1.get(2)}, ${array1.size}")//10, hello, true, 3

    //타입을 한정해서.. 제네릭으로..
    val array2 = arrayOf<Int>(10, 20)

    //기초 데이터에 해당되는 xxxArrayOf() 함수도 제공된다.. 자바 호환성 측면에서 제공하는 것이다..
    intArrayOf(10, 20)
    booleanArrayOf(true, false, true)

    //사이즈를 지정하고.. 값을 이후에 할당하는 경우...
    //두번째.. 람다함수를 size 만큼 호출하고.. 그 람다함수의 리턴 값으로.. 초기값 지정..
    val array3 = Array<Int>(3, { 0 })
    println(array3[0])
    val array4 = Array<Int>(3, {i -> i* 10})
    println("${array4[0]}, ${array4[1]}, ${array4[2]}")//0, 10, 20

    //기초 데이터를 담기 위한 XXXArray 클래스가 별도로 선언되어 있다.. 자바 호환성을 위해서..
    IntArray(3, { 0})
    IntArray(3, { a -> a * 10 })
}