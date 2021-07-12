/**
 * Type     bit
 * Double   64
 * Float    32
 * Long     64
 * Int      32
 * Short    16
 * Byte     8
 * Boolean  ?
 * String   ?
 * Char     ?
 * */

fun main() {
    var name: String = "Ezequiel Gnich";

    println("Hello world $name")

    println("Double: Max.: ${Double.MAX_VALUE} / Min.: ${Double.MIN_VALUE}")
    println("Float: Max.: ${Float.MAX_VALUE} / Min.: ${Float.MIN_VALUE}")
    println("Long: Max.: ${Long.MAX_VALUE} / Min.: ${Long.MIN_VALUE}")
    println("Int: Max.: ${Int.MAX_VALUE} / Min.: ${Int.MIN_VALUE}")
    println("Short: Max.: ${Short.MAX_VALUE} / Min.: ${Short.MIN_VALUE}")
    println("Byte: Max.: ${Byte.MAX_VALUE} / Min.: ${Byte.MIN_VALUE}")

    // Variáveis mutáveis
    var nome: String = "João da Silva"
    nome = "João da silva 2"

    // Variáveis imutáveis
    val age: Int = 10

    // Concatenar
    val phrase = "Kotlin é uma linguagem"
    val s = " show!"
    println("Kotlin é uma linguagem $s")
    println(phrase + s)

    val str = """aqui começa um parágrafo
        | e continua aqui
        | e aqui
        |   paragrafo
    """.trimMargin()
    println(str)

    // propriedade da linguagem
    println("Propriedades da linguagem ${str.length}")
}