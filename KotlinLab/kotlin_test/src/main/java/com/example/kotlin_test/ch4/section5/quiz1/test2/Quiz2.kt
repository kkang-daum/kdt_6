package com.example.kotlin_test.ch4.section5

class KotlinDataLoader {
    fun loadData(url: String, onSuccess: (List<String>) -> Unit, onError: (Exception) -> Unit) {
        println(url)
        onSuccess(listOf("데이터1", "데이터2", "데이터3"))
        try {
            // 일부러 예외 발생을 위한 로직
            url.toInt()
        } catch (e: Exception) {
            onError(e)
        }
    }
}

fun main() {
    KotlinDataLoader().loadData("https://aaa.com", {list -> println(list)}, {error -> println(error)})
}