// Task 12.5.3: demo program for class with custom setter

fun main(){
    var oddBall = Person.makePerson("Kobe", "2008-11-17")
    oddBall.name = "Kotlin"
    println(oddBall.name)
}