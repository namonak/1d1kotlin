package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30999Test : StringSpec({
    "민주주의 : https://www.acmicpc.net/problem/30999" {
        val testCases = listOf(
            """
                2 3
                OOX
                OXX
            """.trimIndent() to "1",
            """
                3 3
                OOX
                OOX
                OOX
            """.trimIndent() to "3",
            """
                3 3
                OXO
                XXO
                OOO
            """.trimIndent() to "2"
        )

        testCases.forEach { (given, expected) ->
            No30999().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
