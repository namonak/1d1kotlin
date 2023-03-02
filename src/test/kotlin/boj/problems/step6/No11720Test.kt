package boj.problems.step6

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No11720Test : StringSpec() {
    init {
        "숫자의 합" {
            // Define the test cases as a Table
            val testCases = listOf(
                TestCaseData("1\n1\n", "1"),
                TestCaseData("5\n54321\n", "15"),
                TestCaseData("25\n7000000000000000000000000\n", "7"),
                TestCaseData("11\n10987654321\n", "46")
            )

            // Run each test case
            testCases.forEach {
                val input = it.input
                val expected = it.expected

                // Run the test
                val actual = No11720.solve(BufferedReader(StringReader(input))).toString()

                // Verify the result
                actual shouldBe expected
            }
        }
    }

    // Define a data class to represent each test case
    data class TestCaseData(val input: String, val expected: String)
}
