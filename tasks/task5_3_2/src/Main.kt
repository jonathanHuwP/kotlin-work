// Task 5.3.2: main program
/*
accept a 'dice specification' as its only command line argument.

A dice specification considers of the number of dice to roll, followed
by the character `d`, followed by the number of die sides.

Examples: 3d6, 2d12, 1d8

Your program should parse this dice specification and then invoke
`rollDice()` accordingly.
*/
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if(args.size < 1){
        System.err.println("Wrong number of arguments")
        exitProcess(1)
    }

    args.forEach{
        val parts = it.split('d')
        rollDice(parts[0].toInt(), parts[1].toInt())
    }
}