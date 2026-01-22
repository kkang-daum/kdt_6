package com.example.kotlin_lib.section11

enum class CoffeeSize(val price:Int = 0){
    SMALL(250),
    MEDIUM(350),
    LARGE(500)
}


sealed class OrderStatus() {
    abstract fun orderPrint():String
    class Pending(val orderNumber:Int,
                  val size: CoffeeSize,
                  val price: Int = size.price,
                  val orderStatus: String = "order pending",
    ): OrderStatus(){
        override fun orderPrint(): String {
            return "order number: $orderNumber, size: $size, price: $price, $orderStatus "
        }
    }
    class Done(val orderNumber:Int,
               val size: CoffeeSize,
               val price: Int = size.price,
               val orderStatus: String = "order done",
    ): OrderStatus() {
        override fun orderPrint(): String {
            return "order number: $orderNumber, size: $size, price: $price, $orderStatus"
        }
    }
    class Failed(val orderNumber:Int,
                 val size: CoffeeSize,
                 val reason:String?,
                 val orderStatus: String = "order fail",
    ): OrderStatus() {
        override fun orderPrint(): String {
            return "order number: $orderNumber, size: $size, $orderStatus, reason: ${reason ?: "System Error"}"
        }

    }

}

fun main() {
    var order: OrderStatus = OrderStatus.Pending(1, CoffeeSize.MEDIUM)
    println(order.orderPrint())

    order = OrderStatus.Done(1,CoffeeSize.MEDIUM)
    println(order.orderPrint())

    order = OrderStatus.Pending(2, CoffeeSize.LARGE)
    println(order.orderPrint())

    order = OrderStatus.Failed(2, CoffeeSize.LARGE, "sold out")
    println(order.orderPrint())

    order = OrderStatus.Pending(3, CoffeeSize.SMALL)
    println(order.orderPrint())

    order = OrderStatus.Done(3, CoffeeSize.SMALL)
    println(order.orderPrint())
}