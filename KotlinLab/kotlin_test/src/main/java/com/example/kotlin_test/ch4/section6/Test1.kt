package com.example.kotlin_test.ch4.section6.aa

class Test {
    val data: Int = 10
    fun myFun(){

    }
}

//클래스 외부에서 클래스의 멤버 추가...
//자바로 변경될때 컴파일러에 의해 아래처럼 변경된다..
//확장 대상이 되는 클래스(Test) 타입의 객체를 매개변수에 지정..
//==>정적으로.. 컴파일 타임에..코드를 변경해서.. 확장으로 추가된 멤버가..
//마치 그 클래스내에 선언된 듯 효과가 날 수 있게.. 코드 변경...
//   public static final void extensionFun(@NotNull Test $this$extensionFun) {
//      Intrinsics.checkNotNullParameter($this$extensionFun, "<this>");
//      System.out.println("extensionFun()....");
//   }
fun Test.extensionFun(){
    println("extensionFun()....")
}

fun String.isReverseEqual(): Boolean {
    return this == this.reversed()
}

//extension 기법으로 외부에서 프로퍼티 추가.......
//val Test.extensionData = 10//error...

//val Test.extensionData//error....
//    get() = field

//프로퍼티 확장은 초기 값을 get() 에서 지정해야 하며...
//get()/set() 에서 field 사용할 수 없다..
//==> 자바 변경시에.. 변수가 만들어지면 안된다..
//==>확장은.. 함수 기법이다..
val Test.extensionData //ok.....
    get() = 20

var Test.extensionData2: Int
    get() = 30
    set(value){ }

open class Super {
    fun superFun(){

    }
}
class Sub: Super(){
    fun a(){
        super.superFun()//ok
    }
}
fun Sub.b(){
//    super.superFun()//error..
}

fun main() {
    val obj = Test()
    obj.data
    obj.myFun()
    //이용할 때는.. 그 클래스 내부에 선언된 멤버 이용과 동일하다..
    //extensionFun(obj);
    obj.extensionFun()

    var str: String = "level"
    println(str.isReverseEqual())//true
    str = "hello"
    println(str.isReverseEqual())//false
}