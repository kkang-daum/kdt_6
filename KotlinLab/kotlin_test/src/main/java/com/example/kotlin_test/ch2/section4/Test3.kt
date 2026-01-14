package com.example.kotlin_test.ch2.section4

//Iterator... collection type 의 객체를 Iterator 로 이용해서 동일 API 로 핸들링..

fun main() {
    val list = listOf<String>("hello", "world")
    val iterator1 = list.iterator()
    while (iterator1.hasNext()){//데이터가 더 있는지 판단..
        println(iterator1.next())//현 순서의 데이터 획득..
    }

    val set = setOf<String>("hello", "world")
    val iterator2 = set.iterator()
    while (iterator2.hasNext()){
        println(iterator2.next())
    }

    val array = arrayOf("hello", "world")
    val iterator3 = array.iterator()
    while (iterator3.hasNext()){
        println(iterator3.next())
    }

    val map = mapOf<String, String>("one" to "hello", "two" to "world")
    val iterator4 = map.iterator()
    while (iterator4.hasNext()){
        //map 은 데이터가 항상 key 과 매핑되어 유지됨으로.. next() 에 의해 획득되는 것이 value 가 아니라..
        //Key - Value 를 가지는 Entry 객체이다..
        val entry: Map.Entry<String, String> = iterator4.next()
        println("${entry.key} - ${entry.value}")
    }
}