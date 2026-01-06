package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class No2896Test : StringSpec({
    "무알콜 칵테일 : https://www.acmicpc.net/problem/2896" {
        val testCases = listOf(
            """
                9 9 9
                3 2 1
            """.trimIndent() to "0 3 6",
            """
                10 10 10
                3 3 3
            """.trimIndent() to "0 0 0",
            """
                10 15 18
                3 4 1
            """.trimIndent() to "0 1.666667 14.666667"
        )

        for ((given, expected) in testCases) {
            val result = No2896().solve(given.reader().buffered()).split(" ").map { it.toDouble() }
            val expectedDoubles = expected.split(" ").map { it.toDouble() }

            result.forEachIndexed { index, value ->
                value shouldBe (expectedDoubles[index] plusOrMinus 1e-4)
            }
        }
    }
})
