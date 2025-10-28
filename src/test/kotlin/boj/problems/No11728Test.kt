package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11728Test : StringSpec({
    "배열 합치기 : https://www.acmicpc.net/problem/11728" {
        val testCases = listOf(
            """
                2 2
                3 5
                2 9
            """.trimIndent() to "2 3 5 9",
            """
                2 1
                4 7
                1
            """.trimIndent() to "1 4 7",
            """
                4 3
                2 3 5 9
                1 4 7
            """.trimIndent() to "1 2 3 4 5 7 9"
        )

        testCases.forEach { (given, expected) ->
            No11728().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
