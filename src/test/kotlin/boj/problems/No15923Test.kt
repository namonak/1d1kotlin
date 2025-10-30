package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15923Test : StringSpec({
    "욱제는 건축왕이야!! : https://www.acmicpc.net/problem/15923" {
        val testCases = listOf(
            """
                4
                10 10
                10 40
                40 40
                40 10
            """.trimIndent() to "120",
            """
                8
                0 0
                6 0
                6 6
                4 6
                4 8
                2 8
                2 6
                0 6
            """.trimIndent() to "28"
        )

        testCases.forEach { (given, expected) ->
            No15923().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
