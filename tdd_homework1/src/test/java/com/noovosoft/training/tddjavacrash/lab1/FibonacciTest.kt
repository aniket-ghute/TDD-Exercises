package com.noovosoft.training.tddjavacrash.lab1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class FibonacciTest {
    @ParameterizedTest
    @MethodSource("provide test case data to FibonacciTest")
    fun `testing function to calculate fibonacci of a number`(expectedValue: Int, Input: Int) {
        Assertions.assertEquals(expectedValue, findFibonacci(Input))
    }

    companion object {
        @JvmStatic
        fun `provide test case data to FibonacciTest`(): Stream<Arguments> =
                Stream.of(
                        Arguments.of(0, 0),
                        Arguments.of(1, 1),
                        Arguments.of(34, 9),
                        Arguments.of(377, 14)
                )
    }
}
