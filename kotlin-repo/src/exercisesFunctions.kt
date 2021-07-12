fun main() {
    fun returnStringLength(str: String) : Int = str.length

    fun showCharactersLengthString(str: String) {
        println("A String $str possui ${str.length} caracteres")
    }

    println(returnStringLength("Ezequiel"))
    showCharactersLengthString("Gnich")
}