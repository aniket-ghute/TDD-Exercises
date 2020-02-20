package com.noovosoft.training.tddjavacrash.lab1

fun isPalindrome(userInput: String): Boolean {
    val cleanedString = userInput.toLowerCase()
    var head = 0
    var tail = cleanedString.length - 1
    while (head <= tail) {
        if (cleanedString[head] == cleanedString[tail]) {
            head++
            tail--
        } else if (cleanedString[head] !in 'a'..'z')
            head++
        else if (cleanedString[tail] !in 'a'..'z')
            tail--
        else return false
    }
    return true
}