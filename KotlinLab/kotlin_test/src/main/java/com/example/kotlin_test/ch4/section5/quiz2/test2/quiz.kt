package com.example.kotlin_test.Ch4.Section5

class Student(var stdName: String, var korScore: Int,
              var engScore: Int, var mathScore: Int){

}
class GradeProcessor{
    fun processScores(students: List<Student>,operation: (Int) -> Int): List<Student> {
        return students.map { // 콜렉션 타입의 map이 아닌 mapping 함수의 map 
            Student(it.stdName,
                operation(it.korScore),
                operation(it.engScore),
                operation(it.mathScore)
            )
        }
    }
    fun filterStudent(students: List<Student>, condition: (Student) -> Boolean): List<Student> {
        return students.filter(condition)
    }
    fun calculateAverage(students: List<Student>, selector: (Student) -> Int): Double {
        return students.map(selector).average()
    }
}

fun main() {
    val students = listOf(
        Student("Kim",85,90,88),
        Student("Lee",92,88,95),
        Student("Park",78,85,80),
        Student("Hong",88,92,85)
    )

    val processor = GradeProcessor()

    val korAverage = processor.calculateAverage(students) {it.korScore}
    println("Korean average: $korAverage")

    val engAverage = processor.calculateAverage(students) {it.engScore}
    println("English average: $engAverage")

    val mathAverage = processor.calculateAverage(students) {it.mathScore}
    println("Math average: $mathAverage")

    val topEngStudents = processor.filterStudent(students) {it.engScore >= 90}
    println("Top English students: ${topEngStudents.joinToString { it.stdName }}")

    val boosted = processor.processScores(students) { it + 5}
    println("Boosted scores: $boosted")
}