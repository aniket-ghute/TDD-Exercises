package com.noovosoft.training.tddjavacrash.lab1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class CalculateFactorialTest {
    @ParameterizedTest
    @MethodSource("provide test case data to CalculateFactorialTest")
    fun `testing function to calculate factorial`(expectedResult: Int, Input: Int) {
        Assertions.assertEquals(expectedResult, calculateFactorial(Input))
    }

    companion object {
        @JvmStatic
        fun `provide test case data to CalculateFactorialTest`(): Stream<Arguments> =
                Stream.of(
                        Arguments.of(-1, -5),
                        Arguments.of(1, 0),
                        Arguments.of(120, 5),
                        Arguments.of(5040, 7)
                )
    }
}
