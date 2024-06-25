package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11508Test : StringSpec({
    "2+1 세일 : https://www.acmicpc.net/problem/11508" {
        val testCases = listOf(
            """
                4
                3
                2
                3
                2
            """.trimIndent() to "8",
            """
                6
                6
                4
                5
                5
                5
                5
            """.trimIndent() to "21"
        )

        testCases.forEach { (given, expected) ->
            No11508().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
