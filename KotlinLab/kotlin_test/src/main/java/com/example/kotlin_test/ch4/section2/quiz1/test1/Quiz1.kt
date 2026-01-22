package com.example.kotlin_test.ch4.section2

enum class DeliveryStatus (val estimatedMinutes:Int, val statusMessage: String){
    PREPARING(30,"Preparing food"){

        override fun getDetailMessage(): String{
            return "preparing"
        }
    }, PICKED_UP(5, "delivery man picked up"){
        override fun getDetailMessage(): String {
            return "picked up"
        }
    }, IN_TRANSIT(10,"Delivering"){
        override fun getDetailMessage(): String{
            return "in transit"
        }
    }, DELIVERED(5,"Delivery completed"){
        override fun getDetailMessage(): String{
            return "delivered"
        }
    }
    ;

    fun canCancel(): Boolean{
        if(this== DeliveryStatus.PREPARING || this== DeliveryStatus.PICKED_UP){
            return true
        }else {
            return false
        }
    }
    abstract fun getDetailMessage(): String
}

fun main() {
    val statuses = DeliveryStatus.values()

    for(status in statuses){
        println("===${status.name}===")
        println("Status: ${status.statusMessage}")
        println("Estimated Time: ${status.estimatedMinutes} minutes")
        println("Detail: ${status.getDetailMessage()}")
        println("Cancellable: ${if (status.canCancel()) "Yes" else "No"}")

    }
}