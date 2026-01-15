package b
fun testFun(arr : Array<Int>) =
    println("최고 점수: ${arr.max()}\n최저점수: ${arr.min()}\n점수 총합: ${arr.sum()}\n점수 평균: ${arr.average()}")

fun testFun1 (arr :Array<Int>){
    var max = arr[0]
    var min = arr[0]
    var sum = 0

    for(i in arr){
        if(i> max){
            max = i
        }
        else if (i< min){
            min = i
        }
        sum += i
    }
    val avg = sum/(arr.size)
    
    println("최고 점수: ${max}\n최저점수: ${min}\n점수 총합: ${sum}\n점수 평균: ${avg}")
}

fun main(){
    testFun1(arrayOf(10,5,20,4))
    println()
    testFun1(arrayOf(3,5,1,3))
}