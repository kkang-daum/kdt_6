package com.example.kotlin_test.ch3.section5

//interface 와 property...
//==> 자바의 interface에.. static final 이 아닌 변수 추가할 수 없다..

interface MyInterface1 {
    var prop1: Int //ok... 추상형은 함수이야기다.. getter/setter 함수가 추상형이 된다..

//    val prop2: String = "kim"//error..
    //프로퍼티를 선언하면서.. = 로 값을 지정하게 되면.. 값이 유지되어야 한다.
    //그럴려면 변수가 선언되어야 한다.. 자바 인터페이스에서 허용하지 않는다..

    //추상형으로 만들지 않아서.. 오버라이드 강제할 목적의 프로퍼티가 아니라면.. get(), set() 작성

    //field 가 프로퍼티의 get(), set() 예약어인것은 맞지만.. field 예약어가 지칭하는 것은 변수 자체이다..
    //인터페이스 변수 허용안한다.. field 못쓴다.
//    val prop3: String //error...
//        get() = field

    //var 이다.. get() 은 정상구현했고, field 를 사용하지 않았지만.. var 이다.. set() 도 있다..
    //자동 추가되는 set() 에 field 를 가져서..
//    var prop4: String
//        get() = "kim"

    var prop5: String
        get() = "kim"
        set(value){

        }
}