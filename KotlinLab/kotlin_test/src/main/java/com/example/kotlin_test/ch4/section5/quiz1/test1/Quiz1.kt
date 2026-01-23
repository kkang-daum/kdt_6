package com.example.kotlin_test.ch04.section5

class KotlinDataLoader{
    fun loadData(
        url: String,
        onSuccess: (List<String>) -> Unit,
        onError: (Exception) -> Unit) : Unit
    {
        try {
            onSuccess(listOf("$url", "성공"))

        }catch (e: Exception){
            onError(e)

        }
    }
}
fun main() {
    val loader = KotlinDataLoader()

    loader.loadData(
        url = "주소",
        onSuccess = { list ->
            list.forEach {
                println(it)
            }
        },
        onError = { e ->
            println("${e.message}")
        }
    )
}
