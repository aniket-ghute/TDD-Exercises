package com.noovosoft.training.tddjavacrash.lab1

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

class FizzBuzzTest {
    @ParameterizedTest
    @MethodSource("provide test case data to FizzBuzzTest")
    fun `testing FizzBuzz function`(expectedValue: Any, inputNumber: Int) {
        assertEquals(expectedValue, fizzBuzz(inputNumber))
    }

    companion object {
        @JvmStatic
        fun `provide test case data to FizzBuzzTest`(): Stream<Arguments> =
                Stream.of(
                        Arguments.of("Fizz", 12),
                        Arguments.of("Buzz", 100),
                        Arguments.of("FizzBuzz", 45),
                        Arguments.of(17, 17),
                        Arguments.of(0, 0)
                )
    }
}