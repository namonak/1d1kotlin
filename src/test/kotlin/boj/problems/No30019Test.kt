package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30019Test : StringSpec({
    "강의실 예약 시스템 : https://www.acmicpc.net/problem/30019" {
        val testCases = listOf(
            """
                1 3
                1 2 3
                1 3 5
                1 4 6
            """.trimIndent() to """
                YES
                YES
                NO
            """.trimIndent(),
            """
                2 4
                1 1 4
                2 2 5
                1 3 7
                1 5 8
            """.trimIndent() to """
                YES
                YES
                NO
                YES
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No30019().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
