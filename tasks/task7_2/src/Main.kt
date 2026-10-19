// Task 7.2: array comparison

fun main() {
    val numbers = intArrayOf(9, 6, 3, 2, -3, 7)

    val cls = numbers::class

    println(cls.qualifiedName)
    println(cls.java)
    println(numbers.slice(1..4))
}
