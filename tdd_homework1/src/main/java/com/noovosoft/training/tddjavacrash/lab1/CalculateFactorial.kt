package com.noovosoft.training.tddjavacrash.lab1

fun calculateFactorial(number: Int): Int {
    var factorial = 1
    if (number < 0) {
        print("Factorial of negative number dosen't exist")
        return -1
    }
    if (number != 0) {
        for (i in number downTo 1) {
            factorial *= i
        }
    }
    return factorial
}