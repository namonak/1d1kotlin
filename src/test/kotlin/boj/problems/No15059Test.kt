package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15059Test : StringSpec({
    "Hard choice : https://www.acmicpc.net/problem/15059" {
        val testCases = listOf(
            """
                80 20 40
                45 23 48
            """.trimIndent() to "11",
            """
                0 0 0
                100 100 100
            """.trimIndent() to "300",
            """
                41 42 43
                41 42 43
            """.trimIndent() to "0"
        )

        testCases.forEach { (given, expected) ->
            No15059().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
