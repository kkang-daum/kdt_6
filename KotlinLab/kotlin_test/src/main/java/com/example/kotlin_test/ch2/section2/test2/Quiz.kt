class Quiz{
    val DEPARTMENT_SALE = 0
    val DEPARTMENT_DEV = 1
    val DEPARTMENT_MARKETING = 2

    val department = DEPARTMENT_DEV

    fun calcDonus(){
        if(department == DEPARTMENT_SALE){
            println("연봉에 10을 곱한다.")
        }else if(department == DEPARTMENT_DEV){
            println("연봉에 50을 곱한다.")
        }
    }
}

fun main(){
    val data1 = 10
    val data2 = data1.toDouble()
    val data3 = data2.toInt()

    println("data1: $data1, data2: $data2, data3: $data3")

    val str = "10"
    val intStr = str.toInt()
    val str2 = 20.toString()

    println("intStr: $intStr, str2: $str2")
    println("${str + 10}, ${intStr + 10} ")
}