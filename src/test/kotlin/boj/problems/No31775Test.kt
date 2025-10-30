package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No31775Test : StringSpec({
    "글로벌 포닉스 : https://www.acmicpc.net/problem/31775" {
        val testCases = listOf(
            """
                korea
                legend
                postech
            """.trimIndent() to "GLOBAL",
            """
                turing
                dijkstra
                neumann
            """.trimIndent() to "PONIX",
            """
                leo020630
                kwoncycle
                petamingks
            """.trimIndent() to "GLOBAL"
        )

        testCases.forEach { (given, expected) ->
            No31775().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
