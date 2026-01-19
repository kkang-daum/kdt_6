class User(
    private var name:String?=null,
    private var age:Int=0
){
    
    fun printUserInfo() {
        println("name:$name, age:$age")
    }

}

fun main(){
    val user1 = User()
    user1.printUserInfo() // name:null age:0

    val user2 = User("kim")
    user2.printUserInfo() // name: kim,age:0

    val user3 = User("kim",30)
    user3.printUserInfo()// name:kim, age:30
}