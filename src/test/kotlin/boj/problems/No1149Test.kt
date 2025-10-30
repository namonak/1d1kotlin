package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1149Test : StringSpec({
    "RGB거리 : https://www.acmicpc.net/problem/1149" {
        val testCases = listOf(
            """
                3
                26 40 83
                49 60 57
                13 89 99
            """.trimIndent()
                to "96",
            """
                3
                1 100 100
                100 1 100
                100 100 1
            """.trimIndent()
                to "3",
            """
                3
                1 100 100
                100 100 100
                1 100 100
            """.trimIndent()
                to "102",
            """
                6
                30 19 5
                64 77 64
                15 19 97
                4 71 57
                90 86 84
                93 32 91
            """.trimIndent()
                to "208",
            """
                8
                71 39 44
                32 83 55
                51 37 63
                89 29 100
                83 58 11
                65 13 15
                47 25 29
                60 66 19
            """.trimIndent()
                to "253"
        )

        testCases.forEach { (given, expected) ->
            No1149().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
