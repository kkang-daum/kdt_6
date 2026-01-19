package com.example.kotlin_test.ch3.section2

fun main() {
    //property 초기화.. 선언하는 라인에서 초기화 시키지 않고 이후에 값을 지정하는 경우..

    //case1 - nullable 로 선언하고.. null 로 초기화..
    //==>non - null 로 이용되는 변수를 굳이 nullable 로 선언하고.. null 로 초기화 시키는 것은 권장하지 않는다.
    class User1 {
        var data1: String? = null
        var data2: Int? = null
    }

    //case2.. class member property 에 한해서.. init 에서 초기화..
    //==>class member 변수는 꼭 객체를 생성하고 이용. 객체 생성하면 최초.. init 부분은 무조건 실행..
    //선언 라인에서 초기화 시키지는 않았지만.. 이용되기 전에 꼭 초기화는 된다..
    class User2 {
        var data1: String
        var data2: Int
        init {
            data1 = "kim"
            data2 = 0
        }
    }

    //lateinit 으로.. 초기값을 지정하지는 않았지만.. 컴파일 에러를 발생시키지 마라..
    //==>non-null로 이용.. 선언과 동시에 초기값을 줄 수는 없지만.. 꼭 초기화하고 사용할 것이다..
    class User3 {
        lateinit var data1: String
//        lateinit val data2: String//error... val 을 사용할 수 없다..
//        lateinit var data3: Int//error..... 기초 타입의 객체에는 사용할수 없다..
//        lateinit var data4: String?//error.. nullable 은 null로 초기화 시켜도 되는 것 아닌가?

        fun someFun(){
            //lateinit 은 초기화 되기 전에 이용되면 runtime error 가능성이 있다..
            //사용하기 전에.. 초기화 된 것인지 체크가 필요할 수도 있다..
            //:: 참조정보 할당하는 코틀린의 표현식..
            if(::data1.isInitialized){
                println(data1)
            }else {
                data1 = "hello"
            }
            println(data1)
        }

        //외부에서.. 클래스 밖에서.. 직접 클래스 내부에 선언된 lateinit 프로퍼티를 isInitialized 로 확인할 수 없다.
        //클래스 밖에서 호출하여.. 최기화 되어 있는지 확인하는 함수를 하나 만들어 줘야 한다..
        fun checkInitialize(): Boolean {
            return ::data1.isInitialized
        }
    }

    val obj = User3()
    obj.someFun()
    if(obj.checkInitialize()){
        obj.data1
    }

    //by lazy........................
    class User4 {
        //by lazy { } 이 실행되고.. 이 { } 결과값으로 초기화 된다..
        //마지막 라인의 결과가 값이다..
        //선언되었다고.. by lazy { } 가 실행되는 것은 아니고.. 어디선가.. 이 property를 이용하는 순간 최초 한번..
        //==>초기화 시키기 위해서 특정 로직이 실행되어야 하는데.. 그 로직이 성능에 부담스러운 코드다..
        //미리 할 필요가 있는가? 이 변수가 사용안될 수도 있는데.. 실제 이용할때 하자..
        val name: String by lazy {
            println("i am lazy....")
            "hello"
        }

        constructor(){
            println("constructor...")
        }
    }

    println("1.....")
    val obj4 = User4()
    println("2.....")
    println(obj4.name)
    println("3.....")
    println(obj4.name)
    println("4.....")
    //1.....
    //constructor...
    //2.....
    //i am lazy....
    //hello
    //3.....
    //hello
    //4.....
}