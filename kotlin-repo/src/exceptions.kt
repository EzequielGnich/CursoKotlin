import java.lang.Exception
import java.lang.NumberFormatException

fun main() {
    try {
        println("ezequiel".toInt())
    } catch (err: NumberFormatException) {
        println("Esse valor não é um número -> $err")
    } catch (err: Exception) {
        println("Err $err")
    } finally {
        println("continua depois da exception")
    }
}