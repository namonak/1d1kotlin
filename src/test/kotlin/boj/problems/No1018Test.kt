package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1018Test : StringSpec({
    "체스판 다시 칠하기 : https://www.acmicpc.net/problem/1018" {
        val testCases = listOf(
            """
                8 8
                WBWBWBWB
                BWBWBWBW
                WBWBWBWB
                BWBBBWBW
                WBWBWBWB
                BWBWBWBW
                WBWBWBWB
                BWBWBWBW
            """.trimIndent()
                to 1,
            """
                10 13
                BBBBBBBBWBWBW
                BBBBBBBBBWBWB
                BBBBBBBBWBWBW
                BBBBBBBBBWBWB
                BBBBBBBBWBWBW
                BBBBBBBBBWBWB
                BBBBBBBBWBWBW
                BBBBBBBBBWBWB
                WWWWWWWWWWBWB
                WWWWWWWWWWBWB
            """.trimIndent()
                to 12,
            """
                8 8
                BWBWBWBW
                WBWBWBWB
                BWBWBWBW
                WBWBWBWB
                BWBWBWBW
                WBWBWBWB
                BWBWBWBW
                WBWBWBWB
            """.trimIndent()
                to 0,
            """
                9 23
                BBBBBBBBBBBBBBBBBBBBBBB
                BBBBBBBBBBBBBBBBBBBBBBB
                BBBBBBBBBBBBBBBBBBBBBBB
                BBBBBBBBBBBBBBBBBBBBBBB
                BBBBBBBBBBBBBBBBBBBBBBB
                BBBBBBBBBBBBBBBBBBBBBBB
                BBBBBBBBBBBBBBBBBBBBBBB
                BBBBBBBBBBBBBBBBBBBBBBB
                BBBBBBBBBBBBBBBBBBBBBBW
            """.trimIndent()
                to 31,
            """
                10 10
                BBBBBBBBBB
                BBWBWBWBWB
                BWBWBWBWBB
                BBWBWBWBWB
                BWBWBWBWBB
                BBWBWBWBWB
                BWBWBWBWBB
                BBWBWBWBWB
                BWBWBWBWBB
                BBBBBBBBBB
            """.trimIndent()
                to 0,
            """
                8 8
                WBWBWBWB
                BWBWBWBW
                WBWBWBWB
                BWBBBWBW
                WBWBWBWB
                BWBWBWBW
                WBWBWWWB
                BWBWBWBW
            """.trimIndent()
                to 2,
            """
                11 12
                BWWBWWBWWBWW
                BWWBWBBWWBWW
                WBWWBWBBWWBW
                BWWBWBBWWBWW
                WBWWBWBBWWBW
                BWWBWBBWWBWW
                WBWWBWBBWWBW
                BWWBWBWWWBWW
                WBWWBWBBWWBW
                BWWBWBBWWBWW
                WBWWBWBBWWBW
            """.trimIndent()
                to 15
        )

        testCases.forEach { (given, expected) ->
            No1018.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
