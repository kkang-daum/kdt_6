package com.example.kotlin_test.ch4.section5.quiz1

//나는 선임 개발자다..
//우리 앱에서 서버 네트워킹이 수십번, 수백번 발생한다..
//코드 중복이 너무 심하다..
//내가 네트워킹을 대신 해주는 공통 코드를 개발해 주겠다..

class KotlinDataLoader {
    //서버 연동시 url 은 모두 다른데? ==> 매개변수로 전달하라..
    //서버에서 넘어온 데이터를 핸들링 하는 부분이 다른데.. ==> 함수로 전달하라.. 호출해 주겠다..
    //서버연동 에러가 발생했을때 처리하는 부분이 다른데.. ==>함수로 전달하라.. 호출만 하겠다..
    fun loadData(
        url: String,
        onSuccess: (List<String>) -> Unit,
        onError: (Exception) -> Unit
    ){
        try{
            //멋진 네트워킹 되었다고 가정하고..
            //서버데이터..
            val result = mutableListOf<String>("hello", "world")
            onSuccess(result)
        }catch (e: Exception){
            onError(e)
        }
    }
}

fun main() {
    val obj = KotlinDataLoader()

    obj.loadData(
        "http://www.google.com",
        {
            println("success data : $it")
        }, {
            println("error : $it")
        }
    )
}