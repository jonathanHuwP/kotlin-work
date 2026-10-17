// Task 5.2.2: conversion of marks into grades, using a function
/*
add the expression form of the `grade()` function, from
Section 5.2 of the Programming Guide.

You will need to write a `main()` function that

* Iterates over the program's command line arguments using a `for` loop
* Converts each argument to an `Int`, representing an exam mark
* Invokes `grade()` on the exam mark, to determine the corresponding grade
* Prints both the mark and the grade
 */
fun grade(mark: Int) = when (mark) {
    in 0..39   -> "Fail"
    in 40..69  -> "Pass"
    in 70..100 -> "Distinction"
    else       -> "?"
}

fun main(args: Array<String>){
    for (arg in args){
        println("${arg.toInt()} => ${grade(arg.toInt())}")
    }
}
