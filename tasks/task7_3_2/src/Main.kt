fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    println("Initial: $numbers")

    numbers[0] = 10
    println("Replace: $numbers")

    numbers.add(1)
    println("Add: $numbers")

    numbers.addAll(listOf(20, 30))
    println("Add all: $numbers")

    numbers.remove(3)
    println("Remove value 3: $numbers")

    numbers.removeAt(0)
    println("Remove index 0: $numbers")

    numbers.removeAll(listOf(20, 30))
    println("Remove values 20 and 30: $numbers")

    numbers.clear()
    println("Clear: $numbers")
}