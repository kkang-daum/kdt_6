fun main() {

    fun plus(vararg a1: Int): Int{
        var num: Int = 0
        for(a in a1){
            num += a
        }
        return num
    }

    println("${plus()}")
    println("${plus(10)}")
    println("${plus(10, 20)}")
    println("${plus(10, 20, 30)}")
}