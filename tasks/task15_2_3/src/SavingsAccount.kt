// Task 15.2.3: SavingsAccount class
import kotlin.math.roundToInt

class SavingsAccount(name: String, val rate: Double): BankAccount(name){
    init{
        require(rate>0.0){"Intrest rate must be greater than zero ($rate)"}
    }

    fun applyInterest(){
        deposit((balance*rate/100.0).roundToInt())
    }

    override fun toString() = "<SavingsAccount $holder $balance $rate>"

}