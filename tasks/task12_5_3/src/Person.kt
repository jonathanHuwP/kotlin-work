// Task 12.5.3: class with a custom setter
import kotlinx.datetime.LocalDate

// class Person(var name: String, val birth: LocalDate) {
//     var isMarried = false
// }
class Person(_name: String, val birth: LocalDate) {
    companion object {
        fun makePerson(name: String, birth: String): Person{
            return Person(name, LocalDate.parse(birth))
        }
    }

    init{
        require(_name.filter{!it.isWhitespace()}.isNotBlank()){"Name cannot be blank"}
    }

    var isMarried = false

    var name = _name
        get() {
            return field.uppercase()
        }
        set(value) {
            require(value.isNotBlank()) { "Name cannot be blank" }
            field = value
        }
}