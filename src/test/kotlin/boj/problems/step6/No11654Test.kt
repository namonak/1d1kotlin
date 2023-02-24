package boj.problems.step6

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11654Test : StringSpec() {
    init {
        "아스키 코드 테스트" {
            // Define the test cases as a Table
            val testCases = listOf(
                TestCaseData("A", "65"),
                TestCaseData("C", "67"),
                TestCaseData("0", "48"),
                TestCaseData("9", "57"),
                TestCaseData("a", "97"),
                TestCaseData("z", "122")
            )

            // Run each test case
            testCases.forEach {
                val given = it.given
                val expected = it.expected

                // Create a new instance of the class under test for each test case
                val no11654 = No11654(InputProcessor(), OutputProcessor())

                // Run the test
                val actual = no11654.solve(given)

                // Verify the result
                actual shouldBe expected
            }
        }
    }

    // Define a data class to represent each test case
    data class TestCaseData(val given: String, val expected: String)
}
