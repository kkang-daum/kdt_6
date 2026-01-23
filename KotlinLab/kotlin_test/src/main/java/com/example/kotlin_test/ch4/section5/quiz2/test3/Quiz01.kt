
// kor 국어 eng 영어 math 수학
data class Student(val name:String,var korScore:Int,var engScore:Int,var mathScore:Int)

class GradeProccessor(){
    fun proseccScore(student:List<Student>, operation:(Int)->Int):List<Student>
    {
        return student.map {
            it.copy(
                korScore = operation(it.korScore),
                engScore = operation(it.engScore),
                mathScore = operation(it.mathScore)
            )
        }
    }

    fun filterStudents(student: List<Student>, condition:(Student) -> Boolean ):List<Student>{
        return student.filter{condition(it)}
    }

    fun calcuateAverage(student: List<Student>, selector:(Student) -> Int ):Double{
        if(student.isEmpty()) return 0.0
        return student.map{selector(it)}.average()
    }
}
fun main(){
    val student = listOf(
        Student("kim",85,90,88),
        Student("lee",92,88,95),
        Student("park",78,85,80),
        Student("hong",88,92,85)
    )

    val proccessor = GradeProccessor()

    val korAverage = proccessor.calcuateAverage(student){it.korScore}
    println("Korean average: $korAverage")

    val engAverage = proccessor.calcuateAverage(student){it.engScore}
    println("Englich average: $engAverage") 

    val mathAverage = proccessor.calcuateAverage(student){it.mathScore}
    println("Math average: $mathAverage")

    val topEngStudents = proccessor.filterStudents(student){it.engScore>=90}
    println("Top English students: $topEngStudents") 

    val boosted = proccessor.proseccScore(student){it + 5}
    println("Boosted scores: $boosted")
}