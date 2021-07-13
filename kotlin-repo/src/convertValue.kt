/**
 *  Double  64
 *  Float   32
 *  Long    64
 *  Int     32
 *  Short   16
 *  Byte    8
 */

fun main() {
    // Conversões devem ocorrer sempre do menos para o maior devido a capacidade de armazenamento
    // de cada um
    val n1: Double = Double.MAX_VALUE
    val b1: Byte = 100

    println(b1.toShort())
    println(b1.toLong())
    println(b1.toFloat())
    println(b1.toDouble())

    // É possível converter uma string sem ser caracteres
    println("19".toInt())
    println("19".toFloat())
    // Causa uma Ocorre uma exceção
    // println("sdsds".toInt())


}