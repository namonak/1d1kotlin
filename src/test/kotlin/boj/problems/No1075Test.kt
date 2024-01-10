package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1075Test : StringSpec({
    "나누기 : https://www.acmicpc.net/problem/1075" {
        val testCases = listOf(
            """
                1000
                3
            """.trimIndent()
                to "02",
            """
                2000000000
                100
            """.trimIndent()
                to "00",
            """
                23442
                75
            """.trimIndent()
                to "00",
            """
                428392
                17
            """.trimIndent()
                to "15",
            """
                32442
                99
            """.trimIndent()
                to "72"
        )

        testCases.forEach { (given, expected) ->
            No1075.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
