package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17091Test : StringSpec({
    "단어 시계 : https://www.acmicpc.net/problem/17091" {
        val testCases = listOf(
            """
                5
                47
            """.trimIndent() to "thirteen minutes to six",
            """
                3
                0
            """.trimIndent() to "three o' clock",
            """
                7
                15
            """.trimIndent() to "quarter past seven",
            """
                12
                41
            """.trimIndent() to "nineteen minutes to one"
        )

        for ((given, expected) in testCases) {
            No17091().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
