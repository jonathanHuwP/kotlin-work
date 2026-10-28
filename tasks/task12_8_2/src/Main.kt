// Task 12.8.2: program to manipulate playing cards

fun trial(){
    val club = Suit.valueOf("Clubs")
    val rank = Rank.Ace
    println(club)
    println(rank)
    println(rank.plainSymbol)
    val card = Card(rank, club)
    println(card.fullName)
    println(card)
}

fun shuffel(){
    val deck = mutableListOf<Card>()
    for (suit in Suit.entries){
        for (rank in Rank.entries){
            deck.add(Card(rank, suit))
        }
    }

    for (card in deck.shuffled()){
        println(card.fullName)
    }
}

fun main(args: Array<String>){
    if(args.size == 1 && args[0]=="shuffel"){
        shuffel()
        return
    }
    trial()
}
