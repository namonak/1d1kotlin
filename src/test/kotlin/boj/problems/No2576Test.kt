package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2576Test : StringSpec({
    "홀수 : https://www.acmicpc.net/problem/2576" {
        val testCases = listOf(
            """
                12
                77
                38
                41
                53
                92
                85
            """.trimIndent() to """
                256
                41
            """.trimIndent(),
            """
                2
                4
                20
                32
                6
                10
                8
            """.trimIndent() to """
                -1
            """.trimIndent(),
        )

        testCases.forEach { (given, expected) ->
            No2576().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
