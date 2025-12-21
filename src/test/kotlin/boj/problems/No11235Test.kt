package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11235Test : StringSpec({
    "Polling : https://www.acmicpc.net/problem/11235" {
        val testCases = listOf(
            """
                5
                FRED
                BARNEY
                FRED
                FRED
                BARNEY
            """.trimIndent() to """
                FRED
            """.trimIndent(),
            """
                5
                PORTHOS
                ATHOS
                ARAMIS
                PORTHOS
                ATHOS
            """.trimIndent() to """
                ATHOS
                PORTHOS
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No11235().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
