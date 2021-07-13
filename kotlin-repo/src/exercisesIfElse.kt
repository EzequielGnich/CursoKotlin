fun biggerThen(valueA: Int, valueB: Int): Int {
    return if (valueA > valueB) valueA else valueB
}

fun greaterThanOrEqual(valueA: Int, valueB: Int): Int {
    return when {
        valueA > valueB -> valueA
        valueA < valueB -> valueB
        else -> {
            println("Valores iguais")
            0
        }
    }
}

fun buyPineapples(quantity: Int): Int {
    return if (quantity < 10) {
        quantity * 3
    } else {
        quantity * 2
    }
}


fun main() {
    println(biggerThen(10, 20))

    println(greaterThanOrEqual(10, 20))
    println(greaterThanOrEqual(20, 20))

    println(buyPineapples(9))
}