package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11652Test : StringSpec({
    "카드 : https://www.acmicpc.net/problem/11652" {
        val testCases = listOf(
            """
                5
                1
                2
                1
                2
                1
            """.trimIndent() to "1",
            """
                6
                1
                2
                1
                2
                1
                2
            """.trimIndent() to "1"
        )

        testCases.forEach { (given, expected) ->
            No11652().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
