// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1){
        println("Error: command line must have filename")
        exitProcess(1)
    }

    println(averageTemp(fetchData(args[0])))
}
