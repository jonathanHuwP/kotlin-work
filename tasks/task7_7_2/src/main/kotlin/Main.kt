// Task 7.7.2: phone book simulator

const val CSV_FILENAME = "phone.csv"

fun main() {
    val db = createDatabase()
    db.load(CSV_FILENAME)
    for (key in db.keys){
        println("$key => ${db[key]}")
    }
    db.save("out.csv")
}
