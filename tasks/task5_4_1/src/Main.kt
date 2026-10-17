// Task 5.4.1: main program
/*
program that tests your extension function, which should call the
function with strings of different lengths and display the result.
 */

fun main(){
    val testStrings = mapOf(20 to "01234567890123456789",
                            19 to "0123456789012345678",
                            21 to "012345678901234567890")
    testStrings.forEach{println("${it.key} => ${it.value.isTooLong()}") }
}