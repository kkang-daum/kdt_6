package com.example.kotlin_lib.section12.adwh

class KotlinDataLoader {
    fun loadData(url:String,
                 onSuccess: (List<String>) -> Unit,
                 onError: (Exception) -> Unit ) {
        val baseUrl = url
        val testList:List<String> = listOf("d","a","t","a")
        try {
            onSuccess(testList)
        } catch (e: Exception) {
            onError(e)
        }
    }
}

fun main() {
    val baseUrl = "https://kotlinishard.com"

    val onSuccess:(List<String>) -> Unit = {println("Data: $it on Success")}
    val onError: (Exception) -> Unit = {println("Data load Exception: $it")}

    KotlinDataLoader().loadData(baseUrl, onSuccess, onError)

}