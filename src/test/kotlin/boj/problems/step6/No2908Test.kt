package boj.problems.step6

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No2908Test : StringSpec() {
    init {
        "상수 : https://www.acmicpc.net/problem/2908" {
            // Define the test cases as a Table
            val testCases = listOf(
                TestCaseData("734 893", 437),
                TestCaseData("221 231", 132),
                TestCaseData("839 237", 938)
            )

            testCases.forEach { testCase ->
                val given = testCase.given
                val expected = testCase.expected

                val actual = No2908.solve(BufferedReader(StringReader(given)))

                actual shouldBe expected
            }
        }
    }

    // Define a data class to represent each test case
    data class TestCaseData(val given: String, val expected: Int)
}
