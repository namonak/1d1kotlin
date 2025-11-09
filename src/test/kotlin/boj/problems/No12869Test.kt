package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No12869Test : StringSpec({
    "뮤탈리스크 : https://www.acmicpc.net/problem/12869" {
        val testCases = listOf(
            """
                3
                12 10 4
            """.trimIndent() to "2",
            """
                3
                54 18 6
            """.trimIndent() to "6",
            """
                1
                60
            """.trimIndent() to "7",
            """
                3
                1 1 1
            """.trimIndent() to "1",
            """
                2
                60 40
            """.trimIndent() to "9"
        )

        for ((given, expected) in testCases) {
            No12869().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
