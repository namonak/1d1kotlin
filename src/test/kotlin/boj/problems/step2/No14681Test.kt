package boj.problems.step2

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class No14681Test : StringSpec({
    "사분면 고르기 테스트" {
        // Define the test cases as a Table
        val testCases = listOf(
            row("12\n5\n", "1"),
            row("9\n-13\n", "4")
        )

        // Run each test case
        testCases.forEach { (input, expected) ->
            // Create a new instance of the class under test for each test case
            val no14681 = No14681(InputProcessor14681(), OutputProcessor14681())

            // Run the test
            val actual = no14681.solve(input)

            // Verify the result
            actual shouldBe expected
        }
    }
})
