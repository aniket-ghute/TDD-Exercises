package com.noovosoft.training.tddjavacrash.lab1

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

class PalindromeTest {
    @ParameterizedTest
    @MethodSource("provide test case data to the PalindromeTest")
    fun `check whether given string is palindrome`(expectedValue: Boolean, givenString: String) {
        assertEquals(expectedValue, isPalindrome(givenString))
    }

    companion object {
        @JvmStatic
        fun `provide test case data to the PalindromeTest`(): Stream<Arguments> =
                Stream.of(
                        Arguments.of(true, ""),
                        Arguments.of(true, "a"),
                        Arguments.of(true, "aa"),
                        Arguments.of(false, "ab"),
                        Arguments.of(true, "Too hot to hoot"),
                        Arguments.of(false, "Hi I am not palindrome")
                )
    }
}