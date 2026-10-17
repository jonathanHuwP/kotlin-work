// Task 5.3.2: rollDice() function
/*
function should
   have two parameters:

   - The number of dice to roll (default = 1)
   - The number of die sides (default = 6)
 */
import kotlin.random.Random

fun rollDice(dice: Int = 1, sides: Int = 6){
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        repeat(dice){
            val result = Random.nextInt(1, sides + 1)
            println("You rolled $result")
        }
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}