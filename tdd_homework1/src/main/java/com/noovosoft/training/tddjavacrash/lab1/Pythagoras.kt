package com.noovosoft.training.tddjavacrash.lab1

import kotlin.math.sqrt

fun calculateHypotenuse(firstSide: Int, secondSide: Int): Int {
    if (firstSide <= 0 || secondSide <= 0) {
        print("Any of the side of triangle must be greater than zero.")
        return 0
    }
    val sumOfSquares: Double = (firstSide * firstSide).toDouble() + (secondSide * secondSide).toDouble()
    return sqrt(sumOfSquares).toInt()
}