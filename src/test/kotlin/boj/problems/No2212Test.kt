package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2212Test : StringSpec({
    "센서 : https://www.acmicpc.net/problem/2212" {
        val testCases = listOf(
            """
                6
                2
                1 6 9 3 6 7
            """.trimIndent()
                to "5",
            """
                10
                5
                20 3 14 6 7 8 18 10 12 15
            """.trimIndent()
                to "7"
        )

        testCases.forEach { (given, expected) ->
            No2212().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
