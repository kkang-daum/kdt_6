package com.example.kotlin_test.ch03.section5

interface Movable{
    fun move()
    fun getSpeed() : Int
}
abstract class Animal(protected val name: String){
    abstract fun makeSound()
    fun sleep(){
        println("$name is sleeping")
    }
}

class Dog(name: String, private val speed: Int): Animal(name), Movable{
    override fun makeSound() {
        println("$name says: Woof!")
    }

    override fun move() {
        println("$name is running")
    }

    override fun getSpeed(): Int {
        return speed
    }
}

fun main() {
    val obj = Dog("DOG", 10)
    obj.makeSound()
    obj.move()
    println(obj.getSpeed())
}