package com.example.kotlin_test.ch4.section3

object DatabaseManager {
    val connectionUrl = "jdbc:mysql://localhost:3306/mydb"
    var isConnected = false
    var connectionCount = 0

    init {
        println("DatabaseManager initialized ")
    }

    fun connect() {
        isConnected = true
        connectionCount++
        println("Connected to $connectionUrl")
    }


    fun disconnect() {
        isConnected = false
        println("Disconnected from database")
    }


    fun getStatus(): String {
        return "Status: ${if(isConnected) "Connected" else "Disconnected"}, Total connections: $connectionCount"
    }
}

fun main() {
    println(DatabaseManager.getStatus())
    //DatabaseManager initialized
    //Status: Disconnected, Total connections: 0

    DatabaseManager.connect()
    println(DatabaseManager.getStatus())
    //Connected to jdbc:mysql://localhost:3306/mydb
    //Status: Connected, Total connections: 1

    DatabaseManager.connect()
    println(DatabaseManager.getStatus())
    //Connected to jdbc:mysql://localhost:3306/mydb
    //Status: Connected, Total connections: 2

    DatabaseManager.disconnect()
    println(DatabaseManager.getStatus())
    //Disconnected from database
    //Status: Disconnected, Total connections: 2


}
