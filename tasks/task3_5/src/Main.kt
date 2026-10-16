// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main(args: Array<String>) {
    with(Path("test.txt")){
        this.writeText("""This is
        some text""")
    }

    if (args.size > 0){
        Path("test.txt").let{
            it.appendText(" --> and more text")
        }
    }else{
        Path("test.txt").let{
            it.writeText(" --> and more text")
        }
    }
}
