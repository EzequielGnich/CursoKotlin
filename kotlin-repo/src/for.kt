fun main() {
    //for - loop

    val str = "Ezequiel"
    for (c in str) {
        println("$c")
    }

    println()

    for (i in 0..100 step 5) {
        print("$i ")
    }

    println()

    for (i in 0..100 step 5) {
        if (i != 80)
            print("$i ")
    }

    println()

    for (i in 100 downTo 1) {
        if (i != 80)
            print("$i ")
    }
}