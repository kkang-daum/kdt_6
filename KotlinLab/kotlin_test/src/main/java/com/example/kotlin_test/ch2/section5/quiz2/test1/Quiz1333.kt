package a
fun main() {
    val testArr = arrayOf(10,4,20,3)
    println(testFun(testArr))

}

fun testFun(arr: Array<Int>):String {
    var sum = 0
    var crrMax = arr[0]
    var crrMin = arr[0]

    for (i in 0 until arr.size) {
        sum += arr[i]
        if (crrMax < arr[i]) {
            crrMax = arr[i]
        }
        if (crrMin > arr[i]) {
            crrMin = arr[i]
        }
    }
    val mean: Double = (sum / arr.size).toDouble()
    val result = """
        최고 점수: $crrMax
        최저 점수: $crrMin
        점수 총합: $sum
        점수 평균: $mean
    """.trimMargin()
    return result

}