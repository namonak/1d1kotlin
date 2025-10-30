package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1358Test : StringSpec({
    "하키 : https://www.acmicpc.net/problem/1358" {
        val testCases = listOf(
            """
                20 10 5 0 3
                15 5
                1 5
                1 1
            """.trimIndent() to "2",
            """
                20 10 0 0 14
                -5 5
                -4 2
                -4 8
                -3 1
                -3 9
                0 0
                0 10
                20 0
                20 10
                23 1
                23 9
                24 2
                24 8
                25 5
            """.trimIndent() to "14",
            """
                52 84 -44 66 10
                26 118
                -33 106
                -49 128
                40 114
                -10 101
                47 85
                25 142
                -16 140
                -82 126
                7 145
            """.trimIndent() to "8",
            """
                24 100 -62 71 8
                -63 109
                -26 164
                -9 91
                -113 80
                -124 75
                -95 140
                -89 116
                -55 113
            """.trimIndent() to "6"
        )

        testCases.forEach { (given, expected) ->
            No1358().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
