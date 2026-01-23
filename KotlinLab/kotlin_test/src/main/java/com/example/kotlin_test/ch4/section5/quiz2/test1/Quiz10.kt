package com.example.kotlin_study.ch2.Quiz

data class Student(var name: String, var korScore: Int, var engScore: Int, var mathScore: Int)

class GradeProcessor {
    fun processScores(students: List<Student>, operation: (Int) -> Int): List<Student> {
        val processedStudents = mutableListOf<Student>()
        for (student in students) {
            val processedStudent = Student(
                student.name, operation(student.korScore),
                operation(student.engScore), operation(student.mathScore)
            )
            processedStudents.add(processedStudent)
        }
        return processedStudents
    }

    fun filterStudents(students: List<Student>, condition: (Student) -> Boolean): List<Student> {
        val filteredStudents = mutableListOf<Student>()
        for (student in students) {
            if (condition(student)) {
                filteredStudents.add(student)
            }
        }
        return filteredStudents
    }
}

fun calculateAverage(students: List<Student>, selector: (Student) -> Int): Double {
    var total = 0
    for (student in students) {
        total += selector(student)
    }
    return total.toDouble() / students.size
}
fun main() {
    val students = listOf(
        Student("Kim", 85, 90, 88),
        Student("Lee", 92, 88, 95),
        Student("Park", 78, 85, 80),
        Student("Hong", 88, 92, 85)
    )

    val processor = GradeProcessor()

    val korAverage = calculateAverage(students) { it.korScore }
    println("Average Kor score: $korAverage")

    val engAverage = calculateAverage(students) { it.engScore }
    println("Average Kor score: $engAverage")

    val mathAverage = calculateAverage(students) { it.mathScore }
    println("Average Kor score: $mathAverage")

    val topEngStudents = processor.filterStudents(students) { it.engScore >= 5 }
    println("Top English students: $topEngStudents")

    val boosted = processor.processScores(students) { it + 5 }
    println("Boosted scores: $boosted")
}