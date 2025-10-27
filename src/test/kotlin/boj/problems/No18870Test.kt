package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No18870Test : StringSpec({
    "좌표 압축 : https://www.acmicpc.net/problem/18870" {
        val testCases = listOf(
            """
                5
                2 4 -10 4 -9
            """.trimIndent() to "2 3 0 3 1",
            """
                6
                1000 999 1000 999 1000 999
            """.trimIndent() to "1 0 1 0 1 0"
        )

        testCases.forEach { (given, expected) ->
            No18870().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
