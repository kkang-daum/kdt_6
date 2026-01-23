package com.example.kotlin_test.ch4.section3

interface DataHandler {
    fun handleData(data: String)
    fun canProcess(dataType: String): Boolean
}

class DataProcessor(val name: String) {
    var isActive: Boolean = true

    companion object {
        const val MAX_BATCH_SIZE = 100
        val processedCount = 0
        fun resetCounter(){
            println("resetCounter()...")
        }
    }

    fun processData(data: String, dataType: String){
        val handler = object : DataHandler {
            override fun handleData(data: String) {
                println("....")
            }

            override fun canProcess(dataType: String): Boolean {
                return true
            }
        }

        if(handler.canProcess(dataType)){
            handler.handleData(data)
        }
    }
}