package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14890Test : StringSpec({
    "경사로 : https://www.acmicpc.net/problem/14890" {
        val testCases = listOf(
            """
                6 2
                3 3 3 3 3 3
                2 3 3 3 3 3
                2 2 2 3 2 3
                1 1 1 2 2 2
                1 1 1 3 3 1
                1 1 2 3 3 2
            """.trimIndent() to "3",
            """
                6 2
                3 2 1 1 2 3
                3 2 2 1 2 3
                3 2 2 2 3 3
                3 3 3 3 3 3
                3 3 3 3 2 2
                3 3 3 3 2 2
            """.trimIndent() to "7",
            """
                6 3
                3 2 1 1 2 3
                3 2 2 1 2 3
                3 2 2 2 3 3
                3 3 3 3 3 3
                3 3 3 3 2 2
                3 3 3 3 2 2
            """.trimIndent() to "3",
            """
                6 1
                3 2 1 1 2 3
                3 2 2 1 2 3
                3 2 2 2 3 3
                3 3 3 3 3 3
                3 3 3 3 2 2
                3 3 3 3 2 2
            """.trimIndent() to "11"
        )

        testCases.forEach { (given, expected) ->
            No14890().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
