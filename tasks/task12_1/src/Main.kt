// Task 12.1: program that uses a Point object

fun main(){
    val mypoint = Point(-12.3, 8.6)
    val other = Point(0.0, 0.0)

    println(mypoint)
    println("(%.2f, %.2f)".format(mypoint.x, mypoint.y))
    println(mypoint.euclidianDistanceFromOrigin())
    println((mypoint distanceTo other))
}