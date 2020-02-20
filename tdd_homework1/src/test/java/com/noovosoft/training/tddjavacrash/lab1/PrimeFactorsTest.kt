package com.noovosoft.training.tddjavacrash.lab1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class TestPrimeFactors {
    @ParameterizedTest
    @MethodSource("provide test case data to TestPrimeFactors")
    fun `testing function to calculate prime factors`(expectedResult: List<Int>, Input: Int) {
        Assertions.assertEquals(expectedResult, calculatePrimeFactors(Input))
    }

    companion object {
        @JvmStatic
        fun `provide test case data to TestPrimeFactors`(): Stream<Arguments> =
                Stream.of(
                        Arguments.of(listOf<Int>(), -5),
                        Arguments.of(listOf<Int>(), 0),
                        Arguments.of(listOf(3, 5), 15),
                        Arguments.of(listOf(2, 2, 3), 12),
                        Arguments.of(listOf(3, 7, 7), 147)
                )
    }
}