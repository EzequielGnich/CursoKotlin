//if else
fun legalAge(age: Int) {
    if (age >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }
}

fun legalAgeReturnBoolean(age: Int): Boolean {
    return age >= 18
}

fun bonusCalculation(role: String, salary: Float): Float {
    // Gerente Junior, Gerente Senior, Coordenador
    val bonus: Float

    if (role == "Coordenador") {
        bonus = salary * 0.2f
    } else if (role == "Gerente Junior") {
        bonus = salary * 0.5f
    } else {
        bonus = salary * 2
    }

    return bonus
}

fun main() {
    println(bonusCalculation("Gerente Junior", 11120f))
    println(bonusCalculation("Coordenador", 1110f))
}
