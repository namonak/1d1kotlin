package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No21965Test : StringSpec({
    "드높은 남산 위에 우뚝 선 : https://www.acmicpc.net/problem/21965" {
        val testCases = listOf(
            """
                5
                1 2 3 4 2
            """.trimIndent() to "YES",
            """
                5
                1 2 3 4 5
            """.trimIndent() to "YES",
            """
                5
                1 2 2 3 1
            """.trimIndent() to "NO"
        )

        testCases.forEach { (given, expected) ->
            No21965().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
