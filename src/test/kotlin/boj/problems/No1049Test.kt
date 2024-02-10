package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1049Test : StringSpec({
    "기타줄 : https://www.acmicpc.net/problem/1049" {
        val testCases = listOf(
            """
                4 2
                12 3
                15 4
            """.trimIndent()
                to "12",
            """
                10 3
                20 8
                40 7
                60 4
            """.trimIndent()
                to "36",
            """
                15 1
                100 40
            """.trimIndent()
                to "300",
            """
                17 1
                12 3
            """.trimIndent()
                to "36",
            """
                7 2
                10 3
                12 2
            """.trimIndent()
                to "12",
            """
                9 16
                21 25
                77 23
                23 88
                95 43
                96 19
                59 36
                80 13
                51 24
                15 8
                25 61
                21 22
                3 9
                68 68
                67 100
                83 98
                96 57
            """.trimIndent()
                to "6"
        )

        testCases.forEach { (given, expected) ->
            No1049.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
