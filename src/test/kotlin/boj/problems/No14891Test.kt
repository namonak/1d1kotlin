package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14891Test : StringSpec({
    "톱니바퀴 : https://www.acmicpc.net/problem/14891" {
        val testCases = listOf(
            """
                10101111
                01111101
                11001110
                00000010
                2
                3 -1
                1 1
            """.trimIndent() to "7",
            """
                11111111
                11111111
                11111111
                11111111
                3
                1 1
                2 1
                3 1
            """.trimIndent() to "15",
            """
                10001011
                10000011
                01011011
                00111101
                5
                1 1
                2 1
                3 1
                4 1
                1 -1
            """.trimIndent() to "6",
            """
                10010011
                01010011
                11100011
                01010101
                8
                1 1
                2 1
                3 1
                4 1
                1 -1
                2 -1
                3 -1
                4 -1
            """.trimIndent() to "5"
        )

        testCases.forEach { (given, expected) ->
            No14891().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
