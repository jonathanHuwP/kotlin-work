// Task 5.1.2: main program
/*
program that obtains the desired number of die sides, as a command
line argument, then invokes `rollDie()` with this number.
*/
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if (args.size == 1){
        repeat(args[0].toInt()){
            rollDie()
        }
    }else if (args.size == 2){
        repeat(args[1].toInt()){
            rollDie(args[0].toInt())
        }
    }else{
        System.err.println("Error must have number of sides and number of rolls on comm line")
        exitProcess(1)
    }
}
