package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No27918Test : StringSpec({
    "탁구 경기 : https://www.acmicpc.net/problem/27918" {
        val testCases = listOf(
            """
                5
                D
                P
                P
                D
                D
            """.trimIndent() to "3:2",
            """
                10
                D
                P
                P
                D
                D
                P
                P
                P
                D
                D
            """.trimIndent() to "3:5"
        )

        for ((given, expected) in testCases) {
            No27918().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
