class FunctionTest(){
    val method1 = {-> println("method1 call") }
    val method2 = { -> "hello method2" }
    val method3 = { a: Int ->
        var sum =0
        for(i in 1..a) {
            sum+= i
        }
        sum
    }

    val method4 = {a: Int, b: Int -> a + b}
    val method5 = {a:Int,b:Int ->
        if(b==0){
            null
        } else{
            a/b
        }
    }
}

fun main() {
    FunctionTest().method1()
    println(FunctionTest().method2())
    println(FunctionTest().method3(10))
    println(FunctionTest().method4(10,20))
    println(FunctionTest().method5(10,0))
    println(FunctionTest().method5(10,2))
}