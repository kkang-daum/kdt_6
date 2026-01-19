package com.example.kotlin_test.ch3.section2

//class Product1 {
//    var id: Int = 0
//    var name: String = ""
//    var price: Int = 0
//
//    constructor(id: Int, name: String, price: Int){
//        this.id = id
//        this.name = name
//        this.price = price
//    }
//    fun getId() = id
//    fun setId(id: Int){
//        this.id = id
//    }
//    fun getName() = name
//    fun setName(name: String){
//        this.name = name
//    }
//    fun getPrice() = price
//    fun setPrice(price: Int){
//        this.price = price
//    }
//}

class Product2 {
    var id: Int = 0
    var name: String = ""
    var price: Int = 0

    constructor(id: Int, name: String, price: Int){
        this.id = id
        this.name = name
        this.price = price
    }
}

class Product3(val id: Int, var name: String, var price: Int)

fun main() {
    val obj2 = Product2(1, "product 1", 100)
    obj2.name = "product 11"
    obj2.price = 200
    println("${obj2.name}, ${obj2.price}")


//    class User1 {
//        var name: String = "kim"
//        val age: Int = 20
//    }

    //위의 클래스는 아래처럼 작성되어 있는 것과 동일하다..
//    class User1 {
//        var name: String = "kim"
//            get() = field
//            set(value) {
//                field = value
//            }
//        val age: Int = 20
//            get() = field
//    }

    //개발자는 변수만 선언해서 이용하다가.. 필요한 경우 getter/setter를 직접 정의..
    class User1 {
        var name: String = "kim"
            set(value){
                field = "Hello " +value
            }
            get() = field.uppercase()

        var age: Int = 20
            set(value) {
                if(value > 0)
                    field = value
                else
                    field = 0
            }
    }

    val user1 = User1()
    user1.name = "lee"
    println("${user1.name}, ${user1.age}")//lee, 20


    class Test {
//        val data1: String//error... default 초기화 지원하지 않는다..

        //custom accessor 를 추가하고.. get() 에서 초기값을 지정하면 선언하는 라인에서 초기값을 지정하지 않을 수도 있다..
        val data1: String
            get() = "kim"

        var data2: String//error.. custom get() 을 추가하고.. 초기값을 지정했지만.. 에러..
            //var 임으로.. set() 이 자동으로 추가된다.. set() 내에서 field 를 이용한다..
            //field 가 있으면 초기값 주어야 한다..
            //field 가 존재하면.. 자바 변경시에 변수가 나오고 그 초기값을 지정해야 해서..
            get() = "kim"
            set(value){
                data2 = value
            }
    }
    

}