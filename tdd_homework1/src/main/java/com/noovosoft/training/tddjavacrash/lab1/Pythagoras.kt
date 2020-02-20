package com.noovosoft.training.tddjavacrash.lab1

import kotlin.math.sqrt

fun calculateHypotenuse(firstSide: Int, secondSide: Int): Int {
    val hypotenuse: Int
    val sumOfSquares: Double
    if (firstSide <= 0 || secondSide <= 0) {
        print("Any of the side of triangle must be greater than zero.")
        return 0
    }
    sumOfSquares = (firstSide * firstSide).toDouble() + (secondSide * secondSide).toDouble()
    hypotenuse = sqrt(sumOfSquares).toInt()
    return hypotenuse
}

