// Task 7.3.1: list element access

fun main(){
    val numbers = listOf(9, 3, 6, 2, 8, 5)
    println(numbers)
    println(numbers[0])
    // println(number[10])
    println(numbers.slice(2..4))
    println("${numbers.first()} - ${numbers.last()}")
    // numbers[0] = 23 not mutable
    // numbers.add(1)  not mutable
    println(numbers)
}
