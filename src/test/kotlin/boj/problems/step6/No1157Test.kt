package boj.problems.step6

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No1157Test : StringSpec({
    "단어 공부 테스트" {
        // Define the test cases as a Table
        val testCases = listOf(
            row("Mississipi", "?"),
            row("zZa", "Z"),
            row("z", "Z"),
            row("baaa", "A")
        )

        // Run each test case
        testCases.forEach { (input, expected) ->
            // Run the test
            val actual = No1157.solve(BufferedReader(StringReader(input))).toString()

            // Verify the result
            actual shouldBe expected
        }
    }
})
