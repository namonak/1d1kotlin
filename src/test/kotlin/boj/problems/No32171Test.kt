package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No32171Test : StringSpec({
    "울타리 공사 : https://www.acmicpc.net/problem/32171" {
        val testCases = listOf(
            """
                4
                1 1 3 3
                2 2 4 4
                2 2 3 3
                1 1 4 4
            """.trimIndent() to """
                8
                12
                12
                12
            """.trimIndent(),
            """
                2
                0 0 2 2
                0 0 1 4
            """.trimIndent() to """
                8
                12
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No32171().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
