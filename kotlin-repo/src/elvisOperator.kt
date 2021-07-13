fun main() {


    val test: Int? = null

    // Operador Elvis
    // Determina que a variável pode ser nula
    val op: Int = test ?: 100

    println(test)
    println(op)
}