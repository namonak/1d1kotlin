package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2178Test : StringSpec({
    "미로 탐색 : https://www.acmicpc.net/problem/2178" {
        val testCases = listOf(
            """
                4 6
                101111
                101010
                101011
                111011
            """.trimIndent() to "15",
            """
                4 6
                110110
                110110
                111111
                111101
            """.trimIndent() to "9",
            """
                2 25
                1011101110111011101110111
                1110111011101110111011101
            """.trimIndent() to "38",
            """
                7 7
                1011111
                1110001
                1000001
                1000001
                1000001
                1000001
                1111111
            """.trimIndent() to "13"
        )

        testCases.forEach { (given, expected) ->
            No2178().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
