package boj.problems.step6

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No1157Test : StringSpec() {
    init {
        "단어 공부 테스트" {
            // Define the test cases as a Table
            val testCases = listOf(
                TestCaseData("Mississipi", "?"),
                TestCaseData("zZa", "Z"),
                TestCaseData("z", "Z"),
                TestCaseData("baaa", "A")
            )

            // Run each test case
            testCases.forEach {
                val input = it.input
                val expected = it.expected

                // Run the test
                val actual = No1157.solve(BufferedReader(StringReader(input))).toString()

                // Verify the result
                actual shouldBe expected
            }
        }
    }

    // Define a data class to represent each test case
    data class TestCaseData(val input: String, val expected: String)
}
