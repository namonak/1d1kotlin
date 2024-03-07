package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No22938Test : StringSpec({
    "백발백준하는 명사수 : https://www.acmicpc.net/problem/22938" {
        val testCases = listOf(
            """
                0 0 1
                1 1 2
            """.trimIndent()
                to "YES",
            """
                0 0 1
                10 10 1
            """.trimIndent()
                to "NO"
        )

        testCases.forEach { (given, expected) ->
            No22938().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
