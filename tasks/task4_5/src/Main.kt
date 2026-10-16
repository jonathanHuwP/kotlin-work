// Task 4.5: summing odd integers with a for loop
/*
* Obtain an integer upper limit from the command line
* Use a `for` loop to sum up all of the odd integers between 1 and this limit
* Print the result of the summation

The program should support the use of reasonably large values for the limit.
*/
import kotlin.system.exitProcess

fun parseArgs(args: Array<String>): UInt {
    if (args.size != 1){
        System.err.println("Error there must only be one argument (${args.size})")
        exitProcess(1)
    }

    val upperLimit = args[0].toUInt()
    if (upperLimit<3U){
        System.err.println("Error upper limit must be 3 or more ($upperLimit)")
        exitProcess(1)
    }

    return upperLimit
}

fun main(args: Array<String>) {
    val upperLimit = parseArgs(args)
    var total = 0
    for (index in 1..upperLimit.toInt() step 2){
        total += index
    }
    println("$total")
}
