package com.example.kotlin_test.ch04.section2.zz

enum class CoffeeSize(val size: Int){

    SMALL(250), MEDIUM(350), LARGE(500)
}
sealed class OrderStatus{

    class Pending(val no: String, val size: CoffeeSize): OrderStatus(){
        val status = "pending"
    }
    class Done(val no: String, val size: CoffeeSize): OrderStatus(){
        val status = "done"
    }
    class Failed(val no: String, val size: CoffeeSize, val error: String): OrderStatus(){
        val status = "fail"
    }

}
fun orderPrint(order : OrderStatus): String{

    when(order){
        is OrderStatus.Pending -> return "order number : ${order.no}, size : ${order.size} order ${order.status}"
        is OrderStatus.Done -> return "order number : ${order.no}, size : ${order.size} order ${order.status} "
        is OrderStatus.Failed -> return "order number : ${order.no}., size : ${order.size} order ${order.status}, reason : ${order.error}"
    }
}

fun main() {
    var order: OrderStatus = OrderStatus.Pending("1", CoffeeSize.MEDIUM)
    println(orderPrint(order))

    order = OrderStatus.Done("1", CoffeeSize.MEDIUM)
    println(orderPrint(order))

    order = OrderStatus.Pending("2", CoffeeSize.LARGE)
    println(orderPrint(order))

    order = OrderStatus.Failed("2", CoffeeSize.LARGE, "sold out")
    println(orderPrint(order))
}

