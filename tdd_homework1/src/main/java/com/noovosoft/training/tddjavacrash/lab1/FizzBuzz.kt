package com.noovosoft.training.tddjavacrash.lab1

fun fizzBuzz(number: Int): Any {
    if (number != 0) {
        if (number % 3 == 0 && number % 5 == 0)
            return "FizzBuzz"
        else if (number % 3 == 0)
            return "Fizz"
        else if (number % 5 == 0)
            return "Buzz"
    }
    return number
}