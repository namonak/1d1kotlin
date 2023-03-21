package boj.problems.step19

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No10773Test : StringSpec({
    "제로" {
        // Define the test cases as a Table
        val testCases = listOf(
            row("4\n3\n0\n4\n0", 0),
            row("10\n1\n3\n5\n4\n0\n0\n7\n0\n0\n6", 7),
            row("0\n0\n0\n", 0)
        )

        // Run each test case
        testCases.forEach { (input, expected) ->
            // Run the test
            val actual = No10773.solve(BufferedReader(StringReader(input)))

            // Verify the result
            actual shouldBe expected
        }
    }
})
