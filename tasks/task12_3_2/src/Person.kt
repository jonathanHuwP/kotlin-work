// Task 12.3.2: Person class with secondary constructor
import kotlinx.datetime.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false

    override fun toString(): String{
        var status = "Single"
        if (isMarried) status = "Married"
        return "<Person: %s; DOB: %s: MS: %s>".format(name, birth, status)
    }
}
