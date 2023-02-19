package boj.problems.step2

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14681Test : StringSpec() {
    init {
        "사분면 고르기 테스트" {
            // Define the test cases as a Table
            val testCases = listOf(
                TestCaseData("12\n5\n", "1"),
                TestCaseData("9\n-13\n", "4")
            )

            // Run each test case
            testCases.forEach {
                val input = it.input
                val expected = it.expected

                // Create a new instance of the class under test for each test case
                val no14681 = No14681(InputProcessor14681(), OutputProcessor14681())

                // Run the test
                val actual = no14681.solve(input)

                // Verify the result
                actual shouldBe expected
            }
        }
    }

    // Define a data class to represent each test case
    data class TestCaseData(val input: String, val expected: String)
}
