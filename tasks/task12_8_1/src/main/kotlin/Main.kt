// Task 12.8.1: demo program for Day enum class

fun main(){
    println("Please enter day:")
    val input = readLine()
    try{
        input?.let{
            val day = Day.valueOf(it)
            println(day)
        }
    }catch (e: java.lang.IllegalArgumentException){
        println(e.message)
    }
}
