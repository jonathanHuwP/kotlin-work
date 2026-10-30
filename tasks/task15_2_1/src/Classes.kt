// Task 15.2.1: syntax for subclasses
open class Parent(val name: String)

open class Child(name: String) : Parent(name)

class GrandChild(name: String) : Child(name)

class Student(name: String, val degree: String): Parent(name)
