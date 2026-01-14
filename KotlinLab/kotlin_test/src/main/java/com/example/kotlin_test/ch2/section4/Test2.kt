package com.example.kotlin_test.ch2.section4

//List, Set, Map................................

fun main() {
    val list1: List<String> = listOf("hello", "world")//immutable...
    println("${list1.get(0)}, ${list1[1]}")
//    list1.set(1, "aaa")//error
//    list1.add("bbb")//error..

    val list2: MutableList<String> = mutableListOf("hello", "world")//mutable.....
    list2.add("aaa")
    list2.set(0, "bbb")
    list2[1] = "ccc"
    println(list2)//[bbb, ccc, aaa]

    val map: Map<String, String> = mapOf(Pair("a1", "kim"), "a2" to "lee")//immutable...
    println("${map.get("a1")}, ${map["a2"]}")
//    map.add("a3" to "park")//error...
//    map["a1"] = "park"//error....

    val map2: MutableMap<Int, String> = mutableMapOf(10 to "kim", 20 to "lee")//mutable...
    map2.put(30, "park")
    println(map2)//{10=kim, 20=lee, 30=park}

    //set...............................
    val set1: Set<String> = setOf("hello", "world", "hello")
    println("${set1.elementAt(0)}")//hello
    println(set1)//[hello, world]

    val list3 = listOf<String>("hello", "world", "hello")
    println(list3)//[hello, world, hello]

}