// Task 12.4.1: main program

fun main(){
    val crop = Circle(Point(1.0, 1.0), 3.5)
    println(crop)

    if (crop contains Point(2.0, 3.0)){
        println("in")
    }else{
        println("out")
    }

    val unit = Circle(Point(7.5, -3.4), 1.0)
    println(unit.area())
    println(unit.perimeter())
}
