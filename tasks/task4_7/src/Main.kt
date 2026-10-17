// Task 4.7: finding the longest line in a file

import kotlin.system.exitProcess
import kotlin.io.path.Path
import java.io.File
import kotlin.io.path.readText

data class Line(val contents: String, val length: Int)

fun processLines(inFile: File): Line{
    var currentLongest = -1
    var longest: String = ""
    inFile.forEachLine{
        if (it.length > currentLongest){
            longest = it
            currentLongest = it.length
        }
    }

    return Line(longest, currentLongest)
}

fun main(args: Array<String>){
    if (args.size == 0){
        System.err.println("Error must have file name on command line")
        exitProcess(1)
    }

    println("For file: ${args[0]}")

    val longest = with(File(args[0])){
        processLines(this)
    }

    if (longest.length<1){
        println("No longest found")
    }else{
        println("Length: ${longest.length}")
        println(longest.contents)
    }
}
