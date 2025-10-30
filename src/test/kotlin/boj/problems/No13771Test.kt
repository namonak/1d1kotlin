package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No13771Test : StringSpec({
    "Presents : https://www.acmicpc.net/problem/13771" {
        val testCases = listOf(
            """
                6
                62.95
                18.50
                17.49
                26.30
                58.95
                22.25
            """.trimIndent() to "18.50",
            """
                8
                115.90
                129.99
                106.95
                99.95
                136.18
                117.85
                109.56
                99.99
            """.trimIndent() to "99.99"
        )

        testCases.forEach { (given, expected) ->
            No13771().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
