// Task 4.2: use of if and ranges

fun main() {
    println("PIZZA MENU")
    println("(a) Durian")
    println("(b) Prawn")
    println("(c) Seafood")
    println("(d) Hawaiian")

    print("Choose your pizza (a-d): ")
    val choice = readln().lowercase()

    val result = if (choice.length == 1 && choice[0] in 'a'..'d') {
        "Order accepted"
    } else {
        "Invalid choice!"
    }

    println(result)
}