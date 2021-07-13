fun calculateAverage(vararg grades: Float) {
    if (grades.isNotEmpty()) {
        var sum: Float = 0f
        for (grade in grades) {
            sum += grade
        }

        println("A média é ${sum/grades.size}")
    }
}

// Função aceita lista como parâmetro e essa lista aceita vários tipos de dados
fun <T> manyParametersTypes(vararg values: T) {
    for (value in values) {
        println(value)
    }
}

fun main() {
    calculateAverage(3f,5f,8.5f)

    manyParametersTypes(3.5f, "C", 3, true, "")
}