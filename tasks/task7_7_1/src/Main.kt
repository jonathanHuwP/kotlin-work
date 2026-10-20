// Task 7.7.1: program to compute stats for a numeric dataset
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if (args.size < 1){
        System.err.println("Error must have file name on command line.")
        exitProcess(1)
    }

    val data = readData(args[0])
    if (data.size == 0){
        System.err.println("Error no numbers.")
        exitProcess(1)
    }

    println("Median of $data is ${median(data)}")
}
