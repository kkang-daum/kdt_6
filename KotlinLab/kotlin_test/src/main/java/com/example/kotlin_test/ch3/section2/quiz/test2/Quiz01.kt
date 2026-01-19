package ccc

class User () {
    var age: Int = 0
        set(value) {
            if (value < 0) {
                throw Exception("invalid age")
            }
            field = value
        }
    var password: String = ""
        set(value) {
            if (value.length < 8) {
                throw Exception("Password must be at least 8 characters long")
            }
            field = value
        }

    var firstName: String = ""
    var lastName: String = ""

    val fullName: String
        get() {
            return "$firstName $lastName"
        }

    val isAdult: Boolean
        get() {
            return age >= 20
        }
}

fun main() {
    try{
        val user = User()

//        user.age = -1 // runtime error(invalid age)
//        user.password = "aa" // runtime error(Password must be at least 8 characters long)

        user.age = 10
        user.password = "dkfkekgke" // 패스워드 조건 충족 추가
        user.firstName = "gildong"
        user.lastName = "hong"

        println(user.isAdult) // false
        println(user.fullName) //gildong hong
    }catch (e:Exception){
        e.printStackTrace()
    }
}