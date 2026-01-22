package com.example.kotlin_test.ch4.section2.quiz1

enum class DeliveryStatus(val statusMessage: String, val estimatedMinutes: Int) {
    PREPARING("preparing", 15){
        override fun getDetailMessage(): String {
            return "preparing...."
        }
    },
    PICKED_UP("picked up", 5){
        override fun getDetailMessage(): String {
            return "picked up...."
        }
    },
    IN_TRANSIT("in transit", 15){
        override fun getDetailMessage(): String {
            return "in transit...."
        }
    },
    DELIVERED("delivered", 0){
        override fun getDetailMessage(): String {
            return "delivered...."
        }
    }

    ;

    abstract fun getDetailMessage(): String

    fun canCancel(): Boolean {
        return this == DeliveryStatus.PREPARING || this == DeliveryStatus.PICKED_UP
    }
}

fun main() {
    val statuses = DeliveryStatus.values()//모든 상수 List

    for (status in statuses) {
        println("=== ${status.name} ===")
        println("Status: ${status.statusMessage}")
        println("Estimated Time: ${status.estimatedMinutes} minutes")
        println("Detail: ${status.getDetailMessage()}")
        println("Cancellable: ${if (status.canCancel()) "Yes" else "No"}")
        println()
    }

}