// Task 12.3.1: class with secondary constructors
import kotlin.math.sqrt

class Point(var x: Double, var y: Double){
    constructor(): this(1.0, 1.0)

    // the equivalent of a static factory method in Java
    companion object {
        fun fromHypot(l: Double): Point{
            val tmp = sqrt((l*l/2.0))
            return Point(tmp, tmp)
        }
    }
}
