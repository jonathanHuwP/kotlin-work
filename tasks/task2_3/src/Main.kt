// Task 2.3

fun main() {
    val myAge = 29u
    val universeAge = 13_800_000_000L
    val status = 'M'
    val name = "Sarah"
    val height = 1.78f
    val root2 = Math.sqrt(2.0)
    val pi: Float = 3.1415F // must end F or compiler error

    println("Type ${myAge::class} value $myAge")
    println("Type ${universeAge::class} value $universeAge")
    println("Type ${status::class} value $status")
    println("Type ${name::class} value $name")
    println("Type ${height::class} value $height")
    println("Type ${root2::class} value $root2")
    println("Type ${pi::class} value $pi")
}
