// Task 4.7: finding the longest line in a file

import kotlin.system.exitProcess
import kotlin.io.path.Path
import kotlin.io.path.readText

fun processLines(lines: String): String{
    var currentLongest = -1
    var longest: String = ""
    for (line in lines.split('\n')){
        if (line.length > currentLongest){
            longest = line
            currentLongest = line.length
        }
    }
    return longest
}

fun main(args: Array<String>){
    if (args.size == 0){
        System.err.println("Error must have file name on command line")
        exitProcess(1)
    }

    val longest = with(Path(args[0])){
        println(args[0])
        processLines(this.readText())
    }

    println("Longest:")
    println(longest)
}
