package com.example.kotlin_test.ch3.section5.quiz

interface Movable {
    fun move()
    fun getSpeed(): Int
}

abstract class Animal(protected val name: String){
    abstract fun makeSound()

    fun sleep(){
        println("$name is sleeping")
    }
}

class Dog(name: String, val speed: Int): Animal(name), Movable {
    override fun makeSound() {
        println("$name says....")
    }

    override fun move() {
        println("move....")
    }

    override fun getSpeed(): Int = speed
}