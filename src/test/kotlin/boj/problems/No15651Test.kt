package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No15651Test : StringSpec({
    "N과 M (3) : https://www.acmicpc.net/problem/15652" {
        val testCases = listOf(
            "3 1" to """
                1
                2
                3
            """.trimIndent(),
            "4 2" to """
                1 1
                1 2
                1 3
                1 4
                2 1
                2 2
                2 3
                2 4
                3 1
                3 2
                3 3
                3 4
                4 1
                4 2
                4 3
                4 4
            """.trimIndent(),
            "3 3" to """
                1 1 1
                1 1 2
                1 1 3
                1 2 1
                1 2 2
                1 2 3
                1 3 1
                1 3 2
                1 3 3
                2 1 1
                2 1 2
                2 1 3
                2 2 1
                2 2 2
                2 2 3
                2 3 1
                2 3 2
                2 3 3
                3 1 1
                3 1 2
                3 1 3
                3 2 1
                3 2 2
                3 2 3
                3 3 1
                3 3 2
                3 3 3
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No15651().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
