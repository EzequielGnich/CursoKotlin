fun address (street: String, city: String, state: String, cep: Int, number: String = "123") {
    println("Rua $street")
}

fun main() {
    address(city = "Joinville", state = "SC", street = "Rua rua", cep = 89545555)
    address("Rua rua", "Joinville","SC", 89545555)
    address("Rua rua", "Joinville","SC", 89545555, "2222")
}