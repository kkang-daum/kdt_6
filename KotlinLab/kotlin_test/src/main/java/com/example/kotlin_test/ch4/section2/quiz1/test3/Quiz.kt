package com.example.kotlin_test.ch4.section2.qwer

enum class DeliveryStatus{
    PREPARING{
        override val statusMessage: String = "Preparing"
        override val estimatedMinutes: Int = 15
        override fun getDetailMessage(): String = "preparing......"

    }, PICKED_UP{
        override val statusMessage: String = "Picked Up"
        override val estimatedMinutes: Int = 5      // 마음대로 설정
        override fun getDetailMessage(): String = "picked up......"

    }, IN_TRANSIT{
        override val statusMessage: String = "In Transit"
        override val estimatedMinutes: Int = 20     // 마음대로 설정
        override fun getDetailMessage(): String = "in transit......"

    }, DELIVERED{
        override val statusMessage: String = "Delivered"
        override val estimatedMinutes: Int = 0     // 마음대로 설정
        override fun getDetailMessage(): String = "delivered......"
    };

    // 추상 프로퍼티 , 추상 함수 상속 : 각자 알아서들 설정하자
    abstract val statusMessage: String              // 상태 메세지
    abstract val estimatedMinutes: Int              // 예상 소요 시간
    abstract fun getDetailMessage(): String        // 메세지 반환

    // 그냥 상속: 이건 공용으로 갖다 써라
    fun canCancel(): Boolean = if(this == PREPARING) true else if (this == PICKED_UP) true else false
}



fun main() {

    val statuses = DeliveryStatus.values()

    for (status in statuses) {
        println("=== ${status.name} ===")
        println("Status: ${status.statusMessage}")
        println("Estimated Time: ${status.estimatedMinutes} minutes")
        println("Detail: ${status.getDetailMessage()}")
        println("Cancellable: ${if (status.canCancel()) "Yes" else "No"}")
        println()
    }
}