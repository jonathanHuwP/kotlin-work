// Task 9.6: readData() function

import kotlin.random.Random
import kotlin.io.path.Path
import kotlin.io.path.writeLines
import kotlin.io.path.useLines

fun makeData(size: Int) = buildList {repeat(size) { index ->add(Random.nextDouble(0.0, 1.00))}}

fun writeData(numbers: List<Double>, fileName: String) = Path(fileName).writeLines(
                                                            numbers.map{it.toString()}.toList())

fun readData(fileName: String) = Path(fileName).useLines{it.map{it.toDouble()}.toList()}
