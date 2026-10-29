// Task 12.9: demo program for class implementing Static Factory Method

fun demoPerson(dob: String): Person{
    val p = Person.create("Sarah", dob)
    return p
}

fun main(args: Array<String>){
    var dob = "2006-01-04"

    if (args.size > 0){
        dob = args[0]
    }

    runCatching{
        demoPerson(dob)
    }.onSuccess{
        println(it)
    }.onFailure{
        System.err.println(it.message)
    }
}