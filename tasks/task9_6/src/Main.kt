// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess
import kotlin.random.Random

fun makeDataFile(fileName: String, size: Int) = writeData(makeData(size), fileName)

fun processData(fileName: String){
    println("read file %s".format(fileName))
    val data = readData(fileName)
    println(variance(data))

}

fun main(args: Array<String>) {
    if (args.size != 2){
        println("command line must have make/read and fileName")
        exitProcess(1)
    }

    val result = runCatching {
        when(args[0]){
            "make" -> makeDataFile(args[1], 100)
            "read" -> processData(args[1])
            else ->   {
                println("unknown command %s should be make or read".format(args[0]))
                exitProcess(1)
            }
        }
    }

    if (result.isFailure) {
        println("Task failed with an exception:")
        println(result.exceptionOrNull())
    }
}
