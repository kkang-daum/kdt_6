package com.example.kotlin_test.ch4.section5.quiz2

data class Student(val name: String, var korScore: Int, var engScore: Int, var mathScore: Int)

class GradeProcessor {
    fun processScores(students: List<Student>, operation: (Int) -> Int): List<Student>{
        return students.map {
            //it -> Student
            it.copy (
                korScore = operation(it.korScore),
                engScore = operation(it.engScore),
                mathScore = operation(it.mathScore)
            )
        }
    }
    fun filterStudents(students: List<Student>, condition: (Student) -> Boolean): List<Student>{
        return students.filter { condition(it) }
    }
    fun calculateAverage(students: List<Student>, selector: (Student) -> Int): Double{
        if(students.isEmpty()) return 0.0
        return students.map { selector(it) }.average()
    }
}

fun main() {
    val students = listOf(
        Student("Kim", 85, 90, 88),
        Student("Lee", 92, 88, 95),
        Student("Park", 78, 85, 80),
        Student("Hong", 88, 92, 85)
    )

    val processor = GradeProcessor()

    val korAverage = processor.calculateAverage(students) { it.korScore }
    println("Korean average: $korAverage")//Korean average: 85.75

    val engAverage = processor.calculateAverage(students) { it.engScore }
    println("English average: $engAverage")//English average: 88.75

    val mathAverage = processor.calculateAverage(students) { it.mathScore }
    println("Math average: $mathAverage")//Math average: 87.0

    val topEngStudents = processor.filterStudents(students) { it.engScore >= 90 }
    println("Top English students: $topEngStudents")
    //Top English students: [Student(name=Kim, korScore=85, engScore=90, mathScore=88),~~

    val boosted = processor.processScores(students) { it + 5 }
    println("Boosted scores: $boosted")
    //Boosted scores: [Student(name=Kim, korScore=90, engScore=95, mathScore=93), ~~~
}
