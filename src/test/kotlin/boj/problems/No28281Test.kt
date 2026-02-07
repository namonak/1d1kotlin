package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No28281Test : StringSpec({
    "선물 : https://www.acmicpc.net/problem/28281" {
        val testCases = listOf(
            """
                5 10
                9 2 5 7 6
            """.trimIndent() to "70",
            """
                7 142857
                22 35 9 12 25 19 10
            """.trimIndent() to "2999997"
        )

        for ((given, expected) in testCases) {
            No28281().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
