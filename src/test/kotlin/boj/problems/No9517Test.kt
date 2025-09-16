package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9517Test : StringSpec({
    "아이 러브 크로아티아 : https://www.acmicpc.net/problem/9517" {
        val testCases = listOf(
            """
                1
                5
                20 T
                50 T
                80 T
                50 T
                30 T
            """.trimIndent() to "5",
            """
                3
                5
                100 T
                100 N
                100 T
                100 T
                100 N
            """.trimIndent() to "4",
            """
                5
                6
                70 T
                50 P
                30 N
                50 T
                30 P
                80 T
            """.trimIndent() to "7"
        )

        for ((given, expected) in testCases) {
            val result = No9517().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
