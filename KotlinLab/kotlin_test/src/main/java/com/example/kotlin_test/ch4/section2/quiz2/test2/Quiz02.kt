enum class CoffeeSize(val size: Int){
    SMALL(250),
    MEDIUM(350),
    LARGE(500),
}

sealed class OrderStatus(val orderNumber: String, val size : CoffeeSize){
//  주문대기
    class Pending(orderNumber: String, size: CoffeeSize) : OrderStatus(orderNumber, size)
//  주문완료
    class Done(orderNumber: String, size: CoffeeSize) : OrderStatus(orderNumber, size)
//  주문 실퍠
    class Failed(orderNumber: String, size: CoffeeSize, val reason: String) : OrderStatus(orderNumber, size)
}


fun orderPrint(order: OrderStatus): String{
    return when(order){
        is OrderStatus.Pending -> "order number : ${order.orderNumber}, size: ${order.size} order pending"
        is OrderStatus.Done -> "order number : ${order.orderNumber}, size: ${order.size} order Done"
        is OrderStatus.Failed -> "order number : ${order.orderNumber}, size: ${order.size} order fail, reason: ${order.reason}"
    }
}



fun main(){
    var order: OrderStatus = OrderStatus.Pending("1",CoffeeSize.MEDIUM)
    println(orderPrint(order)) // order number : 1, size: MIDIUM order pending

    order = OrderStatus.Done("1",CoffeeSize.MEDIUM)
    println(orderPrint(order)) // order number : 1, size: MEDIUM order Done

    order = OrderStatus.Pending("2",CoffeeSize.LARGE)
    println(orderPrint(order)) // order number : 2, size: LARGE order pending

    order = OrderStatus.Failed("2",CoffeeSize.LARGE,"sold out")
    println(orderPrint(order)) // order number : 2, size: LARGE order fail, reason: sold out
}
