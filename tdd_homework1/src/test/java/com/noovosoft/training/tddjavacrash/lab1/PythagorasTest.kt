package com.noovosoft.training.tddjavacrash.lab1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class PythagorasTest {
    @ParameterizedTest
    @MethodSource("provide test case data to PythagorasTest")
    fun `testing function to calculate hypotenuse`(expectedValue: Int, firstSide: Int, secondSide: Int) {
        Assertions.assertEquals(expectedValue, calculateHypotenuse(firstSide, secondSide))
    }

    companion object {
        @JvmStatic
        fun `provide test case data to PythagorasTest`(): Stream<Arguments> =
                Stream.of(
                        Arguments.of(0, 0, 0),
                        Arguments.of(0, 1, 0),
                        Arguments.of(0, 0, 1),
                        Arguments.of(5, 3, 4),
                        Arguments.of(10, 8, 6)
                )
    }
}