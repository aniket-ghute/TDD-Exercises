package com.noovosoft.training.tddjavacrash.lab1

data class AggregateValues(var min: Int, var max: Int, var average: Float, var count: Int)

fun doAggregateOperations(vararg numbers: Int): AggregateValues {
    if (numbers.isEmpty())
        return AggregateValues(Int.MAX_VALUE, Int.MIN_VALUE, Float.NaN, Double.NaN.toInt())
    var sumOfElements = 0
    val count = numbers.size
    val average: Float
    var min = numbers[0]
    var max = numbers[0]
    for (i in numbers) {
        sumOfElements += i
        if (i > max)
            max = i
        if (i < min)
            min = i
    }
    average = (sumOfElements.toFloat() / count.toFloat())
    return AggregateValues(min, max, average, count)
}