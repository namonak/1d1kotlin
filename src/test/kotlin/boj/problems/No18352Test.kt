package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No18352Test : StringSpec({
    "특정 거리의 도시 찾기 : https://www.acmicpc.net/problem/18352" {
        val testCases = listOf(
            """
                4 4 2 1
                1 2
                1 3
                2 3
                2 4
            """.trimIndent() to """
                4
            """.trimIndent(),
            """
                4 3 2 1
                1 2
                1 3
                1 4
            """.trimIndent() to """
                -1
            """.trimIndent(),
            """
                4 4 1 1
                1 2
                1 3
                2 3
                2 4
            """.trimIndent() to """
                2
                3
            """.trimIndent()
        )

        for ((given, expected) in testCases) {
            No18352().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
