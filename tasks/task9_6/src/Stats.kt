// Task 9.6: variance() function

fun variance(dataset: List<Double>): Double {
    if (dataset.size < 2) {
        throw IllegalArgumentException("to few numbers for variance")
    }

    val mean = dataset.average()
    val sumSquaredDev = dataset.map { it - mean }.sumOf { it * it }
    return sumSquaredDev / (dataset.size - 1)
}