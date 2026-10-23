// Task 8.4.1: experimenting with sequences

fun main() {
    val numbers = listOf(1, 4, 7, 2, 9, 3, 8)

    val result0 = numbers.asSequence()
    val result1 = numbers.asSequence().filter { it % 2 != 0 }
    val result2 = numbers.asSequence().filter { it % 2 != 0 }.map { it * it }

    println(numbers)
    println(result0)
    println(result0.toList())
    println(result1)
    println(result1.toList())
    println(result2)
    println(result2.toList())
}
