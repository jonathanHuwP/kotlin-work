// Task 12.1: Point class
import kotlin.math.hypot

class Point(val x: Double, val y: Double){
    fun sayHello(): String {return "hello"}
    fun euclidianDistanceFromOrigin() = hypot(x, y)
    infix fun distanceTo(lhs: Point) = hypot(x-lhs.x, y-lhs.y)
}
