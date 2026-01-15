package c
fun testFun(arr: Array<Int>){

    var max = 0
    var min = arr[0] //비교를 위해 배열의 첫번째 값을 주고 시작
    for (i in 0  until arr.size){
        if(arr[i] > max) max = arr[i]
        if (arr[i] < min) min = arr[i]
    }
    println("최고 점수: $max")
    println("최저 점수: $min")
    //점수 총합 구하기
    var sum = 0
    for(score in arr){
        sum += score
    }
    println("점수 총합: $sum")
    println("점수 평균: ${sum / arr.size}")
}

fun main(){
    testFun(arrayOf(10, 5, 20, 4))
    testFun(arrayOf(3, 5, 1, 3))
}