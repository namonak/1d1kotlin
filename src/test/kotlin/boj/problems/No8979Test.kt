package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No8979Test : StringSpec({
    "올림픽 : https://www.acmicpc.net/problem/8979" {
        val testCases = listOf(
            """
                4 3
                1 1 2 0
                2 0 1 0
                3 0 1 0
                4 0 0 1
            """.trimIndent()
                to "2",
            """
                4 2
                1 3 0 0
                3 0 0 2
                4 0 2 0
                2 0 2 0
            """.trimIndent()
                to "2"
        )

        testCases.forEach { (given, expected) ->
            No8979.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
