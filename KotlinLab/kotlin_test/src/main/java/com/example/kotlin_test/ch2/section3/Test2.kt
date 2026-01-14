package com.example.kotlin_test.ch2.section3

//default argument, named argument test.............................

fun main() {
    fun myFun(name: String = "kim", no: Int){
        println("Hello.. $name, no : $no")
    }

    //함수 호출의 기본은.. 선언된 매개변수의 갯수 및 순서를 맞추어서..
//    myFun(10)//error
//    myFun(10, "lee")//error..
    myFun("lee", 10)//ok....

    //이름을 명시해서.. 매개변수 지정..
    myFun(name = "lee", no = 10)
    //이름이 명시되었다면.. 순서는 의미가 없다.. 순서를 맞추지 않아도 된다..
    myFun(no = 10, name = "lee")

    //default argument 가 선언된 매개변수에 한해서는 optional 로 생략 가능하다..
//    myFun(name = "lee")//error
    myFun(no = 10)//ok...



    fun myFun2(arg1: String, arg2: Int = 10, arg3: String = "hello", arg4: Int){ }

    //갯수, 순서를 맞추어서...
    myFun2("aa", 20, "bb", 30)
    //named argument 로 정확하게 지정하던가..
    myFun2(arg4 = 30, arg1 = "aa", arg3 = "bb", arg2 = 40)

    //option 을 생략해서..
    //optional 로 선언된 매개변수는 생략이 가능하지만.. 매개변수 값의 매핑이 명료해져야 한다..
//    myFun2("aa", 10)//error..
    myFun2(arg1 = "aa", arg4 = 10)
}

