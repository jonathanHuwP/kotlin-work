// Task 15.2.3: demo program

fun main() {
    // Creates a savings account with an interest rate of 1.8%
    val sacc = SavingsAccount("Kobe", 1.8)
    println(sacc)

    // Deposits £1,250 in the account
    sacc.deposit(1250)
    println(sacc)

    // Accrues interest for five years, by invoking applyInterest() five times
    repeat(5){sacc.applyInterest()}
    println(sacc)

    // Withdraws £50 from the account
    sacc.withdraw(50)

    // Displays the final balance of the account
    println("\nFinal $sacc")

    val a: Any? = Any()
    // val a: Any? = null
    println(a)
}
