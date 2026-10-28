// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main(){
    val person = Person("Mike", LocalDate.parse("1997-08-23")).apply{isMarried=true}
    println(person)
}
