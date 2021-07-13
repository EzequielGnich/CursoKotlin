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

fun bonusCalculation1(role: String, salary: Float): Float {
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

// Não há a necessidade atribuir a variável bonus todas vezes dentro do if else pois a linguagem entende
// que o  que está dentro do if else é um tipo de retorno
fun bonusCalculation2(role: String, salary: Float): Float {
    // Gerente Junior, Gerente Senior, Coordenador
    val bonus: Float = if (role == "Coordenador") {
        salary * 0.2f
    } else if (role == "Gerente Junior") {
        salary * 0.5f
    } else {
        salary * 2
    }

    return bonus
}

// Não há a necessidade de decorar Float porque a linguagem entende que o retorno será um float
fun bonusCalculation3(role: String, salary: Float): Float {
    // Gerente Junior, Gerente Senior, Coordenador
    val bonus = if (role == "Coordenador") {
        salary * 0.2f
    } else if (role == "Gerente Junior") {
        salary * 0.5f
    } else {
        salary * 2
    }

    return bonus
}

// Não há a necessidade de criar uma variável para armazenar o valor aplicado no if else
// é possível retornar if else direto pois dentro da linguagem eles são considerados uma expressão
fun bonusCalculation4(role: String, salary: Float): Float {
    // Gerente Junior, Gerente Senior, Coordenador
    return if (role == "Coordenador") {
        salary * 0.2f
    } else if (role == "Gerente Junior") {
        salary * 0.5f
    } else {
        salary * 2
    }
}

fun main() {
    println(bonusCalculation1("Gerente Junior", 11120f))
    println(bonusCalculation1("Coordenador", 1110f))

    println(bonusCalculation2("Gerente Junior", 11120f))
    println(bonusCalculation2("Coordenador", 1110f))

    println(bonusCalculation3("Gerente Junior", 11120f))
    println(bonusCalculation3("Coordenador", 1110f))

    println(bonusCalculation4("Gerente Junior", 11120f))
    println(bonusCalculation4("Coordenador", 1110f))
}
