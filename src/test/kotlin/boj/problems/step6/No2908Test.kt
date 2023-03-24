package boj.problems.step6

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No2908Test : StringSpec({
    "상수 : https://www.acmicpc.net/problem/2908" {
        // Define the test cases as a Table
        val testCases = listOf(
            row("734 893", 437),
            row("221 231", 132),
            row("839 237", 938)
        )

        testCases.forEach { (given, expected) ->
            val actual = No2908.solve(BufferedReader(StringReader(given)))

            actual shouldBe expected
        }
    }
})
