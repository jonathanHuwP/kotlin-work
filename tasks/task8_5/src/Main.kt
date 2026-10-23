// Task 8.5: example of using a higher-order function

fun main() {
    val str0 = "132s9jkdsjfsadlkewj2s3s0rr8;lk"
    println(str0.howMany{it in "0123456789"})
}
