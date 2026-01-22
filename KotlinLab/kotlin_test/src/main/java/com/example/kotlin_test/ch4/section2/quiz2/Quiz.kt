package com.example.kotlin_test.ch4.section2.quiz2

enum class CoffeeSize(val ml: Int) {
    SMAILL(250), MEDIUM(350), LARGE(500)
}

sealed class OrderStatus(val orderNumber: String, val size: CoffeeSize){
    class Done(orderNumber: String, size: CoffeeSize): OrderStatus(orderNumber, size)
    class Failed(orderNumber: String, size: CoffeeSize, val reason: String): OrderStatus(orderNumber, size)
    class Pending(orderNumber: String, size: CoffeeSize): OrderStatus(orderNumber, size)
}

fun orderPrint(status: OrderStatus): String{
    return when(status){
        is OrderStatus.Done ->
            "order number : ${status.orderNumber}, size : ${status.size} done..."
        is OrderStatus.Failed ->
            "order number : ${status.orderNumber}, size : ${status.size} fail..., reason: ${status.reason}"
        is OrderStatus.Pending ->
            "order number : ${status.orderNumber}, size : ${status.size} pending..."
    }
}

fun main() {
    var order: OrderStatus = OrderStatus.Pending("1", CoffeeSize.MEDIUM)
    println(orderPrint(order))//order number : 1, size : MEDIUM order pending

    order = OrderStatus.Done("1", CoffeeSize.MEDIUM)
    println(orderPrint(order))//order number : 1, size : MEDIUM order done

    order = OrderStatus.Pending("2", CoffeeSize.LARGE)
    println(orderPrint(order))//order number : 2, size : LARGE order pending

    order = OrderStatus.Failed("2", CoffeeSize.LARGE, "sold out")
    println(orderPrint(order))//order number : 2, size : LARGE order fail, reason : sold out
}
