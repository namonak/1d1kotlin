package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1925Test : StringSpec({
    "삼각형 : https://www.acmicpc.net/problem/1925" {
        val testCases = listOf(
            """
                0 0
                -3 -3
                -3 0
            """.trimIndent() to "Jikkak2Triangle",
            """
                1 1
                0 0
                2 100
            """.trimIndent() to "DunkakTriangle",
            """
                10000 10000
                2580 2580
                -10000 -10000
            """.trimIndent() to "X"
        )

        for ((given, expected) in testCases) {
            val result = No1925().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
