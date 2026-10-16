// Task 2.4
// In this file, write a Kotlin program containing four lines of code.
// The first line should create a val variable and assign an integer value to it;
// the second line should print the value of the variable;
// the third line should attempt to assign a new value to the variable;
// the fourth line should ttempt to print the value of the variable again.

const val BOLTZMANN_CONST = 8.314

fun main(){
    // val size = 7 // cannot be reassigned
    var size = 7
    println(size)
    size = 29
    println(size)
    val names = mutableListOf("sue", "steve")
    names[0] = "ann" // change of state of names is ok
    println(names)
    println(BOLTZMANN_CONST)
}