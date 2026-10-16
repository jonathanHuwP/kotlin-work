/*  Task 4.3: grade calculation using a when expression

module grade, given three marks that have been provided on the command line.

Your program should first check that three command line arguments have been
supplied and exit with a suitable error if this is not the case.

After determining the rounded average of the three marks, the program should
turn this into a grade of Distinction (70 to 100), Pass (40 to 69) or
Fail (0 to 39), using the when expression shown above. It should then print
both the rounded average mark and the grade.
*/
import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if (args.size != 3){
        System.err.println("wrong number of arguments ${args.size}") // only works on jvm
        exitProcess(1)
    }

    val a = args[0].toDouble()
    val b = args[1].toDouble()
    val c = args[2].toDouble()

    val mean = ((a+b+c)/3.0).roundToInt()

    val str = "$mean => "
    val grade = when(mean){
        in  0..36  -> str + "Fail"
        in 40..69  -> str + "Pass"
        in 70..100 -> str + "Distinction"
        else       -> "Impossible mark $mean"
    }

    println(grade)
}
