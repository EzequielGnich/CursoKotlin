fun operation(a: Int, b: Int, op: String) {
    /*when (c) {
        "sum" -> {
            return a + b
        }
        "subtraction" -> {
            return a - b
        }
        "multiplication" -> return a * b
        "division" -> return a / b
        else -> {
            println("Operação incorreta")
            return 0
        }
    }*/

    when {
        a > 0 && b > 0 -> {
           return println("Variáveis maiores que zero")
        }
    }

    // usando range para verificar se um valor existe em um determinando intervalo
    when {
        a in 1..99 -> {
           return println("Século")
        }
    }
}


fun main() {

}