package com.example.kotlin_test.ch2.section7

var data1: String = "kim"//non - null
var data2: String? = "kim"//nullable

fun main() {
//    data1 = null//error..
    data2 = null//ok....


    //casting.................................
    var data3: String? = data1//ok.... String -> String?
    data3 = data2//ok.... String? -> String?

    var data4: String = data1//ok..
//    data4 = data2//error.... String? -> String

    //Nullable 타입인데.. 정상적인 데이터를 가지는 경우..
    data2 = "lee"
    data4 = data2 as String//ok... String? -> String 명시적..

    //Nullable 타입인데.. null 인 상황..
    data2 = null
//    data4 = data2 as String//runtime error...

    //nullable 로 선언된 객체를 명시적 캐스팅을 할 때는 런타임 에러 가능성이 있다.. as? 로 해야 한다..
    //as? - 왼쪽 객체가.. null 이면.. 캐스팅을 진행하지 않는다.. 전체 null 반환만 한다..
//    data4 = data2 as? String//compile error..

    //as? 는 null 을 반환할 수도 있다.. 왼쪽 대입되는 객체의 타입은 non-null로 선언되어 있다.. 타입이 맞지 않는다.
    //왼쪽에 대입되는 객체를 nullable 로 바꾸면 되겠지만...
    //null 인 경우 대체..
    data4 = data2 as? String ?: ""//ok........

    //operator................................
    data1.length
//    data2.length//error....
    data2?.length

    var length: Int? = data2?.length
    var length2: Int = data2?.length ?: 0

    class Address {
        var city: String? = "seoul"
    }
    class User {
        var adddress: Address? = Address()
    }

    val user: User? = User()
    println(user?.adddress?.city)

    //null 이 아닌 경우.. 특정 구문이 실행되거나..
    //null 인 경우 특정 구문이 실행되거나..
    user?.let {
        //null 이 아닌 경우.. 코드......
    } ?: {
        //null 인 경우 실행될 코드..
    }

}