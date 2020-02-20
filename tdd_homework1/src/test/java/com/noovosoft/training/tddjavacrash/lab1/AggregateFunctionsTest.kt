package com.noovosoft.training.tddjavacrash.lab1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class TestCaseData(val expectedValues: AggregateValues, vararg val numbers: Int)

class AggregateFunctionsTest {
    @ParameterizedTest
    @MethodSource("provide test case data to AggregateFunctionsTest")
    fun `testing aggregate functions`(argument: TestCaseData) {
        Assertions.assertEquals(argument.expectedValues, doAggregateOperations(*argument.numbers))
    }

    companion object {
        @JvmStatic
        fun `provide test case data to AggregateFunctionsTest`() = listOf<TestCaseData>(
                TestCaseData(AggregateValues(1, 1, 1.0f, 1), 1),
                TestCaseData(AggregateValues(1, 1, 1.0f, 2), 1, 1),
                TestCaseData(AggregateValues(5, 8, 6.5f, 4), 5, 6, 7, 8),
                TestCaseData(AggregateValues(35, 98, 71.5f, 4), 35, 56, 97, 98)
        )
    }
}
