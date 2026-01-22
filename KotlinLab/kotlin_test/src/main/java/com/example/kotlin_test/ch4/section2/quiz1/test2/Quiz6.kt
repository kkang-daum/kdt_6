package com.example.kotlin_study.ch2.Quiz
enum class DeliveryStatus(val statusMessage: String, val estimatedMinutes: Int)
{
    PREPARING("준비중", 10) {
        override fun getDetailMessage(): String {
            return "preparing..."
        }
    },
    PICKED_UP("픽업완료", 15) {
        override fun getDetailMessage(): String {
            return "picked up..."
        }
    },
    IN_TRANSIT("배달중", 20) {
        override fun getDetailMessage(): String {
            return "in transit..."
        }
    },
    DELIVERED("배달완료", 5) {
        override fun getDetailMessage(): String {
            return "delivered..."
        }
    };

    abstract fun getDetailMessage(): String
    fun canCancle(): Boolean = (this == PREPARING || this == PICKED_UP)
}

fun main() {

    val statuses = DeliveryStatus.values()

    for (status in statuses) {
        println("===${status.name}===")
        println("Status: ${status.statusMessage}")
        println("Estimated Time: ${status.estimatedMinutes} minutes")
        println("Deatil: ${status.getDetailMessage()}")
        println("Cancellable: ${if(status.canCancle()) "Yes" else "No"}")
        println()
    }
}