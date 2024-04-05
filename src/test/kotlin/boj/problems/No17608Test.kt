package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17608Test : StringSpec({
    "막대기 : https://www.acmicpc.net/problem/17608" {
        val testCases = listOf(
            """
                6
                6
                9
                7
                6
                4
                6
            """.trimIndent()
                to "3",
            """
                5
                5
                4
                3
                2
                1
            """.trimIndent()
                to "5"
        )

        testCases.forEach { (given, expected) ->
            No17608().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
