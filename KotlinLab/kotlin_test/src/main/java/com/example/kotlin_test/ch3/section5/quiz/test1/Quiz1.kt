package com.example.kotlin_test.ch3.setction5

interface Movable {
    fun move()
    fun getSpeed(): Int
}

abstract class Animal(protected var name: String) {
    abstract fun makeSound()
    fun sleep() {
        println("$name is sleeping")
    }
}

class Dog(name: String, private val speed: Int) : Animal(name), Movable {
    override fun makeSound() {
        println("$name says: Woof!")
    }

    override fun move() {
        println("$name is running")
    }

    override fun getSpeed(): Int = speed
}

fun main() {
    val dog = Dog("코코", 80)
    dog.makeSound()
    dog.move()
    dog.sleep()
}