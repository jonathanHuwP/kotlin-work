// Task 7.3.1: list element access

fun main(){
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    println(numbers)
    println(numbers[0])
    // println(number[10])
    println(numbers.slice(2..4))
    println("${numbers.first()} - ${numbers.last()}")
    numbers[0] = 23
    numbers.add(1)
    println(numbers)
    val extra = listOf(-1, -3, -4, 6, 3, 3)
    numbers.addAll(extra)
    println(numbers)
    numbers.remove(6)
    println(numbers)
    numbers.removeAll(listOf(-4, 3))
    println(numbers)
    numbers.removeAt(3)
    println(numbers)
    numbers.clear()
    println(numbers)
    // println(numbers.first()) exception
    // println(numbers.last())  exception
}
