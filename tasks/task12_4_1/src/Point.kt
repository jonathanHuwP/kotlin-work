// Task 12.4.1: Point class

import kotlin.math.hypot

class Point(val x: Double, val y: Double) {
    fun distance() = hypot(x, y)
    infix fun distanceTo(p: Point) = hypot(x - p.x, y - p.y)

    override fun toString() = "<Point: x %.2f; y %.2f>".format(x, y)
}
