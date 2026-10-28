// Task 12.4.1: Circle class
// implement a new class named Circle:
//  centre, a Point object representing coordinates of the circle’s centre
//  radius, a Double value representing the circle’s radius
import kotlin.math.PI

class Circle(val centre: Point, val radius: Double) {

    init{
        require(radius >= 0.0){"Circle cannot have negative radius (%.2f)".format(radius)}
    }

    fun perimeter() = 2.0*PI*radius
    fun area() = PI*radius*radius

    infix fun contains(point: Point) = (point distanceTo centre) <= radius

    override fun toString() = "<Circle: ctr %s; rad %.2f>".format(centre, radius)
}
