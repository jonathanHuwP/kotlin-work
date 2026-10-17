// Task 5.2.1: main program
/*
add a `main()` function that reads a value
for circle radius from command line arguments and then uses the functions from
`Circle.kt` to compute area and perimeter.

Your program should display the specified circle's area and perimeter with
four decimal places of accuracy.
 */
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if (args.size == 0){
        System.err.println("Error must have at least one radius")
        exitProcess(1)
    }

    args.forEach{
        try{
            val s = buildString {
                append("Rad: ")
                append("%.4f".format(it.toDouble()))
                append(" Area: ")
                append("%.4f".format(circleArea(it.toDouble())))
                append(" Circumference: ")
                append("%.4f".format(circleCircumference(it.toDouble())))

            }
            println(s)
        }catch (e: java.lang.NumberFormatException){
            println("Error $it is not a number")
        }
    }
}
