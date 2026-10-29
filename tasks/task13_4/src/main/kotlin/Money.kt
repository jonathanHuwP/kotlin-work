// Task 13.4: Money class

// class Money(val euros: Int, val cents: Int)

data class Money(val euros: Int, val cents: Int){
    companion object{
        val CENTS_PER_EURO = 100
    }

    init{
        require(euros>=0){"euros must be +ve"}
        require(cents>=0){"cents must be +ve"}
    }

    operator fun plus(other: Money): Money{
        var totalCents = cents+other.cents
        var newCents = totalCents % CENTS_PER_EURO
        var carry    = totalCents / CENTS_PER_EURO

        return Money(euros+other.euros+carry, newCents)
    }

    operator fun compareTo(other: Money) = (euros*CENTS_PER_EURO+cents).compareTo(other.euros*CENTS_PER_EURO+other.cents)

    override fun toString() = "€%s.%s".format(euros, cents)
}
