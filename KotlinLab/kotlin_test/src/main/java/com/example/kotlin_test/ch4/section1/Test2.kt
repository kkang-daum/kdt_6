package com.example.kotlin_test.ch4.section1.aa

class User1(val no: Int, val name: String)

data class User2(val no: Int, val name: String){
    var email: String? = null
    constructor(no: Int, name: String, email: String): this(no, name){
        this.email = email
    }
}

fun main() {
    //equals...............................
    val user1 = User1(1, "kim")
    val user2 = User1(1, "kim")
    val user3 = User2(1, "kim")
    val user4 = User2(1, "kim")

    println("""
        ${user1.equals(user2)}
        ${user3.equals(user4)}
        ${user1.equals(user3)}
    """.trimIndent())
    //false
    //true
    //false

    val user5 = User2(1, "kim", "a@a.com")
    val user6 = User2(1, "kim", "b@b.com")
    //data 클래스에 오버라이드 되어 추가되는 equals 함수는 주 생성자에 선언된 멤버 값 비교만 한다..
    println("${user5.equals(user6)}")//true

    //data 클래스의 객체 비교는 일반적으로 값 비교를 원하겠지만..
    //그러나.. 어떤 경우에는 동일 객체인지 주소 비교가 필요한 경우도 있지 않는가???? => ===
    println("${user3.equals(user4)}, ${user3 == user4}, ${user3 === user4}")//true, true, false
    //자바에는 === 이 없다..
    //== => equals() 로 변형..
    //=== => ==

    //toString().....................................................
    println(user1)//com.example.kotlin_test.ch4.section1.aa.User1@5f375618
    println(user3)//User2(no=1, name=kim)
    println(user5)//User2(no=1, name=kim) => 주 생성자의 맴버만 문자열로..

    //destructuring assignment 기법.. 구조 분해 할당 기법..
    //어떤 객체가 있다.. 내가 만들지 않았다.. 변수명 모른다.. 그런데.. 그 객체의 변수 값을 뽑고 싶다..
    val no1 = user3.component1()
    val name1 = user3.component2()
    println("$no1, $name1")//1, kim

    //데이터 클래스에 멤버 변수가 여러개가 있다..
    //어느 순간 그 객체의 멤버 변수 값을 동시에 여러개 획득해야 한다..
    user3.name
    user3.no
    //a, b 순서다...
    val (a, b) = user3
    println("$a, $b")//1, kim

    //멤버가 좀 많다.. 2, 4
    val (_, c) = user3
    println("$c")//kim

    //구조 분해에 의해 데이터를 획득하는 기법은 data 클래스 이외에 collection type 도 지원한다.
    val list = listOf<Int>(1, 2, 3, 4)
    val (e1, e2) = list
    println("$e1, $e2")//1, 2

    val (f1, f2) = list.drop(1)
    println("$f1, $f2")//2, 3

    //software 언어에 tuple 이라는 기법이 있다.. 물론 코틀린은 지원하지 않는다..
    //어떤 함수에서 리턴은 단일 데이터이다.. 그런데.. 여러 데이터를 리턴시킬 수 있는 기법..
//    fun getData(): (Int, Int, Int){
//        return (10, 20, 30)
//    }
//    val (d1, d2, d3) = getData()

    //data 클래스를 이용해서 tuple 기법의 흉내를 낼 수 있다..
    data class ReturnData(var data1: Int, var data2: Int, var data3: Int)
    fun getData(): ReturnData {
        return ReturnData(10, 20, 30)
    }
    val (g1, g2, g3) = getData()
    println("$g1, $g2, $g3")//10, 20, 30

    //위의 튜플 기법은 collection type 으로도 가능..
    fun getData2(): Array<Int>{
        return arrayOf(10, 20, 30)
    }
    val (h1, h2, h3) = getData2()



}