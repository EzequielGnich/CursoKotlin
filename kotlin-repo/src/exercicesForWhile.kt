fun reverseString(str:String):String {
    var newString = ""
    var i = str.length - 1
    while (i >= 0){
        newString += str[i]
        i -= 1
    }

    return newString
}

fun main() {
    // imprimir números pares
    for (i in 100..200 step 2) {
        println(i)
    }

    println(reverseString("teste"))
}