// Task 5.1.1: main program
/*
write a program that:
* Obtains two words from the user via command line arguments
* Compares those words using `anagrams()`
* Displays the results of the comparison to the user
*/
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if(args.size != 2){
        println("Error: there must be two command line arguments")
        exitProcess(1)
    }

    if (anagrams(args[0], args[1])){
        println("${args[0]} is anagram of ${args[1]}")
    }else{
        println("${args[0]} is not an anagram of ${args[1]}")
    }
}
