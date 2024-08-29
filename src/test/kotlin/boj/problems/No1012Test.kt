package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1012Test : StringSpec({
    "유기농 배추 : https://www.acmicpc.net/problem/1012" {
        val testCases = listOf(
            """
                2
                10 8 17
                0 0
                1 0
                1 1
                4 2
                4 3
                4 5
                2 4
                3 4
                7 4
                8 4
                9 4
                7 5
                8 5
                9 5
                7 6
                8 6
                9 6
                10 10 1
                5 5
            """.trimIndent() to """
                5
                1
            """.trimIndent(),
            """
                1
                5 3 6
                0 2
                1 2
                2 2
                3 2
                4 2
                4 0
            """.trimIndent() to """
                2
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No1012().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
