// Task 12.8.2: class to represent playing cards
data class Card(val rank: Rank, val suit: Suit){
    val fullName = "%s of %s".format(rank, suit)
    override fun toString() = "${rank.plainSymbol}${suit.plainSymbol}"
}
