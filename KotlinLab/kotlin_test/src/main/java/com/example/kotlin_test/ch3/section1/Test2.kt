package com.example.kotlin_test.ch3.section1

fun main() {
    //보조 생성자 1개만 선언 : 주 생성자는 자동 추가되지 않는다..
    class MyClass1 {
        constructor(arg: String)
    }
    MyClass1("aaa")

    //보조 생성자 여러개 선언.. 생성자 오버로딩...
    class MyClass2 {
        constructor(){ }
        constructor(arg1: String) { }
        constructor(arg1: String, arg2: String){}
    }
    MyClass2()
    MyClass2("hello")
    MyClass2("hello", "world")

    //보조 생성자.. init 같이 선언된 경우....
    //보조 생성자가 선언된 경우에도 init 추가 가능하고.. 객체 생성 시점에 init 부분 실행된다..
    //init 부분이 먼저 실행되고.. 생성자 body 부분이 실행된다..
    //==>주 생성자의 경우 body 를 명시할 수 없어서.. 주생성자를 선언하는 경우 실행 로직을 담기 위해서 init 을 주로 사용
    //==>보조 생성자를 위해서 init 을 추가하는 것이 문제되지는 않지만.. 보조 생성자는 { } 에 모두 추가할 수 있음으로
    //init 사용 비율이.. 떨어진다..
    class MyClass3 {
        init {
            println("init...")
        }
        constructor(){
            println("constructor...")
        }
    }
    MyClass3()
    //init...
    //constructor...

    //보조 생성자의 매개변수 이용 범위....
    //보조생성자에서만 사용이 가능하다.. val, var 추가 불가하다.. 멤버변수로 만들 수 없다..
//    class MyClass4 {
//        init {
//            println("arg1 : $arg1")//error..
//        }
//        constructor(val arg1: String){//error...
//            println("arg1 : $arg1")
//        }
//        fun myFun(){
//            println("arg1 : $arg1")//error
//        }
//    }

    //주 생성자와 보조 생성자 관계..........................
    class MyClass5(arg1: String){
//        constructor(arg1: String, arg2: String){//error..
//
//        }
        //주 생성자가 선언되어 있다면.. 보조 생성자에서는 꼭 주생성자를 호출해야 한다. this() 로..
        //다른 생성자를 호출하는 구문.. this(), super() 는... 생성자 선언위치에...
//        constructor(arg1: String, arg2: String){
//            this(arg1)//error..
//        }

        constructor(arg1: String, arg2: String): this(arg1){
        }

        //보조 -> 주 생성자 호출..
//        constructor(arg1: String, arg2: String, arg3: String): this(arg1){//ok...
//
//        }
        //보조 -> 보조 생성자 호출가능하다.. 어떻게 생성자가 연결되든.. 객체 생성시점에..
        //주 생성자가 무조건 실행되게 만들면 된다..
        constructor(arg1: String, arg2: String, arg3: String): this(arg1, arg2){//ok...

        }
    }
}