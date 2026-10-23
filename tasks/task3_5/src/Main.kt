// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText
import kotlin.io.path.forEachLine
import kotlin.io.path.readLines

const val FILE_NAME = "test.txt"

/**
 * run with any comm line arguments to demo append, else demo overwrite
 */
fun main(args: Array<String>) {
    with(Path(FILE_NAME)){
        this.writeText("""This is
        some text""")
    }

    if (args.size > 0){
        Path(FILE_NAME).let{
            it.appendText(" --> and more text")
        }
    }else{
        Path(FILE_NAME).let{
            it.writeText(" --> and more text")
        }
    }

    Path(FILE_NAME).forEachLine(){it -> println(it)}

    val lines = Path(FILE_NAME).readLines();
    for (line in lines){
        println(line)
    }
}
