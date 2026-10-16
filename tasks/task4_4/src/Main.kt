/*  Task 4.4: temperature conversion using a while loop
initial temperature in Celsius; a maximum temperature in Celsius;
and a temperature increment.

generate a series of temperatures on the Celsius scale, starting
at the given initial temperature and stopping when the temperature
exceeds the given maximum. For each of the generated temperatures,
it should compute the corresponding temperature on the Fahrenheit scale.
*/
import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun convertArgs(args: Array<String>): List<Double>{
    val min  = args[0].toDouble()
    val max  = args[1].toDouble()
    val step = args[2].toDouble()

    if (max <= min){
        System.err.println("Error min ($min) must be less than max ($max)")
        exitProcess(1)
    }else if(step >= (max-min)){
        System.err.println("Error step ($step) must be less than max minus min ($max-$min)")
        exitProcess(1)
    }else if (min<-273.15){
        System.err.println("Error no Celsius value can be less than -273.15")
        exitProcess(1)
    }

    return listOf(min, max, step)
}

fun toFahrenheit(cTemp: Double) = (cTemp*1.8) + 32.0

fun presentSimple(args: Array<String>){
    val props = convertArgs(args)

    var currentCelcius = props[0]
    while (currentCelcius<props[1]){
        val cString = "%.2f".format(currentCelcius)
        val fString = "%.2f".format(toFahrenheit(currentCelcius))
        println(cString + " => " + fString)
        currentCelcius += props[2]
    }
}

fun presentPretty(args: Array<String>){
    val t = Terminal(AnsiLevel.TRUECOLOR)
    val props = convertArgs(args)

    var currentCelcius = props[0]
    t.println(table {
        header { row(cyan("Centigrade"), yellow("Fahrenheit")) }
        while (currentCelcius<props[1]){
            body { row(cyan("%.2f".format(currentCelcius)), yellow("%.2f".format(toFahrenheit(currentCelcius)))) }
            currentCelcius += props[2]
        }
        for (i in 0..4){

        }
})
}

fun main(args: Array<String>) {
    if(args.size == 3){
        presentSimple(args)
    }else if(args.size == 4){
        presentPretty(args)
    }else {
        System.err.println("Wrong number of arguments")
        exitProcess(1)
    }
}
