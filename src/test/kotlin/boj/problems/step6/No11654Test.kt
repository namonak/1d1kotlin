package boj.problems.step6

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class No11654Test : StringSpec({
    "아스키 코드 테스트" {
        // Define the test cases as a Table
        val testCases = listOf(
            row("A", "65"),
            row("C", "67"),
            row("0", "48"),
            row("9", "57"),
            row("a", "97"),
            row("z", "122")
        )

        // Run each test case
        testCases.forEach { (given, expected) ->
            // Create a new instance of the class under test for each test case
            val no11654 = No11654(InputProcessor(), OutputProcessor())

            // Run the test
            val actual = no11654.solve(given)

            // Verify the result
            actual shouldBe expected
        }
    }
})
