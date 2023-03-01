package boj.problems.step19

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No10773Test : StringSpec() {
    init {
        "제로" {
            // Define the test cases as a Table
            val testCases = listOf(
                TestCaseData("4\n3\n0\n4\n0", "0"),
                TestCaseData("10\n1\n3\n5\n4\n0\n0\n7\n0\n0\n6", "7"),
                TestCaseData("0\n0\n0\n", "0")
            )

            // Run each test case
            testCases.forEach {
                val input = it.input
                val expected = it.expected

                // Run the test
                val actual = No10773.solve(BufferedReader(StringReader(input))).toString()

                // Verify the result
                actual shouldBe expected
            }
        }
    }

    // Define a data class to represent each test case
    data class TestCaseData(val input: String, val expected: String)
}
