package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2822Test : StringSpec({
    "점수 계산 : https://www.acmicpc.net/problem/2822" {
        val testCases = listOf(
            """
                20
                30
                50
                48
                33
                66
                0
                64
            """.trimIndent() to """
                261
                3 4 5 6 8
            """.trimIndent(),
            """
                20
                0
                50
                80
                77
                110
                56
                48
            """.trimIndent() to """
                373
                3 4 5 6 7
            """.trimIndent(),
            """
                20
                30
                50
                80
                110
                11
                0
                85
            """.trimIndent() to """
                355
                2 3 4 5 8
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No2822().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
