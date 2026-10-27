// Task 12.3.1: demo of secondary constructors

fun main() {
    val p = Point()//4.5, 7.0)
    println("(${p.x}, ${p.y})")
    val h = Point.fromHypot(3.0)
    println("(${h.x}, ${h.y})")

    println("\n===========\n")

    val p2 = Point(4.5, 7.0)
    println("(${p2.x}, ${p2.y})")
    val p21 = Point()
    println("(${p21.x}, ${p21.y})")
}
