package boj.problems.step2

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2884Test : StringSpec() {
    init {
        "알람 시계 테스트" {
            // Define the test cases as a Table
            val testCases = listOf(
                TestCaseData("10 10", "9 25"),
                TestCaseData("0 30", "23 45"),
                TestCaseData("23 40", "22 55")
            )

            // Run each test case
            testCases.forEach {
                val input = it.input
                val expected = it.expected

                // Create a new instance of the class under test for each test case
                val no2884 = No2884(InputProcessor(), OutputProcessor())

                // Run the test
                val actual = no2884.solve(input)

                // Verify the result
                actual shouldBe expected
            }
        }
    }

    // Define a data class to represent each test case
    data class TestCaseData(val input: String, val expected: String)
}
