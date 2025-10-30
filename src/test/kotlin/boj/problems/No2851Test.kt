package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2851Test : StringSpec({
    "슈퍼 마리오 : https://www.acmicpc.net/problem/2851" {
        val testCases = listOf(
            """
                10
                20
                30
                40
                50
                60
                70
                80
                90
                100
            """.trimIndent() to "100",
            """
                1
                2
                3
                5
                8
                13
                21
                34
                55
                89
            """.trimIndent() to "87",
            """
                40
                40
                40
                40
                40
                40
                40
                40
                40
                40
            """.trimIndent() to "120"
        )

        testCases.forEach { (given, expected) ->
            No2851().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
