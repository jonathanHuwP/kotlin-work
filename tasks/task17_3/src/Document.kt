// Task 17.3: Document class, implementing Printable

class Document(val fileName: String): Printable{
    override fun print(){
        println("Printing: $fileName")
    }
}