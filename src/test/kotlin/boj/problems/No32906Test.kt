package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No32906Test : StringSpec({
    "Triangle on the Axis : https://www.acmicpc.net/problem/32906" {
        val testCases = listOf(
            """
                3
                0 0
                1 0
                2 -3
            """.trimIndent() to "1.5",
            """
                3
                1 0
                2 1
                3 3
            """.trimIndent() to "0"
        )

        testCases.forEach { (given, expected) ->
            val result = No32906().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
