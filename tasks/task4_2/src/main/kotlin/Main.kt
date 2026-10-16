// Task 4.2: use of if and ranges

// simulate ordering a pizza.

// - Your program should present a menu to the user consisting of four pizza options. It should label these options a, b, c and d.

// - Your program should use readln().lowercase() to read the user’s input and convert it to a lowercase string.

// - Your program should use an if expression to check that the length of the input string is 1, and that the first (and only) character of the string is one of the four available pizza options. It should use a Char range for the latter.

// - If the input is valid, your program should print “Order accepted”; otherwise, it should print “Invalid choice!”

fun main() {
    val options = mapOf('a' to "Margherita", 'b' to "Quattro Stagioni", 'c' to "Seafood", 'd' to "Hawaiian")

    println("Order a Pizza\n")
    for (key in options.keys){
        println("\t($key)  ${options[key]}")
    }

    println("\nChoose your pizza (a-d): ")
    val option = readln().lowercase().get(0)

    println("Order accepted ${options[option]}")
}
