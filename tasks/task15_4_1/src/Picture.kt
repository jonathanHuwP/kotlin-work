// Task 15.4.1: Picture class, representing a collection of shapes

import java.awt.Graphics2D

class Picture {
    private val shapes = mutableListOf<Shape>()

    fun add(shape: Shape) = shapes.add(shape)

    fun draw(context: Graphics2D) = shapes.forEach { shape -> shape.draw(context)}
}
