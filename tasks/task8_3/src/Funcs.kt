// Task 8.3: functions for temperature analysis

import kotlin.io.path.Path
import kotlin.io.path.forEachLine

typealias Record = Pair<String,Double>

fun fetchData(filename: String) = buildList {
    Path(filename).forEachLine{
        val tmp = it.split(',')
        add(Record(tmp[0].trim(), tmp[1].trim().toDouble()))
    }
}

fun averageTemp(data: List<Record>) = data.sumOf{it.second}/data.size

// Challenge: compute average temperature with one line of code
// in main(), instead of using the function below!

// fun averageTemp(data: List<Record>): Double {
//     var sum = 0.0
//     for (record in data) {
//         sum += record.second
//     }
//     return sum / data.size
// }
