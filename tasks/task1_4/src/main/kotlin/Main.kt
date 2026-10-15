// Task 1.4

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.rendering.TextStyles.*
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    val term = Terminal(AnsiLevel.TRUECOLOR)

    val helloStyle = italic + underline + yellow
    term.println(helloStyle("HELLO WORLD!"))

    val date = today()
    val dateStyle = bold + green
    term.println(dateStyle("Today is $date"))

    val argsStyle = blue
    for (arg in args){
        term.println(argsStyle(arg))
    }

    val argsMap = args.toList().chunked(2).associate { it[0] to it[1] }
    val parsedArgStyle = bold + underline + red
    term.println(parsedArgStyle("Mode: " + argsMap["--mode"]))
    term.println(parsedArgStyle("User: " + argsMap["--user"]))
}
