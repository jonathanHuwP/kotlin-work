// Task 7.7.1: statistics functions
fun median(numbers: List<Float>): Float{
    val array = numbers.toTypedArray()
    array.sort()

    if (numbers.size%2 == 1){
        println("odd ${numbers.size}")
        return medianOdd(array)
    }else{
        println("even ${numbers.size}")
        return medianEven(array)
    }
}

fun medianOdd(numbers: Array<Float>): Float{
    return numbers[numbers.size/2]
}

fun medianEven(numbers: Array<Float>): Float{
    val mid = numbers.size/2
    return (numbers[mid] + numbers[mid-1])/2.0F
}
