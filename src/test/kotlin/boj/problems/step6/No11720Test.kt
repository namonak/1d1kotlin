package boj.problems.step6

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No11720Test : StringSpec({
    "숫자의 합" {
        // Define the test cases as a Table
        val testCases = listOf(
            row("1\n1\n", 1),
            row("5\n54321\n", 15),
            row("25\n7000000000000000000000000\n", 7),
            row("11\n10987654321\n", 46)
        )

        // Run each test case
        testCases.forEach { (input, expected) ->
            // Run the test
            val actual = No11720.solve(BufferedReader(StringReader(input)))

            // Verify the result
            actual shouldBe expected
        }
    }
})
