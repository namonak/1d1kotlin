package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No14888Test : StringSpec({
    "연산자 끼워넣기 : https://www.acmicpc.net/problem/14888" {
        val testCases = listOf(
            """
                2
                5 6
                0 0 1 0
            """.trimIndent() to """
                30
                30
            """.trimIndent(),
            """
                3
                3 4 5
                1 0 1 0
            """.trimIndent() to """
                35
                17
            """.trimIndent(),
            """
                6
                1 2 3 4 5 6
                2 1 1 1
            """.trimIndent() to """
                54
                -24
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No14888().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
