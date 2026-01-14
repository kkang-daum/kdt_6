fun plus(a1:Int=0, a2:Int=0, a3: Int=0) = a1+a2+a3

fun plus2(vararg a:Int):Int{
    var some =0
    for (i in a){
        some+=i
    }
    return some
}

// 가변인수 활용

fun main(){
    println(plus2())
    println(plus2(10))
    println(plus2(10,20))
    println(plus2(10,20,30))
}