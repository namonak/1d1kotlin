package boj.problems.step17

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15649Test : StringSpec() {
    init {
        "N과 M (1)" {
            // Define the test cases as a Table
            val testCases = listOf(
                TestCaseData("3 1", "1\n2\n3"),
                TestCaseData("4 2", "1 2\n1 3\n1 4\n2 1\n2 3\n2 4\n3 1\n3 2\n3 4\n4 1\n4 2\n4 3"),
                TestCaseData("4 4", "1 2 3 4\n1 2 4 3\n1 3 2 4\n1 3 4 2\n1 4 2 3\n1 4 3 2\n2 1 3 4\n2 1 4 3\n2 3 1 4\n2 3 4 1\n2 4 1 3\n2 4 3 1\n3 1 2 4\n3 1 4 2\n3 2 1 4\n3 2 4 1\n3 4 1 2\n3 4 2 1\n4 1 2 3\n4 1 3 2\n4 2 1 3\n4 2 3 1\n4 3 1 2\n4 3 2 1"),
            )

            // Run each test case
            testCases.forEach { testCase ->
                val given = testCase.given
                val expected = testCase.expected

                // Create a new instance of the class under test for each test case
                val no15649 = No15649(InputProcessor(), OutputProcessor())

                // Run the test
                val actual = no15649.solve(given)

                // verify the result
                actual shouldBe expected
            }
        }
    }

    // Define a data class to represent each test case
    data class TestCaseData(val given: String, val expected: String)
}
