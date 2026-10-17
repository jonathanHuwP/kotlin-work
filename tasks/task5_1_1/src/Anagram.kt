// Task 5.1.1: anagrams() function
/*
Add the `anagrams()` function from Section 5.1 of the Programming Guide
to `src/Anagram.kt`.
*/
fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    val firstChars = first.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}
