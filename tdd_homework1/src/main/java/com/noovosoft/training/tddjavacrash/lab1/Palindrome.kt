package com.noovosoft.training.tddjavacrash.lab1

val NOT_CHAR_WORDS = Regex("//W+")
fun isPalindrome(userInput: String): Boolean {
    val cleanedString = userInput.replace(NOT_CHAR_WORDS, "").replace(" ", "").toLowerCase()
    return cleanedString == cleanedString.reversed()
}